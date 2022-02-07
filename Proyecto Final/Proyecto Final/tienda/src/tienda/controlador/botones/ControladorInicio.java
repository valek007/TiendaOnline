package tienda.controlador.botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import tienda.ElementosPrincipales;
import tienda.modelo.manejo_datos.VerificacionUsuarios;
import tienda.vista.botones.BotonBlanco;

public class ControladorInicio {

	private final BotonBlanco botonInicio = new BotonBlanco("Iniciar");
	private final BotonBlanco botonRegistro = new BotonBlanco("Registrarse");
	private final BotonBlanco botonSalir = new BotonBlanco("Salir");

	private VerificacionUsuarios consultaUsuarios;

	private static String idUsuario;

	public ControladorInicio() {

		botonInicio.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				consultaUsuarios = new VerificacionUsuarios();

				if (consultaUsuarios.permisoAcceso()) {

					idUsuario = VerificacionUsuarios.getIdUsuario();

					ElementosPrincipales.paginaInicio.setVisible(false);
					ElementosPrincipales.paginaTienda.setVisible(true);

					ElementosPrincipales.gestorVentana.add(ElementosPrincipales.paginaTienda);
					ElementosPrincipales.gestorVentana.validate();

				} else {

					JOptionPane.showMessageDialog(null,
							"No permitido el acceso, por favor revisa el usuario y la contraseña.");
				}
			}
		});

		botonRegistro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ElementosPrincipales.paginaInicio.setVisible(false);
				ElementosPrincipales.paginaRegistro.setVisible(true);

				ElementosPrincipales.gestorVentana.add(ElementosPrincipales.paginaRegistro);
				ElementosPrincipales.gestorVentana.validate();
			}

		});

	}

	public static String getIdUsuario() {
		return idUsuario;
	}

	public JButton obtenerBotonInicio() {
		return botonInicio;
	}

	public JButton obtenerBotonRegistro() {
		return botonRegistro;
	}

	public JButton obtenerBotonSalir() {
		return botonSalir;
	}
}
