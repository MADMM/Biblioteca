package Vistas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 * Este es el formulario para crear un nuevo libro en la biblioteca.
 * Aquí puedo  ingresar el nombre del libro que deseas añadir a la colección.
 * Una vez ingresado el nombre, puedes guardar la información utilizando el botón "Guardar".
 * 
 * @author Miguel Angel
 * @version 1.0
 */
public class CrearLibro {

    private JFrame frame;  // Ventana principal del formulario
    private JTextField txtlibro;  // Campo de texto para ingresar el nombre del libro
    private JButton btnGuardar;  // Botón para guardar la información del libro

    /**
     * Método principal para lanzar la aplicación del formulario.
     * 
     * @param args Argumentos de la línea de comandos (no se utilizan en este caso).
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
     * Constructor de la clase que inicializa el formulario.
     */
    public CrearLibro() {
        initialize();
    }

    /**
     * Método para configurar y añadir los componentes al formulario.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 95);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        JLabel lblNewLabel = new JLabel("Nombre del libro");  // Etiqueta para indicar el campo de texto
        frame.getContentPane().add(lblNewLabel);
        
        txtlibro = new JTextField();  // Campo de texto para ingresar el nombre del libro
        frame.getContentPane().add(txtlibro);
        txtlibro.setColumns(10);
        
        btnGuardar = new JButton("Guardar");  // Botón para guardar la información del libro
        frame.getContentPane().add(btnGuardar);
    }

    /**
     * Método para establecer la visibilidad del formulario.
     * 
     * @param b Valor booleano que indica si el formulario debe ser visible o no.
     */
    public void setVisible(boolean b) {
        frame.setVisible(b);  // Establecer la visibilidad del formulario según el valor booleano
    }
}
