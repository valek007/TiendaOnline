package tienda.vista.menus;

import java.awt.Dimension;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import tienda.Constantes;
import tienda.controlador.botones.ControladorMenu;
import tienda.modelo.manejo_datos.RecuperarDatosFacturas;

public class MenuUsuario extends JPanel {

	private static final long serialVersionUID = 1L;

	private final JMenuBar barra = new JMenuBar();
	private final JMenu tienda = new JMenu("Tienda");
	private final JMenu miPerfil = new JMenu("Mi Perfil");

	private final ControladorMenu controladorMenu = new ControladorMenu();
	private static RecuperarDatosFacturas recuperarDatosFacturas = new RecuperarDatosFacturas();

	public MenuUsuario() {

		setBackground(Constantes.COLOR_MARINO);
		setPreferredSize(new Dimension(Constantes.ANCHO_VENTANA, 30));
		barra.setBounds(10, 12, 110, 20);
		barra.setBackground(Constantes.COLOR_MARINO);

		tienda.add(controladorMenu.obtenerAyuda());
		tienda.add(controladorMenu.obtenerSalir());
		miPerfil.add(controladorMenu.obtenerMisDatos());
		miPerfil.add(controladorMenu.obtenerCarrito());
		miPerfil.add(controladorMenu.obtenerCartera());
		miPerfil.add(controladorMenu.obtenerSeguimiento());
		miPerfil.add(controladorMenu.obtenerFacturas());
		miPerfil.addSeparator();
		miPerfil.add(controladorMenu.obtenerCerrarSesion());
		barra.add(tienda);
		barra.add(miPerfil);

		setLayout(null);

		add(barra);
	}

	public static RecuperarDatosFacturas getRecuperarDatosFacturas() {
		return recuperarDatosFacturas;
	}

}
