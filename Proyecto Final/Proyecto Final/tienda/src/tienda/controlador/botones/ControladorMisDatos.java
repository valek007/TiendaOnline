package tienda.controlador.botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import tienda.ElementosPrincipales;
import tienda.modelo.manejo_datos.ActualizarUsuarios;
import tienda.vista.botones.BotonBlanco;

public class ControladorMisDatos {

	private BotonBlanco botonEditar = new BotonBlanco("Editar");
	private BotonBlanco botonActualizar = new BotonBlanco("Actualizar");
	private BotonBlanco botonVolver = new BotonBlanco("Volver");

	public ControladorMisDatos() {

		botonEditar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ControladorMenu.getPaginaMisDatos().getTablaDatosPerfil().ponerEditable();
			}
		});

		botonActualizar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ActualizarUsuarios actualizarUsuarios = new ActualizarUsuarios();
				actualizarUsuarios.actualizarUsuarios();

				ControladorMenu.getPaginaMisDatos().setVisible(false);
				ElementosPrincipales.paginaTienda.setVisible(true);

				ElementosPrincipales.gestorVentana.add(ElementosPrincipales.paginaTienda);
				ElementosPrincipales.gestorVentana.validate();
			}
		});

		botonVolver.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ControladorMenu.getPaginaMisDatos().setVisible(false);
				ElementosPrincipales.paginaTienda.setVisible(true);

				ElementosPrincipales.gestorVentana.add(ElementosPrincipales.paginaTienda);
				ElementosPrincipales.gestorVentana.validate();
			}
		});

	}

	public JButton obtenerBotonEditar() {
		return botonEditar;
	}

	public JButton obtenerBotonActualizar() {
		return botonActualizar;
	}

	public JButton obtenerBotonVolver() {
		return botonVolver;
	}

}
