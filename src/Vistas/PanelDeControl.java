package Vistas;
/**
 * este es el formulario Principal del panel de control
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class PanelDeControl {

	private JFrame frmPanelDeControl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelDeControl window = new PanelDeControl();
					window.frmPanelDeControl.setVisible(true);
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
		frmPanelDeControl = new JFrame();
		frmPanelDeControl.setTitle("Panel de Control");
		frmPanelDeControl.setBounds(100, 100, 450, 234);
		frmPanelDeControl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPanelDeControl.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnConsultar = new JButton("Consultar");
		frmPanelDeControl.getContentPane().add(btnConsultar);
		
		JButton btnCrear = new JButton("Crear");
		frmPanelDeControl.getContentPane().add(btnCrear);
	}

}
