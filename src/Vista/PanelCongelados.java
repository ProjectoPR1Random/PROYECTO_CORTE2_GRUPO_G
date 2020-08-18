package Vista;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelCongelados extends JPanel {
	JButton congelar;
	Icon imacongelar;

	public PanelCongelados() {
		/**
		 * Se crea el boton de congelar y se le da una serie de caracteristicas 
		 * Se crea un ImageIcon para asignarle una imagen  al boton
		 * Con set Foreground se le cambia el color a la letra
		 */
		imacongelar = new ImageIcon(getClass().getResource("/Imagenes/congelados.png"));
		congelar = new JButton();
		congelar.setForeground(Color.white);
		congelar.setIcon(imacongelar);
		congelar.setActionCommand("congelar");
		add(congelar).setBackground(Color.white);
	}

	public JButton getCongelar() {
		return congelar;
	}

	public void setCongelar(JButton congelar) {
		this.congelar = congelar;
	}

}
