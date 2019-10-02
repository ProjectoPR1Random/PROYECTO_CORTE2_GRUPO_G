package Vista;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
	PanelTitulo pt;
	PanelProductos pp;

	public VentanaPrincipal() {
		setTitle("AGROUEB");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		getContentPane().setBackground(Color.white);
		setBounds(0, 0, 1200, 720);
		setLocationRelativeTo(null);
		this.setBackground(Color.white);
		pt = new PanelTitulo();
		pt.setBackground(Color.white);
		add(pt).setBounds(10, 0, 650, 730);
		pp = new PanelProductos();
		pp.setBackground(Color.white);
		add(pp).setBounds(675, 0, 510, 676);

		setVisible(true);

	}
}
