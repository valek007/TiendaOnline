package tienda.controlador.raton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import tienda.controlador.botones.ControladorMenu;
import tienda.modelo.objetos.Producto;
import tienda.vista.botones.BotonEliminar;

public class ControladorCarritoRaton extends MouseAdapter {

	private JTable tabla;

	private static ArrayList<Producto> listaCarrito;

	public ControladorCarritoRaton(JTable tabla) {
		this.tabla = tabla;
		listaCarrito = ControladorTiendaRaton.obtenerListaProductos();

	}

	@Override
	public void mouseClicked(MouseEvent evento) {

		int columna, fila, numDisponible, disFinal;
		int numCantidad = 0;
		String numProv;

		columna = tabla.getColumnModel().getColumnIndexAtX(evento.getX());
		fila = evento.getY() / tabla.getRowHeight();

		if (fila < tabla.getRowCount() && fila >= 0 && columna < tabla.getColumnCount() && columna >= 0) {
			Object value = tabla.getValueAt(fila, columna);

			if (value instanceof JButton) {
				((BotonEliminar) value).doClick();
				BotonEliminar boton = (BotonEliminar) value;

				if (boton.getName().equals("delete")) {
					int dialogButton = JOptionPane.YES_NO_OPTION;
					JOptionPane.showConfirmDialog(boton, "¿Desea eliminar este artículo del carrito?", "WARNING",
							dialogButton);
					if (dialogButton == JOptionPane.YES_OPTION) {
						listaCarrito.remove(fila);
						ControladorMenu.accederCarrito();
					}
				}
			} else {

				numDisponible = Integer.valueOf("" + tabla.getValueAt(fila, 2));
				numProv = JOptionPane.showInputDialog("Introduce Candidad");
				if (numProv != null)
					numCantidad = Integer.valueOf(numProv);
				disFinal = numDisponible - numCantidad;

				if (!(numCantidad > numDisponible || numCantidad <= 0)) {
					tabla.setValueAt(disFinal, fila, 2);
					tabla.setValueAt(numProv, fila, 4);

					for (Producto x : listaCarrito) {
						if (listaCarrito.get(fila).getId().equals(x.getId())) {
							x.setDisponible(disFinal);
							x.setCantidad(numCantidad);
						}
					}
				} else
					JOptionPane.showMessageDialog(null, "La cantidad no es correcta");
			}

		}

	}

	public static ArrayList<Producto> obtenerListaCarrito() {
		return listaCarrito;
	}
}
