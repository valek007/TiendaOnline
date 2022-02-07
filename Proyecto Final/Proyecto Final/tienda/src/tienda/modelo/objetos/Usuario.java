package tienda.modelo.objetos;

public class Usuario {

	private final String id, nick, passsword, email;

	public Usuario(final String id, final String nick, final String passsword, final String email) {
		this.id = id;
		this.nick = nick;
		this.passsword = passsword;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public String getNick() {
		return nick;
	}

	public String getPasssword() {
		return passsword;
	}

	public String getEmail() {
		return email;
	}
}
