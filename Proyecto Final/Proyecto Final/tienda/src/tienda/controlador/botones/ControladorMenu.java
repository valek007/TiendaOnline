package tienda.controlador.botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import tienda.ElementosPrincipales;
import tienda.controlador.raton.ControladorTiendaRaton;
import tienda.vista.paginas.PaginaCarrito;
import tienda.vista.paginas.PaginaCartera;
import tienda.vista.paginas.PaginaFactura;
import tienda.vista.paginas.PaginaFacturas;
import tienda.vista.paginas.PaginaMisDatos;

public class ControladorMenu {

	private final JMenuItem mostrar = new JMenuItem("Mostrar");
	private final JMenuItem salir = new JMenuItem("Salir");

	private final JMenuItem misDatos = new JMenuItem("Mis Datos");
	private final JMenuItem carrito = new JMenuItem("Carrito");
	private final JMenuItem cartera = new JMenuItem("Cartera");
	private final JMenuItem seguimiento = new JMenuItem("Seguimiento");
	private final JMenuItem facturas = new JMenuItem("Facturas");
	private final JMenuItem cerrarSesion = new JMenuItem("Cerrar Session");

	private static PaginaMisDatos paginaMisDatos;
	private static PaginaFactura paginaFactura;
	private static PaginaFacturas paginaFacturas;
	private static PaginaCarrito paginaCarrito;
	private static PaginaCartera paginaCartera;

	public ControladorMenu() {

		mostrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mostrarTienda();
			}
		});

		salir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		carrito.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				accederCarrito();
			}
		});

		cartera.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				accederCartera();

			}
		});

		misDatos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				paginaMisDatos = new PaginaMisDatos();

				if (paginaCarrito != null)
					paginaCarrito.setVisible(false);

				ElementosPrincipales.paginaTienda.setVisible(false);
				paginaMisDatos.setVisible(true);

				ElementosPrincipales.gestorVentana.add(paginaMisDatos);
				ElementosPrincipales.gestorVentana.validate();
			}
		});

		facturas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				paginaFacturas = new PaginaFacturas();

				if (paginaCarrito != null)
					paginaCarrito.setVisible(false);

				if (paginaFacturas != null)
					paginaFacturas.setVisible(false);

				ElementosPrincipales.paginaTienda.setVisible(false);
				paginaFacturas.setVisible(true);

				ElementosPrincipales.gestorVentana.add(paginaFacturas);
				ElementosPrincipales.gestorVentana.validate();
			}
		});

		cerrarSesion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (paginaCarrito != null)
					paginaCarrito.setVisible(false);

				ElementosPrincipales.paginaTienda.setVisible(false);
				ElementosPrincipales.paginaInicio.setVisible(true);

				ElementosPrincipales.gestorVentana.add(ElementosPrincipales.paginaInicio);
				ElementosPrincipales.gestorVentana.validate();

				ControladorTiendaRaton.obtenerListaProductos().clear();
			}
		});

	}

	public static void accederCarrito() {

		if (paginaCarrito != null)
			paginaCarrito.setVisible(false);

		paginaCarrito = new PaginaCarrito();

		if (paginaMisDatos != null)
			paginaMisDatos.setVisible(false);

		if (paginaFacturas != null)
			paginaFacturas.setVisible(false);

		if (paginaCartera != null)
			paginaCartera.setVisible(false);

		ElementosPrincipales.paginaTienda.setVisible(false);
		paginaCarrito.setVisible(true);

		ElementosPrincipales.gestorVentana.add(paginaCarrito);
		ElementosPrincipales.gestorVentana.validate();
	}

	public static void accederCartera() {

		if (paginaCartera != null)
			paginaCartera.setVisible(false);

		paginaCartera = new PaginaCartera();

		if (paginaMisDatos != null)
			paginaMisDatos.setVisible(false);

		if (paginaFacturas != null)
			paginaFacturas.setVisible(false);

		if (paginaCarrito != null)
			paginaCarrito.setVisible(false);

		ElementosPrincipales.paginaTienda.setVisible(false);
		paginaCartera.setVisible(true);

		ElementosPrincipales.gestorVentana.add(paginaCartera);
		ElementosPrincipales.gestorVentana.validate();
	}

	public static void mostrarTienda() {

		paginaCarrito.setVisible(false);
		ElementosPrincipales.paginaTienda.setVisible(true);

		ElementosPrincipales.gestorVentana.add(ElementosPrincipales.paginaTienda);
		ElementosPrincipales.gestorVentana.validate();
	}

	public static void accederFactura() {

		if (paginaFactura != null)
			paginaFactura.setVisible(false);

		paginaFactura = new PaginaFactura();

		paginaCarrito.setVisible(false);
		paginaFactura.setVisible(true);

		ElementosPrincipales.gestorVentana.add(paginaFactura);
		ElementosPrincipales.gestorVentana.validate();
	}

	public static void volverCarritoFactura() {

		paginaFactura.setVisible(false);
		paginaCarrito.setVisible(true);

		ElementosPrincipales.gestorVentana.add(paginaCarrito);
		ElementosPrincipales.gestorVentana.validate();

	}

	public static void volverTiendaFacturas() {

		paginaFacturas.setVisible(false);
		ElementosPrincipales.paginaTienda.setVisible(true);

		ElementosPrincipales.gestorVentana.add(ElementosPrincipales.paginaTienda);
		ElementosPrincipales.gestorVentana.validate();

	}

	public static void volverTiendaCartera() {

		paginaCartera.setVisible(false);
		ElementosPrincipales.paginaTienda.setVisible(true);

		ElementosPrincipales.gestorVentana.add(ElementosPrincipales.paginaTienda);
		ElementosPrincipales.gestorVentana.validate();

	}

	public static PaginaMisDatos getPaginaMisDatos() {
		return paginaMisDatos;
	}

	public static PaginaCarrito getPaginaCarrito() {
		return paginaCarrito;
	}

	public JMenuItem obtenerAyuda() {
		return mostrar;
	}

	public JMenuItem obtenerSalir() {
		return salir;
	}

	public JMenuItem obtenerMisDatos() {
		return misDatos;
	}

	public JMenuItem obtenerCarrito() {
		return carrito;
	}

	public JMenuItem obtenerCartera() {
		return cartera;
	}

	public JMenuItem obtenerSeguimiento() {
		return seguimiento;
	}

	public JMenuItem obtenerFacturas() {
		return facturas;
	}

	public JMenuItem obtenerCerrarSesion() {
		return cerrarSesion;
	}

}
