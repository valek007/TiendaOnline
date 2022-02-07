package tienda.vista.tablas;

import java.awt.BorderLayout;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

import tienda.controlador.botones.ControladorTienda;
import tienda.controlador.raton.ControladorTiendaRaton;
import tienda.modelo.manejo_datos.RecuperarDatosProductos;
import tienda.vista.tablas.paneles.PanelTabla;

public class TablaTienda extends PanelTabla {

	private static final long serialVersionUID = 1L;

	private ControladorTienda controladorTienda = new ControladorTienda();
	private RecuperarDatosProductos datosProductos = new RecuperarDatosProductos();
	private RenderizadoTabla renderizadoTabla = new RenderizadoTabla();

	private JTable tablaProductos = new JTable();
	private TableColumnModel columnModel = tablaProductos.getColumnModel();

	public TablaTienda() {

		tablaProductos.getTableHeader().setReorderingAllowed(false);
		tablaProductos.setDefaultRenderer(Object.class, renderizadoTabla);
		tablaProductos.setModel(datosProductos.getModelo());

		columnModel.getColumn(0).setPreferredWidth(10);
		columnModel.getColumn(1).setPreferredWidth(200);
		columnModel.getColumn(2).setPreferredWidth(30);
		columnModel.getColumn(3).setPreferredWidth(20);
		columnModel.getColumn(4).setPreferredWidth(50);

		tablaProductos.addMouseListener(new ControladorTiendaRaton(tablaProductos));

		add(new JScrollPane(tablaProductos), BorderLayout.CENTER);
		add(controladorTienda.obtenerBotonPedidos(), BorderLayout.SOUTH);
		validate();

	}
}
