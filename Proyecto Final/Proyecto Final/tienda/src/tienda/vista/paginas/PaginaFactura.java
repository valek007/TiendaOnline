package tienda.vista.paginas;

import tienda.vista.tablas.paneles.PanelFactura;

public class PaginaFactura extends Pagina {

	private static final long serialVersionUID = 1L;

	private PanelFactura panelFactura = new PanelFactura();

	public PaginaFactura() {
		add(panelFactura);
		setLayout(null);
	}
}
