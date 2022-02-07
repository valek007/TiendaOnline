package tienda.vista.paginas;

import tienda.Constantes;
import tienda.vista.formularios.FormularioInicio;

public class PaginaInicio extends Pagina {

	private static final long serialVersionUID = 1L;

	private final FormularioInicio formularioInicio = new FormularioInicio();

	public PaginaInicio() {
		super();
		formularioInicio.setBounds((Constantes.ANCHO_VENTANA / 4) + 25, Constantes.ALTO_VENTANA / 4, 300, 180);
		add(formularioInicio);
		setLayout(null);
	}
}
