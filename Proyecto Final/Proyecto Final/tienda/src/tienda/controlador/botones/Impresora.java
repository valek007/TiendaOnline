package tienda.controlador.botones;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.util.List;

public class Impresora {

	private Font fuente = new Font("Dialog", Font.PLAIN, 10);
	private PrintJob pj;
	private Graphics pagina;

	Impresora() {
		pj = Toolkit.getDefaultToolkit().getPrintJob(new Frame(), "SCAT", null);
	}

	public void imprimir(List<String> lista) {

		try {
			pagina = pj.getGraphics();
			pagina.setFont(fuente);
			pagina.setColor(Color.black);

			int alto = 60;

			for (String x : lista) {
				pagina.drawString(x, 60, alto);
				alto += 20;
			}

			pagina.dispose();
			pj.end();
		} catch (Exception e) {
			System.out.println("LA IMPRESION HA SIDO CANCELADA...");
		}
	}

}
