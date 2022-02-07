package tienda;

import java.awt.Color;

public class Constantes {

	public final static String BD_DRIVER = "jdbc:mysql://localhost:3306/tienda_online";
	public final static String BD_ROOT = "root";
	public final static String BD_ROOT_PASS = "";

	public final static String IBAN_TIENDA = "ES3701800000000000146731";
	public final static String BIC_TIENDA = "BBVAESMMXXX";
	public final static String REF_TIENDA = "REF";

	public final static Color FONDO_PAGINA = new Color(165, 183, 212);
	public final static Color COLOR_MARINO = new Color(115, 143, 186);
	public final static Color COLOR_CELESTE = new Color(230, 243, 255);

	public final static int ANCHO_VENTANA = 700;
	public final static int ALTO_VENTANA = 500;

	public final static int ANCHO_PANTALLA = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	public final static int ALTO_PANTALLA = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;

}
