package tienda.vista;

import javax.swing.JFrame;

import tienda.Constantes;
import tienda.ElementosPrincipales;

public class GestorVentana extends JFrame {

	private static final long serialVersionUID = 1L;

	private int ancho = Constantes.ANCHO_VENTANA;
	private int alto = Constantes.ALTO_VENTANA;

	public GestorVentana(final String titulo) {

		setTitle(titulo);
		setBounds((Constantes.ANCHO_PANTALLA / 2) - (ancho / 2), (Constantes.ALTO_PANTALLA / 4) - (alto / 2), ancho,
				alto);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setFocusable(true);
		requestFocus();

		getContentPane().add(ElementosPrincipales.paginaInicio);
		pack();

	}

	public void empezar() {
		setVisible(true);
	}
}
