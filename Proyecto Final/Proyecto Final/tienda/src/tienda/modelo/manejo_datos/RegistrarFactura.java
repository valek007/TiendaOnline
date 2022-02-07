package tienda.modelo.manejo_datos;

import tienda.controlador.botones.ControladorCarrito;
import tienda.modelo.conexiones.ConexionBD;
import tienda.modelo.objetos.Factura;

public class RegistrarFactura {

	public RegistrarFactura() {

	}

	public void registrarFactura() {

		int id = (int) (Math.random() * (1_000_000 + 1));

		boolean igual = false;

		for (Factura x : RecuperarDatosFacturas.getListaFacturas()) {

			if (x.getId() == id) {
				igual = true;
			}
		}

		if (!igual) {

			ConexionBD conexion = new ConexionBD();

			try {
				String instruSQL1 = "INSERT INTO FACTURAS (id_usuario, id_factura, total_productos, total_precio) VALUES ("
						+ VerificacionUsuarios.getIdUsuario() + "," + id + ","
						+ ControladorCarrito.getCompra().getCantidadProductos() + ","
						+ ControladorCarrito.getCompra().getPrecioTotal() + ")";

				conexion.getDeclaracion().executeUpdate(instruSQL1);
			} catch (Exception e) {
				e.printStackTrace();
				registrarFactura();
			}
		} else {
			registrarFactura();
		}
	}

}
