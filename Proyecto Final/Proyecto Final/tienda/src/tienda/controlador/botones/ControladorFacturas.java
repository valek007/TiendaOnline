package tienda.controlador.botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import tienda.vista.botones.BotonBlanco;
import tienda.vista.tablas.paneles.PanelFacturas;

public class ControladorFacturas {

	private BotonBlanco botonImprimir = new BotonBlanco("Imprimir");
	private BotonBlanco botonVolver = new BotonBlanco("Volver");

	public ControladorFacturas() {

		botonImprimir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Impresora imp = new Impresora();

				imp.imprimir(PanelFacturas.getImpresion());

			}
		});

		botonVolver.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ControladorMenu.volverTiendaFacturas();

			}
		});
	}

	public BotonBlanco getBotonImprimir() {
		return botonImprimir;
	}

	public BotonBlanco getBotonVolver() {
		return botonVolver;
	}
}
