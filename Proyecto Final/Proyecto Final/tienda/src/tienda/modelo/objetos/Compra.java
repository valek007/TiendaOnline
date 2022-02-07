package tienda.modelo.objetos;

public class Compra {

	private final int id;
	private int cantidadProductos;
	private double precioTotal;

	public Compra(int id, int cantidadProductos, double precioTotal) {
		this.id = id;
		this.cantidadProductos = cantidadProductos;
		this.precioTotal = precioTotal;
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
}
