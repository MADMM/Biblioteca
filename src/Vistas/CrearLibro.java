package Vistas;

/**
 * Este es el formulario para crear un libro
 * @author Miguel Angel
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CrearLibro {

	private JFrame frame;
	private JTextField txtlibro;
	private JButton btnGuardar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearLibro window = new CrearLibro();
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
	public CrearLibro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 95);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Nombre del libro");
		frame.getContentPane().add(lblNewLabel);
		
		txtlibro = new JTextField();
		frame.getContentPane().add(txtlibro);
		txtlibro.setColumns(10);
		
		btnGuardar = new JButton("Guardar");
		frame.getContentPane().add(btnGuardar);
	}

}
