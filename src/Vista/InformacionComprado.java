package Vista;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class InformacionComprado extends JFrame {
	JTextArea informacionC;

	public InformacionComprado() {
		JPanel info = new JPanel();
		setTitle("INFORMACION COMPRADOS");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		getContentPane().setBackground(Color.white);
		setBounds(0, 0, 500, 700);
		setLocationRelativeTo(null);
		informacionC = new JTextArea("INFORMACION DE LOS PRODUCTOS COMPRADOS:" + "\n");
		informacionC.setEditable(false);
		JScrollPane scroll = new JScrollPane(informacionC);
		add(scroll).setBounds(10, 10, 475, 650);
		setVisible(false);

	}

}
