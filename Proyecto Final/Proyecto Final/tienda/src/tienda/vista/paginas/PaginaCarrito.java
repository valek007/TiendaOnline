package tienda.vista.paginas;

import java.awt.BorderLayout;

import tienda.vista.menus.MenuUsuario;
import tienda.vista.tablas.TablaCarrito;

public class PaginaCarrito extends Pagina {

	private static final long serialVersionUID = 1L;

	private final MenuUsuario menuUsuario = new MenuUsuario();
	private final TablaCarrito tablaPedidos = new TablaCarrito();

	public PaginaCarrito() {

		add(menuUsuario, BorderLayout.NORTH);
		add(tablaPedidos);

	}

}
