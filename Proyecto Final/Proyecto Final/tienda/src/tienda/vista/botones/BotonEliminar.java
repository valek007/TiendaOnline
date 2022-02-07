package tienda.vista.botones;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class BotonEliminar extends JButton {

	private static final long serialVersionUID = 1L;

	public BotonEliminar() {

		setText("X");
		setName("delete");

		Border line = new LineBorder(Color.WHITE);
		Border margin = new EmptyBorder(5, 15, 5, 15);
		Border compound = new CompoundBorder(line, margin);

		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		setBorder(compound);
	}

}
