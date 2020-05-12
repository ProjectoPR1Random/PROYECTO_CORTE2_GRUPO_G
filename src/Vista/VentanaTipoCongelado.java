package Vista;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaTipoCongelado extends JFrame {
	ImageIcon titulotiposcongelados;
	JButton caire;
	JButton cagua;
	JButton cnitrogeno;
	Icon caireim;
	Icon caguaim;
	Icon cnitrogenoim;

	public VentanaTipoCongelado() {
		setTitle("TIPOS DE CONGELACION");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		getContentPane().setBackground(Color.white);
		setBounds(0, 0, 850, 600);
		setLocationRelativeTo(null);
		this.setBackground(Color.white);

		JPanel tipocongelado = new JPanel();
		tipocongelado.setLayout(null);
		titulotiposcongelados = new ImageIcon(getClass().getResource("/Imagenes/tiposcongelacion.png"));
		JLabel titu = new JLabel(titulotiposcongelados);
		add(titu).setBounds(10, 10, 824, 300);

		JPanel tiposbotones = new JPanel();
		tiposbotones.setLayout(null);
		caireim = new ImageIcon(getClass().getResource("/Imagenes/caire.png"));
		caire = new JButton();
		caire.setForeground(Color.white);
		caire.setIcon(caireim);
		caire.setBackground(Color.white);
		caire.setActionCommand("cai");
		add(caire).setBounds(10, 315, 270, 245);

		cnitrogenoim = new ImageIcon(getClass().getResource("/Imagenes/cnitrogeno.png"));
		cnitrogeno = new JButton();
		cnitrogeno.setForeground(Color.white);
		cnitrogeno.setIcon(cnitrogenoim);
		cnitrogeno.setBackground(Color.white);
		cnitrogeno.setActionCommand("cni");
		add(cnitrogeno).setBounds(285, 315, 270, 245);

		caguaim = new ImageIcon(getClass().getResource("/Imagenes/cagua.png"));
		cagua = new JButton();
		cagua.setForeground(Color.white);
		cagua.setIcon(caguaim);
		cagua.setBackground(Color.white);
		cagua.setActionCommand("cagua");

		add(cagua).setBounds(562, 315, 272, 245);

		setVisible(false);

	}

	public ImageIcon getTitulotiposcongelados() {
		return titulotiposcongelados;
	}

	public void setTitulotiposcongelados(ImageIcon titulotiposcongelados) {
		this.titulotiposcongelados = titulotiposcongelados;
	}

	public JButton getCaire() {
		return caire;
	}

	public void setCaire(JButton caire) {
		this.caire = caire;
	}

	public JButton getCagua() {
		return cagua;
	}

	public void setCagua(JButton cagua) {
		this.cagua = cagua;
	}

	public JButton getCnitrogeno() {
		return cnitrogeno;
	}

	public void setCnitrogeno(JButton cnitrogeno) {
		this.cnitrogeno = cnitrogeno;
	}

	public Icon getCaireim() {
		return caireim;
	}

	public void setCaireim(Icon caireim) {
		this.caireim = caireim;
	}

	public Icon getCaguaim() {
		return caguaim;
	}

	public void setCaguaim(Icon caguaim) {
		this.caguaim = caguaim;
	}

	public Icon getCnitrogenoim() {
		return cnitrogenoim;
	}

	public void setCnitrogenoim(Icon cnitrogenoim) {
		this.cnitrogenoim = cnitrogenoim;
	}
}
