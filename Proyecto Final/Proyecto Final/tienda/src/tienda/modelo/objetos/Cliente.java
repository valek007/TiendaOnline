package tienda.modelo.objetos;

public class Cliente {

	private final String id, nombres, apellidos;
	private Double saldo;

	public Cliente(String id, String nombres, String apellidos, Double saldo) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.saldo = saldo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getId() {
		return id;
	}

	public String getNombres() {
		return nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

}
