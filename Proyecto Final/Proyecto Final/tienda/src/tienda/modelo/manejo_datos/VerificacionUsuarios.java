package tienda.modelo.manejo_datos;

import java.sql.ResultSet;
import java.util.ArrayList;

import tienda.modelo.conexiones.ConexionBD;
import tienda.modelo.objetos.Usuario;
import tienda.vista.formularios.FormularioInicio;

public class VerificacionUsuarios {

	private static ArrayList<Usuario> usuarios = new ArrayList<>();

	private static String idUsuario;

	public VerificacionUsuarios() {
		consultaUsuarios();
	}

	public void consultaUsuarios() {

		ConexionBD conexion = new ConexionBD();

		try {
			String instSQL = "SELECT * FROM USUARIOS";
			ResultSet resultado = conexion.getDeclaracion().executeQuery(instSQL);
			while (resultado.next()) {
				usuarios.add(new Usuario(resultado.getString(1), resultado.getString(2), resultado.getString(3),
						resultado.getString(4)));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public boolean permisoAcceso() {

		for (Usuario usuario : usuarios) {

			if (usuario.getNick().equals(FormularioInicio.obtenerUsuario().getText())
					&& usuario.getPasssword().equals(revisarPass())) {
				idUsuario = usuario.getId();
				return true;
			}
		}
		return false;
	}

	public String revisarPass() {

		String password = "";
		char[] pass = FormularioInicio.obtenerPassword().getPassword();

		for (int i = 0; i < pass.length; i++) {
			password += "" + pass[i];
		}

		return password;
	}

	public static ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public static String getIdUsuario() {
		return idUsuario;
	}
}
