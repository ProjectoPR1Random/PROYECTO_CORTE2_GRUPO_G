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

public class VentanaRefrigerados extends JFrame {
	JButton comprar;
	JButton vender;
	JButton modificar;
	JList<String> listaR;
	DefaultListModel<String> modelo;

	public VentanaRefrigerados() {
		setTitle("PRODUCTOS REFRIGERADOS");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		getContentPane().setBackground(Color.white);
		setBounds(0, 0, 600, 700);
		setLocationRelativeTo(null);

		JPanel listarefrigerados = new JPanel();
		setLayout(null);
		listaR = new JList<String>();
		modelo = new DefaultListModel<String>();
		JScrollPane desplazamientolista = new JScrollPane(listaR);
		listaR.setModel(modelo);
		listaR.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		desplazamientolista.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		add(desplazamientolista).setBounds(10, 10, 280, 650);

		JPanel crudrefrigerados = new JPanel();
		setLayout(null);
		comprar = new JButton("COMPRAR PRODUCTO");
		comprar.setBackground(Color.white);
		comprar.setForeground(Color.black);
		add(comprar).setFont(new Font("Tahoma", Font.BOLD, 20));
		add(comprar).setBounds(302, 50, 280, 100);

		vender = new JButton("VENDER PRODUCTO");
		vender.setBackground(Color.white);
		vender.setForeground(Color.black);
		add(vender).setFont(new Font("Tahoma", Font.BOLD, 20));
		add(vender).setBounds(302, 250, 280, 100);

		modificar = new JButton("MODIFICAR PRODUCTO");
		modificar.setBackground(Color.white);
		modificar.setForeground(Color.black);
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

	public JList<String> getListaR() {
		return listaR;
	}

	public void setListaR(JList<String> listaR) {
		this.listaR = listaR;
	}

	public DefaultListModel<String> getModelo() {
		return modelo;
	}

	public void setModelo(DefaultListModel<String> modelo) {
		this.modelo = modelo;
	}
}
