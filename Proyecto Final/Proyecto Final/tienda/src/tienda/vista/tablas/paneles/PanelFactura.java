package tienda.vista.tablas.paneles;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import tienda.Constantes;
import tienda.controlador.botones.ControladorCarrito;
import tienda.controlador.botones.ControladorFactura;
import tienda.controlador.raton.ControladorCarritoRaton;
import tienda.modelo.manejo_datos.RecuperarDatosCliente;
import tienda.modelo.objetos.Producto;

public class PanelFactura extends JPanel {

	private static final long serialVersionUID = 1L;

	private ControladorFactura controladorFactura = new ControladorFactura();

	private int anchoPanel, altoPanel, margen;
	private double saldoDisponible;
	private JPanel productos = new JPanel();
	private JPanel recibo = new JPanel();
	private JButton botonComprar, botonVolver;

	private JLabel titulo = new JLabel("LISTA DE PRODUCTOS:");
	private JLabel espaciado1 = new JLabel(
			"-----------------------------------------------------------------------------------------------------------------------");
	private JLabel espaciado2 = new JLabel(
			"-----------------------------------------------------------------------------------------------------------------------");
	private JLabel total1 = new JLabel();
	private JLabel total2 = new JLabel();
	private JLabel total3 = new JLabel();
	private JLabel saldo = new JLabel();

	private JTextArea areaProductos = new JTextArea(15, 40);

	public PanelFactura() {

		saldoDisponible = RecuperarDatosCliente.recuperarDatos().getSaldo();

		botonComprar = controladorFactura.obtenerBotonComprar();
		botonVolver = controladorFactura.obtenerBotonVolver();

		total1.setText("Referencia: " + ControladorCarrito.getCompra().getId());
		total2.setText("Cantidad de Productos: " + ControladorCarrito.getCompra().getCantidadProductos());
		total3.setText("Precio Total: " + ControladorCarrito.getCompra().getPrecioTotal() + "€");
		saldo.setText("Saldo Disponible: " + saldoDisponible);

		anchoPanel = Constantes.ANCHO_VENTANA - 200;
		altoPanel = Constantes.ALTO_VENTANA - 50;
		margen = 20;

		areaProductos.append(" Nombre Artículo\t\tCantidad\tPrecio");
		areaProductos.setEditable(false);

		setBackground(Color.WHITE);
		setBounds(Constantes.ANCHO_VENTANA / 7, margen, anchoPanel, altoPanel);

		setLayout(null);

		productos.setBounds(margen, margen, anchoPanel - (margen * 2), (altoPanel / 2) + (margen * 2));
		productos.setBackground(Color.WHITE);
		productos.add(titulo);
		productos.add(espaciado1);
		agregarListaArea();
		productos.add(new JScrollPane(areaProductos));

		recibo.setBounds(margen, (altoPanel / 2) + (margen * 5), anchoPanel - (margen * 2), altoPanel / 7);
		recibo.setBackground(Color.WHITE);
		recibo.add(espaciado2);
		recibo.add(total1);
		recibo.add(total2);
		recibo.add(total3);
		recibo.add(saldo);

		botonComprar.setBounds(margen, altoPanel - (margen * 2), 130, 20);
		botonVolver.setBounds(margen + 150, altoPanel - (margen * 2), 80, 20);

		add(productos);
		add(recibo);
		add(botonComprar);
		add(botonVolver);
	}

	private void agregarListaArea() {

		for (Producto x : ControladorCarritoRaton.obtenerListaCarrito()) {
			areaProductos.append("\n " + x.getNombre() + "\t\t\t" + x.getCantidad() + "\t" + x.getPrecio());
		}

	}

}
