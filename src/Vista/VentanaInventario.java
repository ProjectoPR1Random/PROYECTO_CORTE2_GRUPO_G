package Vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaInventario extends JFrame {
	ImageIcon tituloinventario;
	JButton todos;
	JButton vendidos;
	JButton comprados;
	Icon todosim;
	Icon vendidosim;
	Icon compradosim;

	public VentanaInventario() {
		setTitle("INVENTARIO - AGROUEB");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		getContentPane().setBackground(Color.white);
		setBounds(0, 0, 640, 500);
		setLocationRelativeTo(null);
		this.setBackground(Color.white);

		JPanel inventario = new JPanel();
		inventario.setLayout(null);
		tituloinventario = new ImageIcon(getClass().getResource("/Imagenes/tipoinventario.png"));
		JLabel titu = new JLabel(tituloinventario);
		add(titu).setBounds(17, 0, 600, 200);

		JPanel tiposin = new JPanel();
		tiposin.setLayout(null);
		todosim = new ImageIcon(getClass().getResource("/Imagenes/todos.png"));
		todos = new JButton();
		todos.setForeground(Color.white);
		todos.setIcon(todosim);
		todos.setBackground(Color.white);
		todos.setActionCommand("to");
		add(todos).setBounds(10, 220, 200, 230);
		compradosim = new ImageIcon(getClass().getResource("/Imagenes/comprados.png"));
		comprados = new JButton();
		comprados.setForeground(Color.white);
		comprados.setIcon(compradosim);
		comprados.setBackground(Color.white);
		comprados.setActionCommand("co");

		add(comprados).setBounds(215, 220, 200, 230);
		vendidosim = new ImageIcon(getClass().getResource("/Imagenes/vendidos.png"));
		vendidos = new JButton();
		vendidos.setForeground(Color.white);
		vendidos.setIcon(vendidosim);
		vendidos.setBackground(Color.white);
		vendidos.setActionCommand("ve");

		add(vendidos).setBounds(420, 220, 200, 230);

		setVisible(false);

	}

	public ImageIcon getTituloinventario() {
		return tituloinventario;
	}

	public void setTituloinventario(ImageIcon tituloinventario) {
		this.tituloinventario = tituloinventario;
	}

	public JButton getTodos() {
		return todos;
	}

	public void setTodos(JButton todos) {
		this.todos = todos;
	}

	public JButton getVendidos() {
		return vendidos;
	}

	public void setVendidos(JButton vendidos) {
		this.vendidos = vendidos;
	}

	public JButton getComprados() {
		return comprados;
	}

	public void setComprados(JButton comprados) {
		this.comprados = comprados;
	}

	public Icon getTodosim() {
		return todosim;
	}

	public void setTodosim(Icon todosim) {
		this.todosim = todosim;
	}

	public Icon getVendidosim() {
		return vendidosim;
	}

	public void setVendidosim(Icon vendidosim) {
		this.vendidosim = vendidosim;
	}

	public Icon getCompradosim() {
		return compradosim;
	}

	public void setCompradosim(Icon compradosim) {
		this.compradosim = compradosim;
	}
}