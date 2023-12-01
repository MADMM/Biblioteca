package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Consultas {

	private JFrame frmConsultas;
	private JTextField textField;
	private JTable table;

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
		frmConsultas.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField = new JTextField();
		frmConsultas.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblInf = new JLabel("Intruduce la palabra clave ");
		frmConsultas.getContentPane().add(lblInf);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frmConsultas.getContentPane().add(btnNewButton);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		frmConsultas.getContentPane().add(table);
		
		JLabel lblNewLabel = new JLabel("New label");
		frmConsultas.getContentPane().add(lblNewLabel);
	}
}
