package Vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.Pipe;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame implements ActionListener {
	PanelTitulo pt;
	PanelProductos pp;
	private JButton manual;
	
	
	VentanaInventario vi;
	InformacionTodos it;
	PanelInventario pi;
	InformacionComprado ic;
	InformacionVendidos iv;
	VentanaFrescos vf;
	VentanaRefrigerados vr;
	VentanaTipoCongelado vtc;
	VentanaCongeladosAgua vca;

	public VentanaPrincipal() {
		setTitle("AGROUEB");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		getContentPane().setBackground(Color.white);
		setBounds(0, 0, 1200, 725);
		setLocationRelativeTo(null);
		this.setBackground(Color.white);

		vi = new VentanaInventario();
		vf = new VentanaFrescos();
		vr = new VentanaRefrigerados();
		vtc = new VentanaTipoCongelado();
		vca = new VentanaCongeladosAgua();
		pt = new PanelTitulo();
		pp = new PanelProductos();
		pi = new PanelInventario();
		it = new InformacionTodos();
		ic = new InformacionComprado();
		iv = new InformacionVendidos();

		pt.setBackground(Color.white);
		add(pt).setBounds(10, 0, 650, 730);
		pp.setBackground(Color.white);
		add(pp).setBounds(675, 0, 510, 676);
        setVisible(true);
       
        

	}

	
	
	


	
	
	
	

		pp.pi.getInventario().addActionListener(this);
		pp.pf.getFrescos().addActionListener(this);
		pp.pc.getCongelar().addActionListener(this);
		pp.pr.getRefrigerar().addActionListener(this);
		vi.getTodos().addActionListener(this);
		vi.getVendidos().addActionListener(this);
		vi.getComprados().addActionListener(this);
		vf.getComprar().addActionListener(this);
		vf.getVender().addActionListener(this);
		vf.getModificar().addActionListener(this);
		vr.getComprar().addActionListener(this);
		vr.getVender().addActionListener(this);
		vr.getModificar().addActionListener(this);
		vtc.getCaire().addActionListener(this);
		vtc.getCnitrogeno().addActionListener(this);
		vtc.getCagua().addActionListener(this);

		setVisible(true);

	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("inventario")) {
			vi.setVisible(true);
		}
		if (e.getActionCommand().equals("to")) {
			it.setVisible(true);
		}
		if (e.getActionCommand().equals("co")) {
			ic.setVisible(true);
		}
		if (e.getActionCommand().equals("ve")) {
			iv.setVisible(true);
		}
		if (e.getActionCommand().equals("frescos")) {
			vf.setVisible(true);
		}
		if (e.getActionCommand().equals("refrigerar")) {
			vr.setVisible(true);
		}
		if (e.getActionCommand().equals("congelar")) {
			vtc.setVisible(true);

		}
		if (e.getActionCommand().equals("cagua")) {
			vca.setVisible(true);

		}
		if (e.getActionCommand().equals("cni")) {
			vca.setVisible(true);			
		}
	}
}
}