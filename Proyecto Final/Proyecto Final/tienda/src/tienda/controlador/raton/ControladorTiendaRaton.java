package tienda.controlador.raton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import tienda.modelo.objetos.Producto;
import tienda.vista.botones.BotonAdd;

public class ControladorTiendaRaton extends MouseAdapter {

	private JTable tabla;

	private static ArrayList<Producto> listaProductos;

	public ControladorTiendaRaton(JTable tabla) {
		this.tabla = tabla;
		listaProductos = new ArrayList<Producto>();
	}

	@Override
	public void mouseClicked(MouseEvent evento) {
		int columna = tabla.getColumnModel().getColumnIndexAtX(evento.getX());
		int fila = evento.getY() / tabla.getRowHeight();

		if (fila < tabla.getRowCount() && fila >= 0 && columna < tabla.getColumnCount() && columna >= 0) {
			Object value = tabla.getValueAt(fila, columna);
			if (value instanceof JButton) {
				((BotonAdd) value).doClick();
				BotonAdd boton = (BotonAdd) value;

				if (boton.getName().equals("add")) {
					int dialogButton = JOptionPane.YES_NO_OPTION;
					JOptionPane.showConfirmDialog(boton, "¿Añadir al carrito?", "WARNING", dialogButton);
					if (dialogButton == JOptionPane.YES_OPTION) {

						boolean yaPresentado = false;

						Producto producto = new Producto(String.valueOf(tabla.getValueAt(fila, 0)),
								String.valueOf(tabla.getValueAt(fila, 1)),
								Integer.valueOf((String) tabla.getValueAt(fila, 2)),
								Double.valueOf((String) tabla.getValueAt(fila, 3)));

						for (Producto x : listaProductos) {
							if (x.getId() == producto.getId()) {
								yaPresentado = true;
								break;
							}
						}

						if (!yaPresentado)
							listaProductos.add(producto);
					}
				}
			}
		}
	}

	public static ArrayList<Producto> obtenerListaProductos() {
		return listaProductos;
	}
}
