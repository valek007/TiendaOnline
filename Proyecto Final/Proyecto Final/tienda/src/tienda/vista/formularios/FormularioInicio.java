package tienda.vista.formularios;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import tienda.controlador.botones.ControladorInicio;

public class FormularioInicio extends Formulario {

	private static final long serialVersionUID = 1L;

	private final JLabel etqUsuario = new JLabel("Usuario: ");
	private final JLabel etqPassword = new JLabel("Contraseña: ");
	private final static JTextField usuario = new JTextField(10);
	private final static JPasswordField password = new JPasswordField(10);
	private final ControladorInicio controladorInicio = new ControladorInicio();

	public FormularioInicio() {

		etqUsuario.setBounds(50, 40, 80, 20);
		usuario.setBounds(110, 40, 100, 20);
		etqPassword.setBounds(28, 80, 80, 20);
		password.setBounds(110, 80, 100, 20);
		controladorInicio.obtenerBotonInicio().setBounds(30, 150, 70, 20);
		controladorInicio.obtenerBotonRegistro().setBounds(105, 150, 100, 20);
		controladorInicio.obtenerBotonSalir().setBounds(210, 150, 80, 20);

		setLayout(null);

		add(etqUsuario);
		add(usuario);
		add(etqPassword);
		add(password);
		add(controladorInicio.obtenerBotonInicio());
		add(controladorInicio.obtenerBotonRegistro());
		add(controladorInicio.obtenerBotonSalir());
	}

	public static JTextField obtenerUsuario() {
		return usuario;
	}

	public static JPasswordField obtenerPassword() {
		return password;
	}

}
