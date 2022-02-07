package tienda.controlador.botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import tienda.ElementosPrincipales;
import tienda.modelo.manejo_datos.RegistroUsuarios;
import tienda.vista.botones.BotonBlanco;

public class ControladorRegistro {

	private BotonBlanco botonRegistro = new BotonBlanco("Registrarse");
	private BotonBlanco botonVolver = new BotonBlanco("Volver");

	public ControladorRegistro() {

		botonRegistro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				RegistroUsuarios registroUsuarios = new RegistroUsuarios();
				registroUsuarios.registroUsuarios();

				ElementosPrincipales.paginaRegistro.setVisible(false);
				ElementosPrincipales.paginaInicio.setVisible(true);

				ElementosPrincipales.gestorVentana.add(ElementosPrincipales.paginaInicio);
				ElementosPrincipales.gestorVentana.validate();
			}
		});

		botonVolver.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ElementosPrincipales.paginaRegistro.setVisible(false);
				ElementosPrincipales.paginaInicio.setVisible(true);

				ElementosPrincipales.gestorVentana.add(ElementosPrincipales.paginaInicio);
				ElementosPrincipales.gestorVentana.validate();
			}
		});

	}

	public JButton obtenerBotonRegistro() {
		return botonRegistro;
	}

	public JButton obtenerBotonVolver() {
		return botonVolver;
	}

}
