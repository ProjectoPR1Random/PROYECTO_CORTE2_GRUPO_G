package Vista;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelRefrigerados extends JPanel {
	JButton refrigerar;
	Icon imarefrigerar;

	public PanelRefrigerados() {
		imarefrigerar = new ImageIcon(getClass().getResource("/Imagenes/refrigerados.png"));
		refrigerar = new JButton();
		refrigerar.setForeground(Color.white);
		refrigerar.setIcon(imarefrigerar);
		refrigerar.setActionCommand("refrigerar");
		add(refrigerar).setBackground(Color.white);
	}

	public JButton getRefrigerar() {
		return refrigerar;
	}

	public void setRefrigerar(JButton refrigerar) {
		this.refrigerar = refrigerar;
	}

}
