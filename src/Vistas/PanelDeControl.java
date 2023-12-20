package Vistas;

import java.awt.EventQueue;
import javax.swing.JFrame;

import Controlador.Controlador;

import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Este es el formulario principal del panel de control de la aplicación.
 * Aquí se presentan opciones como "Consultar" y "Crear", que permiten al usuario interactuar con la biblioteca.
 * Además, este formulario establece la interfaz para conectar con el controlador de la aplicación.
 * 
 * @author Miguel Angel
 * @version 1.0
 */
public class PanelDeControl {

    private JFrame frmPanelDeControl;  // Ventana principal del panel de control
    public JButton btnConsultar;
    public JButton btnCrear;

    /**
     * Método principal para lanzar la aplicación del panel de control.
     * 
     * @param args Argumentos de la línea de comandos (no se utilizan en este caso).
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
     * Constructor de la clase que inicializa el panel de control.
     */
    public PanelDeControl() {
        initialize();
    }

    /**
     * Método para configurar y añadir los componentes al panel de control.
     */
    private void initialize() {
        frmPanelDeControl = new JFrame();
        frmPanelDeControl.setTitle("Panel de Control");
        frmPanelDeControl.setBounds(100, 100, 450, 234);
        frmPanelDeControl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmPanelDeControl.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        btnConsultar = new JButton("Consultar");  // Botón para consultar libros
        btnConsultar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Implementación de la lógica para consultar libros (pendiente)
            }
        });
        frmPanelDeControl.getContentPane().add(btnConsultar);
        
        btnCrear = new JButton("Crear");  // Botón para crear un nuevo libro
        frmPanelDeControl.getContentPane().add(btnCrear);
    }

    /**
     * Método para establecer el controlador de la aplicación.
     * 
     * @param controlador El controlador de la aplicación.
     */
    public void setControlador(Controlador controlador) {
        // Implementación pendiente para establecer el controlador
    }

    /**
     * Método para establecer la visibilidad del panel de control.
     * 
     * @param b Valor booleano que indica si el panel de control debe ser visible o no.
     */
    public void setVisible(boolean b) {
        // Implementación pendiente para establecer la visibilidad del panel
    }

    /**
     * Método para inicializar el panel de control.
     */
    public void inicializar() {
        // Implementación pendiente para inicializar el panel
    }
}
