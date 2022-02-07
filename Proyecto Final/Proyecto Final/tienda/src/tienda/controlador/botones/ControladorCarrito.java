package tienda.controlador.botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import tienda.ElementosPrincipales;
import tienda.controlador.raton.ControladorCarritoRaton;
import tienda.modelo.objetos.Compra;
import tienda.modelo.objetos.Producto;
import tienda.vista.botones.BotonCeleste;
import tienda.vista.botones.BotonEliminar;

public class ControladorCarrito {

	private static Compra compra;
	private static BotonEliminar botonEliminar = new BotonEliminar();
	private BotonCeleste botonComprar = new BotonCeleste("Comprar");
	private BotonCeleste botonVolver = new BotonCeleste("Volver");

	public ControladorCarrito() {

		botonComprar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (!ControladorCarritoRaton.obtenerListaCarrito().isEmpty()) {

					int cantidadTotal = 0;
					double precioTotal = 0;

					for (Producto x : ControladorCarritoRaton.obtenerListaCarrito()) {
						if (x.getCantidad() != 0) {
							cantidadTotal += x.getCantidad();
							precioTotal += x.getPrecio() * x.getCantidad();
						} else {
							JOptionPane.showMessageDialog(null,
									"Los productos no pueden tener una cantidad equivalente a 0");
							return;
						}
					}

					ElementosPrincipales.idCompra++;

					compra = new Compra(ElementosPrincipales.idCompra, cantidadTotal, precioTotal);

					ElementosPrincipales.listaCompras.add(compra);

					ControladorMenu.accederFactura();

				} else {
					JOptionPane.showMessageDialog(null, "El carrito esta vacio, no se puede continuar");
				}

			}
		});

		botonVolver.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ControladorMenu.mostrarTienda();

			}
		});

		botonEliminar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
	}

	public BotonCeleste obtenerBotonComprar() {
		return botonComprar;
	}

	public BotonCeleste obtenerBotonVolver() {
		return botonVolver;
	}

	public static BotonEliminar obtenerBotonEliminar() {
		return botonEliminar;
	}

	public static Compra getCompra() {
		return compra;
	}
}
