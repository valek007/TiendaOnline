package tienda.vista.botones;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Boton extends JButton {

	private static final long serialVersionUID = 1L;

	public Boton() {

		Border line = new LineBorder(Color.BLACK);
		Border margin = new EmptyBorder(5, 15, 5, 15);
		Border compound = new CompoundBorder(line, margin);

		setForeground(Color.BLACK);
		setBorder(compound);
	}

}
