package Vistas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 * Formulario diseñado para realizar consultas de libros.
 * Este formulario permite al usuario introducir criterios de búsqueda y realizar la consulta correspondiente.
 * 
 * la logica no esta implementada porque no hay conexión con la bb.dd
 * 
 * es solo una aplicación de muestra 
 * 
 * @author Miguel Angel
 * @version 1.0
 */
public class ConsultarLibro {

    private JFrame frame;
    private JTextField txtFieldConsultar;

    /**
     * Método principal que lanza la aplicación.
     * 
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
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
     * Constructor que inicializa el formulario de consulta.
     */
    public ConsultarLibro() {
        initialize();
    }

    /**
     * Método para inicializar el contenido del formulario.
     * Este método establece los componentes del formulario y su disposición.
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

    /**
     * Método para establecer la visibilidad del formulario.
     * 
     * @param b Valor booleano que indica si el formulario debe ser visible o no.
     */
    public void setVisible(boolean b) {
        // Implementación pendiente
    }
}
