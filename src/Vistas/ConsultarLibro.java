package Vistas;

/**
 * Este formulario es para realizar la consultas de libros
 * @author Miguel Angel
 * 
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ConsultarLibro {

	private JFrame frame;
	private JTextField txtFieldConsultar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarLibro window = new ConsultarLibro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConsultarLibro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtFieldConsultar = new JTextField();
		frame.getContentPane().add(txtFieldConsultar);
		txtFieldConsultar.setColumns(10);
		
		JButton btnNewButton = new JButton("Consultar");
		frame.getContentPane().add(btnNewButton);
	}

}
