package Vista;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelProductos extends JPanel {
	PanelFrescos pf;
	PanelRefrigerados pr;
	PanelCongelados pc;
	PanelInventario pi;

	public PanelProductos() {

		setLayout(new GridLayout(4, 1));
		pf = new PanelFrescos();
		pr = new PanelRefrigerados();
		pc = new PanelCongelados();
		pi = new PanelInventario();
		add(pf);
		add(pr);
		add(pc);
		add(pi);

	}

}
