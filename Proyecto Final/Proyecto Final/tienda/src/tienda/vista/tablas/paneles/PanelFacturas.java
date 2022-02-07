package tienda.vista.tablas.paneles;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import tienda.Constantes;
import tienda.controlador.botones.ControladorFacturas;
import tienda.modelo.manejo_datos.RecuperarDatosFacturas;
import tienda.modelo.objetos.Factura;

public class PanelFacturas extends JPanel {

	private static final long serialVersionUID = 1L;

	private ControladorFacturas controladorFacturas = new ControladorFacturas();

	private int anchoPanel, altoPanel, margen;
	private JPanel facturas = new JPanel();
	private JPanel facturas2 = new JPanel();
	private JButton botonComprar, botonVolver;

	private JLabel titulo = new JLabel("TODAS LAS FACTURAS:");
	private JLabel espaciado1 = new JLabel(
			"-----------------------------------------------------------------------------------------------------------------------");
	private JLabel espaciado2 = new JLabel(
			"-----------------------------------------------------------------------------------------------------------------------");
	private JTextArea areaFacturas = new JTextArea(15, 40);

	private JLabel total1, total2, total3;
	private static ArrayList<String> impresion;

	public PanelFacturas() {

		botonComprar = controladorFacturas.getBotonImprimir();
		botonVolver = controladorFacturas.getBotonVolver();

		anchoPanel = Constantes.ANCHO_VENTANA - 200;
		altoPanel = Constantes.ALTO_VENTANA - 50;
		margen = 20;

		setBackground(Color.WHITE);
		setBounds(Constantes.ANCHO_VENTANA / 7, margen, anchoPanel, altoPanel);

		setLayout(null);

		facturas.setBounds(margen, margen, anchoPanel - (margen * 2), (altoPanel / 2) + (margen * 2));
		facturas.setBackground(Color.WHITE);
		facturas.add(titulo);
		facturas.add(espaciado1);
		agregarListaArea();
		areaFacturas.setEditable(false);
		facturas.add(new JScrollPane(areaFacturas));

		facturas2.setBounds(margen, (altoPanel / 2) + (margen * 5), anchoPanel - (margen * 2), altoPanel / 7);
		facturas2.setBackground(Color.WHITE);
		facturas2.add(espaciado2);
		facturas2.add(total1);
		facturas2.add(total2);
		facturas2.add(total3);

		botonComprar.setBounds(margen, altoPanel - (margen * 2), 130, 20);
		botonVolver.setBounds(margen + 150, altoPanel - (margen * 2), 80, 20);

		add(facturas);
		add(facturas2);
		add(botonComprar);
		add(botonVolver);
	}

	private void agregarListaArea() {

		RecuperarDatosFacturas.recuperarDatosFacturas();

		String linea1 = "\n Referencia\tCantidad Total\tPrecio Total\tFecha Pedido";
		String linea2 = "";
		int cont = 0;
		int cantidad = 0;
		int precio = 0;

		impresion = new ArrayList<>();

		areaFacturas.append(linea1);
		impresion.add(linea1);

		for (Factura x : RecuperarDatosFacturas.getListaFacturas()) {
			cont++;
			cantidad += x.getCantidadProductos();
			precio += x.getPrecioTotal();

			linea2 = "\n    " + x.getId() + " \t   " + x.getCantidadProductos() + " \t   " + x.getPrecioTotal()
					+ " \t   " + x.getFecha();

			areaFacturas.append(linea2);
			impresion.add(linea2);
		}

		total1 = new JLabel("Total Facturas: " + cont);
		total2 = new JLabel("Cantidad de Productos: " + cantidad);
		total3 = new JLabel("Precio Total: " + precio + "€");

		impresion.add("\n------------------------------------------------------------------------------------");
		impresion.add("\n Total Facturas: " + cont + " \n Cantidad de Productos: " + cantidad + " \n Precio Total: "
				+ precio + "€");
	}

	public static ArrayList<String> getImpresion() {
		return impresion;
	}
}
