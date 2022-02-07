package tienda.controlador.botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import tienda.modelo.manejo_datos.ActualizarSaldoCliente;
import tienda.modelo.manejo_datos.RecuperarDatosCliente;
import tienda.modelo.manejo_datos.RegistrarFactura;
import tienda.vista.botones.BotonCeleste;

public class ControladorFactura {

	private BotonCeleste botonComprar = new BotonCeleste("Realizar Compra");
	private BotonCeleste botonVolver = new BotonCeleste("Volver");

	public ControladorFactura() {

		botonComprar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ActualizarSaldoCliente actualizarSaldoCliente = new ActualizarSaldoCliente();
				RegistrarFactura registrarFactura = new RegistrarFactura();

				if (ControladorCarrito.getCompra().getPrecioTotal() <= RecuperarDatosCliente.getSaldo()) {

					JOptionPane.showMessageDialog(null, "Ha realizado la compra");

					actualizarSaldoCliente.actualizarSaldo(ControladorCarrito.getCompra().getPrecioTotal());

					registrarFactura.registrarFactura();
				} else {

					JOptionPane.showMessageDialog(null, "no tiene suficiente saldo");
				}
			}
		});

		botonVolver.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ControladorMenu.volverCarritoFactura();

			}
		});
	}

	public BotonCeleste obtenerBotonComprar() {
		return botonComprar;
	}

	public BotonCeleste obtenerBotonVolver() {
		return botonVolver;
	}

}
