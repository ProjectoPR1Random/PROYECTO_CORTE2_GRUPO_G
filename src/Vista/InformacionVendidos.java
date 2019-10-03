package Vista;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class InformacionVendidos extends JFrame {
	JTextArea informacionV;

	public InformacionVendidos() {
		JPanel info = new JPanel();
		setTitle("INFORMACION VENDIDOS");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		getContentPane().setBackground(Color.white);
		setBounds(0, 0, 500, 700);
		setLocationRelativeTo(null);
		informacionV = new JTextArea("INFORMACION DE LOS PRODUCTOS VENDIDOS:" + "\n");
		informacionV.setEditable(false);
		JScrollPane scroll = new JScrollPane(informacionV);
		add(scroll).setBounds(10, 10, 475, 650);
		setVisible(false);

	}

}
