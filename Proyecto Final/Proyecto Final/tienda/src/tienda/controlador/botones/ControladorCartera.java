package tienda.controlador.botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import tienda.modelo.manejo_datos.ActualizarSaldoCliente;
import tienda.vista.botones.BotonBlanco;

public class ControladorCartera {

	private ActualizarSaldoCliente actualizarSaldoCliente;

	private final BotonBlanco botonIngreso = new BotonBlanco("Ingresar");
	private final BotonBlanco botonRetirar = new BotonBlanco("Retirar");
	private final BotonBlanco botonVolver = new BotonBlanco("Volver");

	public ControladorCartera() {

		botonIngreso.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				actualizarSaldoCliente = new ActualizarSaldoCliente();

				Double saldo = Double.valueOf(JOptionPane.showInputDialog("¿Cuanto quieres ingresar?"));

				actualizarSaldoCliente.ingresarSaldo(saldo);
			}
		});

		botonRetirar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				actualizarSaldoCliente = new ActualizarSaldoCliente();

				Double saldo = Double.valueOf(JOptionPane.showInputDialog("¿Cuanto quieres retirar?"));

				actualizarSaldoCliente.retirarSaldo(saldo);

			}

		});

		botonVolver.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ControladorMenu.volverTiendaCartera();

			}

		});
	}

	public BotonBlanco getBotonIngreso() {
		return botonIngreso;
	}

	public BotonBlanco getBotonRetirar() {
		return botonRetirar;
	}

	public BotonBlanco getBotonVolver() {
		return botonVolver;
	}

}
