package Controlador;
/**
 * Esta es la clase Controlador
 * 
 */
import Modelo.Modelo;

import Vistas.PanelDeControl;

public class Controlador {

    private Modelo miModelo;
    private PanelDeControl miPanelDeControl;

    public Controlador(Modelo miModelo, PanelDeControl miPanelDeControl) {
        super();
        this.miModelo = miModelo;
        this.miPanelDeControl = miPanelDeControl;
    }

    /**
     * Método iniciador del interfaz
     */
    
    public void iniciarVista() {
        // Lógica de inicialización de la vista
      //  miPanelDeControl.inicializar(this);
    }
}
