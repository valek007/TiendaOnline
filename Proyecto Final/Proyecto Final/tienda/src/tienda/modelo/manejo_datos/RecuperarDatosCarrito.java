package tienda.modelo.manejo_datos;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import tienda.controlador.botones.ControladorCarrito;
import tienda.modelo.objetos.Producto;

public class RecuperarDatosCarrito {

	private DefaultTableModel modelo;

	public RecuperarDatosCarrito() {

	}

	public void consultaPedidos(ArrayList<Producto> listaCarrito) {

		modelo = new DefaultTableModel() {

			private static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable(int row, int column) {

				if (column == 4)
					return true;

				return false;
			}

		};

		modelo.setColumnIdentifiers(new Object[] { "Nº", "Nombre", "Disponible", "Precio", "Cantidad", "" });

		int contador = 0;

		if (listaCarrito.isEmpty())
			return;
		else {

			for (Producto producto : listaCarrito) {
				modelo.addRow(new Object[] { contador, producto.getNombre(), producto.getDisponible(),
						producto.getPrecio(), producto.getCantidad(), ControladorCarrito.obtenerBotonEliminar() });
				contador++;
			}
		}

	}

	public DefaultTableModel getModelo() {
		return modelo;
	}

}
