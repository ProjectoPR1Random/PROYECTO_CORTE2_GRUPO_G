package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class VentanaFrescos extends JFrame {
	JButton comprar;
	JButton vender;
	JButton modificar;
	JList<String> listaF;
	DefaultListModel<String> modelo;

	public VentanaFrescos() {
		setTitle("PRODUCTOS FRESCOS");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		getContentPane().setBackground(Color.white);
		setBounds(0, 0, 600, 700);
		setLocationRelativeTo(null);
		this.setBackground(Color.white);

		JPanel listafrescos = new JPanel();
		setLayout(null);
		listaF = new JList<String>();
		modelo = new DefaultListModel<String>();
		JScrollPane desplazamientolista = new JScrollPane(listaF);
		listaF.setModel(modelo);
		listaF.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		desplazamientolista.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		add(desplazamientolista).setBounds(10, 10, 280, 650);

		JPanel crudfrescos = new JPanel();
		setLayout(null);
		comprar = new JButton("COMPRAR PRODUCTO");
		comprar.setBackground(Color.black);
		comprar.setForeground(Color.white);
		add(comprar).setFont(new Font("Tahoma", Font.BOLD, 20));
		add(comprar).setBounds(302, 50, 280, 100);

		vender = new JButton("VENDER PRODUCTO");
		vender.setBackground(Color.black);
		vender.setForeground(Color.white);
		add(vender).setFont(new Font("Tahoma", Font.BOLD, 20));
		add(vender).setBounds(302, 250, 280, 100);

		modificar = new JButton("MODIFICAR PRODUCTO");
		modificar.setBackground(Color.black);
		modificar.setForeground(Color.white);
		add(modificar).setFont(new Font("Tahoma", Font.BOLD, 20));
		add(modificar).setBounds(302, 450, 280, 100);

		setVisible(false);
	}

	public JButton getComprar() {
		return comprar;
	}

	public void setComprar(JButton comprar) {
		this.comprar = comprar;
	}

	public JButton getVender() {
		return vender;
	}

	public void setVender(JButton vender) {
		this.vender = vender;
	}

	public JButton getModificar() {
		return modificar;
	}

	public void setModificar(JButton modificar) {
		this.modificar = modificar;
	}

	public JList<String> getListaF() {
		return listaF;
	}

	public void setListaF(JList<String> listaF) {
		this.listaF = listaF;
	}

	public DefaultListModel<String> getModelo() {
		return modelo;
	}

	public void setModelo(DefaultListModel<String> modelo) {
		this.modelo = modelo;
	}
}