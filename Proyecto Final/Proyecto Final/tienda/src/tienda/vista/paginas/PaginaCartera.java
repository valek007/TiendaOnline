package tienda.vista.paginas;

import tienda.Constantes;
import tienda.vista.formularios.FormularioCartera;

public class PaginaCartera extends Pagina {

	private static final long serialVersionUID = 1L;

	private final FormularioCartera formularioCartera = new FormularioCartera();

	public PaginaCartera() {
		super();
		formularioCartera.setBounds((Constantes.ANCHO_VENTANA / 4) - 25, 50, 400, 375);
		add(formularioCartera);
		setLayout(null);
	}

}
