package Vista;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelTitulo extends JPanel {

	private ImageIcon titulo;
	private JButton manual;

	public PanelTitulo() {
	
		/** 
		 * Se crea un label llamado titu
		 * Se crea un ImageIcon para asignarle una imagen  al boton
		 * Con set Foreground se le cambia el color a la letra
		 * @return 
		 */
		
		titulo = new ImageIcon(getClass().getResource("/Imagenes/agro.png"));
		JLabel titu = new JLabel(titulo);
		add(titu);
		setVisible(true);
		
		

	}
	
	
}
