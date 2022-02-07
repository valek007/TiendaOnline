package tienda.modelo.objetos;

import java.sql.Date;

public class Factura {

	private final int id;
	private int cantidadProductos;
	private double precioTotal;
	private Date fecha;

	public Factura(int id, int cantidadProductos, double precioTotal, Date fecha) {
		this.id = id;
		this.cantidadProductos = cantidadProductos;
		this.precioTotal = precioTotal;
		this.fecha = fecha;
	}

	public int getCantidadProductos() {
		return cantidadProductos;
	}

	public void setCantidadProductos(int cantidadProductos) {
		this.cantidadProductos = cantidadProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public int getId() {
		return id;
	}

	public Date getFecha() {
		return fecha;
	}

}
