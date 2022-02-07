package tienda.vista.paginas;

import java.awt.BorderLayout;

import tienda.Constantes;
import tienda.vista.formularios.FormularioRegistro;

public class PaginaRegistro extends Pagina {

	private static final long serialVersionUID = 1L;

	private final FormularioRegistro formularioRegistro = new FormularioRegistro();

	public PaginaRegistro() {
		formularioRegistro.setBounds((Constantes.ANCHO_VENTANA / 4) - 20, 20, 400, 450);
		add(formularioRegistro, BorderLayout.CENTER);
		setLayout(null);

	}

}
