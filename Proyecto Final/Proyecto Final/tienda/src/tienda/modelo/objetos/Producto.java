package tienda.modelo.objetos;

public class Producto {

	private final String id;
	private final String nombre;
	private int disponible;
	private final double precio;
	private int cantidad;

	public Producto(final String id, final String nombre, final int disponible, final double precio,
			final int cantidad) {
		this.id = id;
		this.nombre = nombre;
		this.disponible = disponible;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public Producto(final String id, final String nombre, final int disponible, final double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.disponible = disponible;
		this.precio = precio;
	}

	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getDisponible() {
		return disponible;
	}

	public double getPrecio() {
		return precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setDisponible(int disponible) {
		this.disponible = disponible;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
