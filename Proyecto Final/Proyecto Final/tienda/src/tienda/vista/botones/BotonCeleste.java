package tienda.vista.botones;

import tienda.Constantes;

public class BotonCeleste extends Boton {

	private static final long serialVersionUID = 1L;

	public BotonCeleste(String texto) {

		setText(texto);
		setBackground(Constantes.COLOR_CELESTE);
	}
}
