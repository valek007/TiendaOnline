package tienda.modelo.conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import tienda.Constantes;

public class ConexionBD {

	private static String driver = Constantes.BD_DRIVER;
	private static String root = Constantes.BD_ROOT;
	private static String password = Constantes.BD_ROOT_PASS;

	private Statement declaracion;

	public ConexionBD() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection(driver, root, password);
			declaracion = conexion.createStatement();
		} catch (ClassNotFoundException | SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error de Acceso:\n No hay conexion a la base de datos\n:" + ex,
					"Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public Statement getDeclaracion() {
		return declaracion;
	}

}
