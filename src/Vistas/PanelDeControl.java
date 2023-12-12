package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

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
		frmBiblioteca.setBounds(100, 100, 450, 170);
		frmBiblioteca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frmBiblioteca.getContentPane().setLayout(springLayout);
		
		JButton btnNuevoLibro = new JButton("Nuevo Libro");
		springLayout.putConstraint(SpringLayout.NORTH, btnNuevoLibro, 54, SpringLayout.NORTH, frmBiblioteca.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNuevoLibro, 160, SpringLayout.WEST, frmBiblioteca.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNuevoLibro, -185, SpringLayout.EAST, frmBiblioteca.getContentPane());
		frmBiblioteca.getContentPane().add(btnNuevoLibro);
	}
}
