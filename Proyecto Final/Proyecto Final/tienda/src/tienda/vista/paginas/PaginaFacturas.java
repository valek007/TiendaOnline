package tienda.vista.paginas;

import tienda.vista.tablas.paneles.PanelFacturas;

public class PaginaFacturas extends Pagina {

	private static final long serialVersionUID = 1L;

	private PanelFacturas panelFacturas = new PanelFacturas();

	public PaginaFacturas() {
		add(panelFacturas);
		setLayout(null);
	}

}
