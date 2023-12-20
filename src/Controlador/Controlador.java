package Controlador;

import Vistas.ConsultarLibro;
import Vistas.CrearLibro;
import Vistas.PanelDeControl;
import Modelo.Modelo;
import Modelo.Aspecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Clase Controlador que actúa como intermediario entre la Vista y el Modelo.
 * Esta clase gestiona las interacciones del usuario y las comunica con el modelo subyacente.
 * 
 * @author Miguel Angel
 * @version 1.0
 */
public class Controlador {
    private Modelo modelo;
    private PanelDeControl vista;

    /**
     * Constructor de la clase Controlador.
     * 
     * @param modelo El modelo de datos de la aplicación.
     * @param vista La vista principal de la aplicación.
     */
    public Controlador(Modelo modelo, PanelDeControl vista) {
        this.modelo = modelo;
        this.vista = vista;
        ManejadorEventos();
    }

    /**
     * Método para iniciar la vista y conectarla con el modelo.
     * Este método establece el controlador en la vista y la inicializa.
     */
    public void iniciarVista() {
        vista.setControlador(this);
        vista.inicializar();
    }

    /**
     * Acción del botón "Consultar" en PanelDeControl.
     * Este método muestra el formulario ConsultarLibro al ser invocado.
     */
    public void btnConsultarClicked() {
        ConsultarLibro consultoLibro = new ConsultarLibro();
        consultoLibro.setVisible(true);
    }

    /**
     * Acción del botón "Crear" en PanelDeControl.
     * Este método muestra el formulario CrearLibro al ser invocado.
     */
    public void btnCrearClicked() {
        CrearLibro creoLibro = new CrearLibro();
        creoLibro.setVisible(true);
    }

    /**
     * Acción del botón "Guardar" en CrearLibro.
     * Este método guarda el libro con el nombre proporcionado y realiza las operaciones correspondientes.
     * 
     * @param nombreLibro El nombre del libro a guardar.
     */
    public void btnGuardarClicked(String nombreLibro) {
        // Aquí iría la lógica para guardar el libro con el nombre proporcionado.
    	// la aplicación no se conecta con ninguan bb.dd luego no implemento logica
    	
    }
    
    public void ManejadorEventos() {
    	vista.btnConsultar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("HOLA");
			}
		});
    }
    
    
}

