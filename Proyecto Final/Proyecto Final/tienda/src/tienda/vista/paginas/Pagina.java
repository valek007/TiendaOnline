package tienda.vista.paginas;

import java.awt.Dimension;

import javax.swing.JPanel;

import tienda.Constantes;

public abstract class Pagina extends JPanel {

	private static final long serialVersionUID = 1L;

	public Pagina() {
		setBackground(Constantes.FONDO_PAGINA);
		setPreferredSize(new Dimension(Constantes.ANCHO_VENTANA, Constantes.ALTO_VENTANA));
	}
}
