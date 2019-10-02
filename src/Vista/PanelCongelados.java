package Vista;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelCongelados extends JPanel{
	JButton congelar;
	Icon imacongelar;

	public PanelCongelados() {
		imacongelar = new ImageIcon(getClass().getResource("/Imagenes/congelados.png"));
		congelar = new JButton("c");
		congelar.setForeground(Color.white);
		congelar.setIcon(imacongelar);
		congelar.setActionCommand("congelar");
		add(congelar).setBackground(Color.white);
	}


}