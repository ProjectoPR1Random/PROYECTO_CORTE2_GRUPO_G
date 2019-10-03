package Vista;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelInventario extends JPanel {
	JButton inventario;
	Icon imainventario;

	/**
	 * Se crea el boton de inventario y se le da una serie de caracteristicas 
	 * Se crea un ImageIcon para asignarle una imagen  al boton
	 * Con set Foreground se le cambia el color a la letra
	 */
	
	public PanelInventario() {
		imainventario = new ImageIcon(getClass().getResource("/Imagenes/inventario.png"));
		inventario = new JButton("i");
		inventario.setForeground(Color.white);
		inventario.setIcon(imainventario);
		inventario.setActionCommand("inventario");
		add(inventario).setBackground(Color.white);
	}

}
