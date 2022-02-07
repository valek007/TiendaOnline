package tienda.vista.tablas;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

import tienda.controlador.botones.ControladorCarrito;
import tienda.controlador.raton.ControladorCarritoRaton;
import tienda.modelo.manejo_datos.RecuperarDatosCarrito;
import tienda.modelo.objetos.Producto;
import tienda.vista.tablas.paneles.PanelTabla;

public class TablaCarrito extends PanelTabla {

	private static final long serialVersionUID = 1L;

	private static ArrayList<Producto> listaPedidos;

	private ControladorCarrito controladorCarrito = new ControladorCarrito();
	private RenderizadoTabla renderizadoTabla = new RenderizadoTabla();
	private ControladorCarritoRaton controladorCarritoRaton;
	private RecuperarDatosCarrito recuperarDatosCarrito;

	private JTable tablaCarrito = new JTable();
	private TableColumnModel columnModel = tablaCarrito.getColumnModel();

	public TablaCarrito() {

		controladorCarritoRaton = new ControladorCarritoRaton(tablaCarrito);
		listaPedidos = ControladorCarritoRaton.obtenerListaCarrito();
		recuperarDatosCarrito = new RecuperarDatosCarrito();
		recuperarDatosCarrito.consultaPedidos(listaPedidos);

		tablaCarrito.getTableHeader().setReorderingAllowed(false);
		tablaCarrito.setDefaultRenderer(Object.class, renderizadoTabla);
		tablaCarrito.setModel(recuperarDatosCarrito.getModelo());

		columnModel.getColumn(0).setPreferredWidth(5);
		columnModel.getColumn(1).setPreferredWidth(150);
		columnModel.getColumn(2).setPreferredWidth(40);
		columnModel.getColumn(3).setPreferredWidth(20);
		columnModel.getColumn(4).setPreferredWidth(50);
		columnModel.getColumn(5).setPreferredWidth(5);

		tablaCarrito.addMouseListener(controladorCarritoRaton);

		add(new JScrollPane(tablaCarrito), BorderLayout.CENTER);
		add(controladorCarrito.obtenerBotonVolver(), BorderLayout.SOUTH);
		add(controladorCarrito.obtenerBotonComprar(), BorderLayout.SOUTH);

		validate();
	}

	public static ArrayList<Producto> getListaPedidos() {
		return listaPedidos;
	}
}
