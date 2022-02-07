package tienda.modelo.manejo_datos;

import java.sql.ResultSet;

import tienda.modelo.conexiones.ConexionBD;

public class RecuperarDatosUsuario {

	private final String idUsuario;

	public RecuperarDatosUsuario(final String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String[] recuperarDatosUsuario() {

		ConexionBD conexion = new ConexionBD();

		String[] datosUsuario = new String[10];

		try {
			String instruSQL1 = "SELECT * FROM USUARIOS WHERE id_usuario = " + idUsuario;

			String instruSQL2 = "SELECT * FROM CLIENTES WHERE id_cliente = " + idUsuario;

			ResultSet resultado = conexion.getDeclaracion().executeQuery(instruSQL1);

			while (resultado.next()) {
				datosUsuario[0] = resultado.getString(2);
				datosUsuario[1] = resultado.getString(3);
				datosUsuario[2] = resultado.getString(4);
			}

			resultado = conexion.getDeclaracion().executeQuery(instruSQL2);
			while (resultado.next()) {

				datosUsuario[3] = resultado.getString(2);
				datosUsuario[4] = resultado.getString(3);
				datosUsuario[5] = resultado.getString(4);
				datosUsuario[6] = resultado.getString(5);
				datosUsuario[7] = resultado.getString(6);
				datosUsuario[8] = resultado.getString(7);
				datosUsuario[9] = resultado.getString(8);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return datosUsuario;
	}

}
