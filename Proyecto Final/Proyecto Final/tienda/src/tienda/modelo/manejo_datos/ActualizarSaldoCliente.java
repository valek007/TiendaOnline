package tienda.modelo.manejo_datos;

import javax.swing.JOptionPane;

import tienda.controlador.botones.ControladorMenu;
import tienda.modelo.conexiones.ConexionBD;
import tienda.vista.formularios.FormularioCartera;

public class ActualizarSaldoCliente {

	private static ConexionBD conexion;

	public void ingresarSaldo(Double saldo) {

		conexion = new ConexionBD();

		Double saldoNuevo = RecuperarDatosCliente.getSaldo() + saldo;
		RecuperarDatosCliente.setSaldo(saldoNuevo);

		try {
			String instruSQL1 = "UPDATE CLIENTES SET saldo = '" + saldoNuevo + "' WHERE id_cliente = "
					+ VerificacionUsuarios.getIdUsuario();

			conexion.getDeclaracion().executeUpdate(instruSQL1);
		} catch (Exception e) {
			e.printStackTrace();
		}

		ControladorMenu.accederCartera();
	}

	public void retirarSaldo(Double saldo) {

		conexion = new ConexionBD();

		if (!(FormularioCartera.getCampoiban().getText().isEmpty()
				|| FormularioCartera.getCampobic().getText().isEmpty()
				|| FormularioCartera.getCampoiban().getText().length() < 24)) {

			Double saldoNuevo = RecuperarDatosCliente.getSaldo() - saldo;
			RecuperarDatosCliente.setSaldo(saldoNuevo);

			try {
				String instruSQL1 = "UPDATE CLIENTES SET saldo = '" + saldoNuevo + "' WHERE id_cliente = "
						+ VerificacionUsuarios.getIdUsuario();

				conexion.getDeclaracion().executeUpdate(instruSQL1);
			} catch (Exception e) {
				e.printStackTrace();
			}

			ControladorMenu.accederCartera();

		} else {
			JOptionPane.showMessageDialog(null, "Los datos introducidos no son correctos");
		}
	}

	public void actualizarSaldo(Double precioTotal) {

		conexion = new ConexionBD();

		Double saldoNuevo = RecuperarDatosCliente.getSaldo() - precioTotal;
		RecuperarDatosCliente.setSaldo(saldoNuevo);

		if (precioTotal != 0) {
			try {
				String instruSQL1 = "UPDATE CLIENTES SET saldo = '" + saldoNuevo + "' WHERE id_cliente = "
						+ VerificacionUsuarios.getIdUsuario();

				conexion.getDeclaracion().executeUpdate(instruSQL1);
				ControladorMenu.accederFactura();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
