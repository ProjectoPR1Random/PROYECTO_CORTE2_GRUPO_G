package Vista;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelFrescos extends JPanel {
	JButton frescos;
	Icon imafrescos;

	public PanelFrescos() {
		imafrescos = new ImageIcon(getClass().getResource("/Imagenes/frescos.png"));
		frescos = new JButton();
		frescos.setForeground(Color.white);
		frescos.setIcon(imafrescos);
		frescos.setActionCommand("frescos");
		add(frescos).setBackground(Color.white);
	}

	public JButton getFrescos() {
		return frescos;
	}

	public void setFrescos(JButton frescos) {
		this.frescos = frescos;
	}

}
