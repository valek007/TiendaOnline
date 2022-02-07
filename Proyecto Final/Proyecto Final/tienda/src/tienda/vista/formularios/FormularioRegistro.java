package tienda.vista.formularios;

import javax.swing.JLabel;
import javax.swing.JTextField;

import tienda.controlador.botones.ControladorRegistro;

public class FormularioRegistro extends Formulario {

	private static final long serialVersionUID = 1L;

	private final JLabel etqUsuario = new JLabel("Usuario: ");
	private final JLabel etqPassword = new JLabel("Contraseña: ");
	private final JLabel etqEmail = new JLabel("Email: ");
	private final JLabel etqNombres = new JLabel("Nombres: ");
	private final JLabel etqApellidos = new JLabel("Apellidos: ");
	private final JLabel etqCiudad = new JLabel("Ciudad: ");
	private final JLabel etqPais = new JLabel("País: ");
	private final JLabel etqDireccion = new JLabel("Dirección: ");
	private final JLabel etqCodPostal = new JLabel("Código Postal: ");
	private final JLabel etqTelefono = new JLabel("Télefono: ");

	private static final JTextField usuario = new JTextField(10);
	private static final JTextField password = new JTextField(10);
	private static final JTextField email = new JTextField(10);
	private static final JTextField nombres = new JTextField(10);
	private static final JTextField apellidos = new JTextField(10);
	private static final JTextField ciudad = new JTextField(10);
	private static final JTextField pais = new JTextField(10);
	private static final JTextField direccion = new JTextField(10);
	private static final JTextField codPostal = new JTextField(10);
	private static final JTextField telefono = new JTextField(10);

	private JLabel[] etiquetas = { etqUsuario, etqPassword, etqEmail, etqNombres, etqApellidos, etqPais, etqCiudad,
			etqDireccion, etqCodPostal, etqTelefono };
	private static JTextField[] campos = { usuario, password, email, nombres, apellidos, ciudad, pais, direccion,
			codPostal, telefono };

	private final ControladorRegistro controladorRegistro = new ControladorRegistro();

	public FormularioRegistro() {

		int margen = 0;
		for (int i = 0; i < campos.length; i++) {
			etiquetas[i].setBounds(20, 30 + margen, 100, 20);
			campos[i].setBounds(110, 30 + margen, 200, 20);
			margen += 30;
		}

		controladorRegistro.obtenerBotonRegistro().setBounds(100, 350, 100, 20);
		controladorRegistro.obtenerBotonVolver().setBounds(230, 350, 100, 20);

		setLayout(null);

		for (int i = 0; i < campos.length; i++) {
			add(etiquetas[i]);
			add(campos[i]);
		}

		add(controladorRegistro.obtenerBotonRegistro());
		add(controladorRegistro.obtenerBotonVolver());
	}

	public static JTextField[] getCampos() {
		return campos;
	}

}
