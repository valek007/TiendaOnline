package tienda.modelo.manejo_datos;

import tienda.modelo.conexiones.ConexionBD;
import tienda.vista.formularios.FormularioRegistro;

public class RegistroUsuarios {

	public RegistroUsuarios() {

	}

	public void registroUsuarios() {

		ConexionBD conexion = new ConexionBD();

		try {
			String instruSQL1 = "INSERT INTO USUARIOS(nick, password, email) VALUES('"
					+ FormularioRegistro.getCampos()[0].getText() + "','" + FormularioRegistro.getCampos()[1].getText()
					+ "','" + FormularioRegistro.getCampos()[2].getText() + "')";

			String instruSQL2 = "INSERT INTO CLIENTES(nombres, apellidos, pais, ciudad, direccion, codigo_postal, telefono, saldo) VALUES('"
					+ FormularioRegistro.getCampos()[3].getText() + "','" + FormularioRegistro.getCampos()[4].getText()
					+ "','" + FormularioRegistro.getCampos()[5].getText() + "','"
					+ FormularioRegistro.getCampos()[6].getText() + "','" + FormularioRegistro.getCampos()[7].getText()
					+ "'," + FormularioRegistro.getCampos()[8].getText() + ","
					+ FormularioRegistro.getCampos()[9].getText() + ", 0)";

			conexion.getDeclaracion().executeUpdate(instruSQL1);
			conexion.getDeclaracion().executeUpdate(instruSQL2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
