package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Consultas {

	private JFrame frmConsultas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consultas window = new Consultas();
					window.frmConsultas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Consultas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConsultas = new JFrame();
		frmConsultas.setTitle("Consultas");
		frmConsultas.setBounds(100, 100, 450, 300);
		frmConsultas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
