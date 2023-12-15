package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTable;

public class ConsultarLibro {

	private JFrame frame;
	private JTextField txtFieldConsultar;
	private JTable table;

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
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{139, 86, 65, 0};
		gridBagLayout.rowHeights = new int[]{23, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		txtFieldConsultar = new JTextField();
		GridBagConstraints gbc_txtFieldConsultar = new GridBagConstraints();
		gbc_txtFieldConsultar.anchor = GridBagConstraints.WEST;
		gbc_txtFieldConsultar.insets = new Insets(0, 0, 5, 5);
		gbc_txtFieldConsultar.gridx = 1;
		gbc_txtFieldConsultar.gridy = 0;
		frame.getContentPane().add(txtFieldConsultar, gbc_txtFieldConsultar);
		txtFieldConsultar.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscar.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnBuscar.gridx = 1;
		gbc_btnBuscar.gridy = 1;
		frame.getContentPane().add(btnBuscar, gbc_btnBuscar);
		
		table = new JTable();
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.gridwidth = 3;
		gbc_table.insets = new Insets(0, 0, 0, 5);
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 0;
		gbc_table.gridy = 4;
		frame.getContentPane().add(table, gbc_table);
	}

}
