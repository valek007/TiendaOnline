package tienda.controlador.botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import tienda.vista.botones.BotonAdd;
import tienda.vista.botones.BotonCeleste;

public class ControladorTienda {

	private static BotonAdd botonAdd = new BotonAdd("Añadir");
	private BotonCeleste botonCarrito = new BotonCeleste("Mi Carrito");

	public ControladorTienda() {

		botonAdd.setName("add");

		botonCarrito.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ControladorMenu.accederCarrito();
			}
		});
	}

	public static JButton obtenerBotonAdd() {
		return botonAdd;
	}

	public JButton obtenerBotonPedidos() {
		return botonCarrito;
	}

}
