package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

public class PanelDeControl {

	private JFrame frmBiblioteca;
	private JTextField txtTituloVentana;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelDeControl window = new PanelDeControl();
					window.frmBiblioteca.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PanelDeControl() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBiblioteca = new JFrame();
		frmBiblioteca.setTitle("Biblioteca");
		frmBiblioteca.setBounds(100, 100, 450, 300);
		frmBiblioteca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frmBiblioteca.getContentPane().setLayout(springLayout);
		
		txtTituloVentana = new JTextField();
		txtTituloVentana.setHorizontalAlignment(SwingConstants.CENTER);
		springLayout.putConstraint(SpringLayout.NORTH, txtTituloVentana, 5, SpringLayout.NORTH, frmBiblioteca.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, txtTituloVentana, 0, SpringLayout.WEST, frmBiblioteca.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, txtTituloVentana, 434, SpringLayout.WEST, frmBiblioteca.getContentPane());
		txtTituloVentana.setText("Panel de Control ");
		frmBiblioteca.getContentPane().add(txtTituloVentana);
		txtTituloVentana.setColumns(10);
		
		JButton btnConsulta = new JButton("Consulta");
		springLayout.putConstraint(SpringLayout.WEST, btnConsulta, 45, SpringLayout.WEST, frmBiblioteca.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnConsulta, 134, SpringLayout.WEST, frmBiblioteca.getContentPane());
		frmBiblioteca.getContentPane().add(btnConsulta);
		
		JButton btnNuevo = new JButton("Nuevo");
		springLayout.putConstraint(SpringLayout.NORTH, btnConsulta, 0, SpringLayout.NORTH, btnNuevo);
		springLayout.putConstraint(SpringLayout.NORTH, btnNuevo, 28, SpringLayout.SOUTH, txtTituloVentana);
		springLayout.putConstraint(SpringLayout.WEST, btnNuevo, 301, SpringLayout.WEST, frmBiblioteca.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNuevo, -44, SpringLayout.EAST, frmBiblioteca.getContentPane());
		frmBiblioteca.getContentPane().add(btnNuevo);
	}
}
