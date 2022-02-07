package tienda.vista.paginas;

import java.awt.BorderLayout;

import tienda.Constantes;
import tienda.vista.formularios.FormularioDatosPerfil;

public class PaginaMisDatos extends Pagina {

	private static final long serialVersionUID = 1L;

	private final FormularioDatosPerfil tablaDatosPerfil = new FormularioDatosPerfil();

	public PaginaMisDatos() {
		tablaDatosPerfil.setBounds((Constantes.ANCHO_VENTANA / 4) - 20, 20, 400, 450);
		add(tablaDatosPerfil, BorderLayout.CENTER);
		setLayout(null);
	}

	public FormularioDatosPerfil getTablaDatosPerfil() {
		return tablaDatosPerfil;
	}
}
