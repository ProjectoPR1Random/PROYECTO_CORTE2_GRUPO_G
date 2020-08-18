package Vista;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelRefrigerados extends JPanel {
	JButton refrigerar;
	Icon imarefrigerar;

	/**
	 * Se crea el boton de refrigerar y se le da una serie de caracteristicas 
	 * Se crea un ImageIcon para asignarle una imagen  al boton
	 * Con set Foreground se le cambia el color a la letra
	 */
	
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
