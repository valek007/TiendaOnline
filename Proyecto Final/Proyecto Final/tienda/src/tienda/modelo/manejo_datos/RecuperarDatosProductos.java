package tienda.modelo.manejo_datos;

import java.sql.ResultSet;

import javax.swing.table.DefaultTableModel;

import tienda.controlador.botones.ControladorTienda;
import tienda.modelo.conexiones.ConexionBD;

public class RecuperarDatosProductos {

	private static ResultSet resultado;
	private DefaultTableModel modelo;

	public RecuperarDatosProductos() {
		consultaProductos();
	}

	public void consultaProductos() {

		modelo = new DefaultTableModel() {

			private static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}

		};

		ConexionBD conexion = new ConexionBD();

		try {

			String instruSQL = "SELECT * FROM PRODUCTOS";
			resultado = conexion.getDeclaracion().executeQuery(instruSQL);

			modelo.setColumnIdentifiers(new Object[] { "ID", "Nombre", "Cantidad", "Precio", "Carrito" });

			while (resultado.next()) {
				modelo.addRow(new Object[] { resultado.getString(1), resultado.getString(2), resultado.getString(3),
						resultado.getString(4), ControladorTienda.obtenerBotonAdd() });
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public DefaultTableModel getModelo() {
		return modelo;
	}
}
