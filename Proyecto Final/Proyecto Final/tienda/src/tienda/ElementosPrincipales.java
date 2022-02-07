package tienda;

import java.util.ArrayList;

import tienda.modelo.objetos.Compra;
import tienda.vista.GestorVentana;
import tienda.vista.paginas.PaginaInicio;
import tienda.vista.paginas.PaginaRegistro;
import tienda.vista.paginas.PaginaTienda;

public class ElementosPrincipales {

	public static PaginaInicio paginaInicio = new PaginaInicio();
	public static PaginaTienda paginaTienda = new PaginaTienda();
	public static PaginaRegistro paginaRegistro = new PaginaRegistro();

	public static GestorVentana gestorVentana = new GestorVentana("Tienda");

	public static ArrayList<Compra> listaCompras = new ArrayList<>();
	public static int idCompra = 0;
}
