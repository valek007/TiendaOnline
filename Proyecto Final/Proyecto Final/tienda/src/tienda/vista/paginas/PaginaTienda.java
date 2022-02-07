package tienda.vista.paginas;

import java.awt.BorderLayout;

import tienda.vista.menus.MenuUsuario;
import tienda.vista.tablas.TablaTienda;

public class PaginaTienda extends Pagina {

	private static final long serialVersionUID = 1L;

	private final MenuUsuario menuUsuario = new MenuUsuario();
	private final TablaTienda tablaProductos = new TablaTienda();

	public PaginaTienda() {
		super();

		add(menuUsuario, BorderLayout.NORTH);
		add(tablaProductos);

	}
}
