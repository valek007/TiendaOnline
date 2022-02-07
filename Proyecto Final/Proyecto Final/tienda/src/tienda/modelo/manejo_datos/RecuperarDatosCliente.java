package tienda.modelo.manejo_datos;

import java.sql.ResultSet;

import tienda.modelo.conexiones.ConexionBD;
import tienda.modelo.objetos.Cliente;

public class RecuperarDatosCliente {

	private static String idCliente;
	private static double saldo;

	public RecuperarDatosCliente() {

	}

	public static Cliente recuperarDatos() {

		idCliente = VerificacionUsuarios.getIdUsuario();

		Cliente cliente = null;

		ConexionBD conexion = new ConexionBD();

		try {

			String instruSQL1 = "SELECT * FROM CLIENTES WHERE id_cliente = " + idCliente;

			ResultSet resultado = conexion.getDeclaracion().executeQuery(instruSQL1);

			while (resultado.next()) {
				cliente = new Cliente(resultado.getString(1), resultado.getString(2), resultado.getString(3),
						resultado.getDouble(9));
			}

			saldo = cliente.getSaldo();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return cliente;
	}

	public static double getSaldo() {
		return saldo;
	}

	public static void setSaldo(double saldoNuevo) {
		saldo = saldoNuevo;
	}

}
