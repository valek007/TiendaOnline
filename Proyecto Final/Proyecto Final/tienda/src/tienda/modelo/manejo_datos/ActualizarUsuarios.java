package tienda.modelo.manejo_datos;

import tienda.controlador.botones.ControladorInicio;
import tienda.modelo.conexiones.ConexionBD;
import tienda.vista.formularios.FormularioDatosPerfil;

public class ActualizarUsuarios {

	public ActualizarUsuarios() {

	}

	public void actualizarUsuarios() {

		ConexionBD conexion = new ConexionBD();

		try {
			String instruSQL1 = "UPDATE USUARIOS SET nick = '" + FormularioDatosPerfil.getCampos()[0].getText()
					+ "', password= '" + FormularioDatosPerfil.getCampos()[1].getText() + "', email = '"
					+ FormularioDatosPerfil.getCampos()[2].getText() + "' WHERE id_usuario = "
					+ ControladorInicio.getIdUsuario();

			String instruSQL2 = "UPDATE CLIENTES SET nombres = '" + FormularioDatosPerfil.getCampos()[3].getText()
					+ "', apellidos = '" + FormularioDatosPerfil.getCampos()[4].getText() + "', pais = '"
					+ FormularioDatosPerfil.getCampos()[5].getText() + "', ciudad = '"
					+ FormularioDatosPerfil.getCampos()[6].getText() + "', direccion = '"
					+ FormularioDatosPerfil.getCampos()[7].getText() + "', codigo_postal = '"
					+ FormularioDatosPerfil.getCampos()[8].getText() + "', telefono = '"
					+ FormularioDatosPerfil.getCampos()[9].getText() + "' WHERE id_cliente = "
					+ ControladorInicio.getIdUsuario();

			conexion.getDeclaracion().executeUpdate(instruSQL1);
			conexion.getDeclaracion().executeUpdate(instruSQL2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
