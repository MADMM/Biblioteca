package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

public class PanelDeControl {

	private JFrame frmBiblioteca;

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
		
		JButton btnConsulta = new JButton("Consulta");
		springLayout.putConstraint(SpringLayout.WEST, btnConsulta, 45, SpringLayout.WEST, frmBiblioteca.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnConsulta, 134, SpringLayout.WEST, frmBiblioteca.getContentPane());
		frmBiblioteca.getContentPane().add(btnConsulta);
		
		JButton btnNuevo = new JButton("Nuevo");
		springLayout.putConstraint(SpringLayout.NORTH, btnNuevo, 53, SpringLayout.NORTH, frmBiblioteca.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, btnConsulta, 0, SpringLayout.NORTH, btnNuevo);
		springLayout.putConstraint(SpringLayout.WEST, btnNuevo, 301, SpringLayout.WEST, frmBiblioteca.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNuevo, -44, SpringLayout.EAST, frmBiblioteca.getContentPane());
		frmBiblioteca.getContentPane().add(btnNuevo);
	}
}
