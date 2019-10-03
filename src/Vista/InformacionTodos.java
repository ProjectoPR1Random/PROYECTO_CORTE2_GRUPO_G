package Vista;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class InformacionTodos extends JFrame {
	JTextArea informacionT;

	public InformacionTodos() {
		JPanel info = new JPanel();
		setTitle("INFORMACION TODOS");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		getContentPane().setBackground(Color.white);
		setBounds(0, 0, 500, 700);
		setLocationRelativeTo(null);
		informacionT = new JTextArea("INFORMACION DE TODOS LOS PRODUCTOS:" + "\n");
		informacionT.setEditable(false);
		JScrollPane scroll = new JScrollPane(informacionT);
		add(scroll).setBounds(10, 10, 475, 650);
		setVisible(false);
	}
}
