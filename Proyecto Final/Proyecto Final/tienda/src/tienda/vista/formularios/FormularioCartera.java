package tienda.vista.formularios;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import tienda.Constantes;
import tienda.controlador.botones.ControladorCartera;
import tienda.controlador.botones.ControladorInicio;
import tienda.modelo.manejo_datos.RecuperarDatosCliente;

public class FormularioCartera extends Formulario {

	private static final long serialVersionUID = 1L;

	private ControladorCartera controladorCartera = new ControladorCartera();
	private String nombre = RecuperarDatosCliente.recuperarDatos().getNombres() + " "
			+ RecuperarDatosCliente.recuperarDatos().getApellidos();
	private Double saldo = RecuperarDatosCliente.recuperarDatos().getSaldo();

	private final JLabel usuario = new JLabel();
	private final JLabel etqSaldo = new JLabel();

	private final JLabel espaciado1 = new JLabel(
			"------------------------------------------------------------------------------------------");
	private final JLabel ibanTienda = new JLabel("IBAN TIENDA: ");
	private final static JTextField campoIbanTienda = new JTextField(10);
	private final JLabel bicTienda = new JLabel("BIC/SWIFT: ");
	private final static JTextField campoBicTienda = new JTextField(10);
	private final JLabel referenciaTienda = new JLabel("REFERENCIA: ");
	private final static JTextField campoRefTienda = new JTextField(10);
	private final JLabel espaciado2 = new JLabel(
			"----------------------------------------------------------------------------------------------");
	private final JLabel ibanUsuario = new JLabel("IBAN: ");
	private final static JTextField campoIban = new JTextField(10);
	private final JLabel bicUsuario = new JLabel("BIC/SWIFT: ");
	private final static JTextField campoBic = new JTextField(10);
	private final JLabel referenciaUsuario = new JLabel("REFERENCIA: ");
	private final static JTextField campoRef = new JTextField(10);
	private final static JPasswordField ingreso = new JPasswordField(10);

	public FormularioCartera() {

		usuario.setText(nombre);
		etqSaldo.setText("Saldo Total: " + saldo + "€");

		campoIbanTienda.setText(Constantes.IBAN_TIENDA);
		campoIbanTienda.setEditable(false);
		campoBicTienda.setText(Constantes.BIC_TIENDA);
		campoBicTienda.setEditable(false);
		campoRefTienda.setText(Constantes.REF_TIENDA + ControladorInicio.getIdUsuario());
		campoRefTienda.setEditable(false);

		usuario.setBounds(20, 20, 200, 20);
		etqSaldo.setBounds(20, 40, 200, 20);
		espaciado1.setBounds(20, 60, 400, 20);
		ibanTienda.setBounds(20, 90, 200, 20);
		campoIbanTienda.setBounds(120, 90, 200, 20);
		bicTienda.setBounds(20, 120, 200, 20);
		campoBicTienda.setBounds(120, 120, 200, 20);
		referenciaTienda.setBounds(20, 150, 200, 20);
		campoRefTienda.setBounds(120, 150, 200, 20);
		espaciado2.setBounds(20, 180, 400, 20);
		ibanUsuario.setBounds(20, 210, 200, 20);
		campoIban.setBounds(120, 210, 200, 20);
		bicUsuario.setBounds(20, 240, 200, 20);
		campoBic.setBounds(120, 240, 200, 20);
		referenciaUsuario.setBounds(20, 270, 200, 20);
		campoRef.setBounds(120, 270, 200, 20);

		controladorCartera.getBotonIngreso().setBounds(30, 350, 80, 20);
		controladorCartera.getBotonRetirar().setBounds(120, 350, 80, 20);
		controladorCartera.getBotonVolver().setBounds(210, 350, 80, 20);

		setLayout(null);

		add(usuario);
		add(etqSaldo);
		add(espaciado1);

		add(ibanTienda);
		add(campoIbanTienda);
		add(bicTienda);
		add(campoBicTienda);
		add(referenciaTienda);
		add(campoRefTienda);
		add(espaciado2);

		add(ibanUsuario);
		add(campoIban);

		add(bicUsuario);
		add(campoBic);

		add(referenciaUsuario);
		add(campoRef);

		add(controladorCartera.getBotonIngreso());
		add(controladorCartera.getBotonRetirar());
		add(controladorCartera.getBotonVolver());
	}

	public static JPasswordField obtenerIngreso() {
		return ingreso;
	}

	public static JTextField getCampoiban() {
		return campoIban;
	}

	public static JTextField getCampobic() {
		return campoBic;
	}

	public static JTextField getCamporef() {
		return campoRef;
	}

}
