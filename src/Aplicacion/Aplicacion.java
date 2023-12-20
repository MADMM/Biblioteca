package Aplicacion;

/**
 * La clase principal de la aplicación, que inicializa los componentes principales.
 * Esta clase crea una instancia del panel de control, el modelo y el controlador.
 * Finalmente, inicia la vista a través del controlador.
 * 
 * @author Miguel Angel
 * @version 1.0
 */
import Vistas.PanelDeControl;
import Controlador.Controlador;
import Modelo.Modelo;

public class Aplicacion {

    /**
     * El método principal que se ejecuta al iniciar la aplicación.
     * 
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        // Crear una instancia del panel de control
        PanelDeControl panel = new PanelDeControl();
        
        // Crear una instancia del modelo
        Modelo modelito = new Modelo();
        
        // Crear una instancia del controlador y pasarle el modelo y el panel de control
        Controlador control = new Controlador(modelito, panel);
        
        // Iniciar la vista a través del controlador
        control.iniciarVista();
    }
}
