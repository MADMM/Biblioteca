package Modelo;

/**
 * Clase que representa la lógica de la aplicación.
 * Esta clase contiene una instancia de la clase Aspecto para gestionar la configuración visual.
 * 
 * @author Miguel Angel
 * @version 1.0
 */
public class Modelo {
    private Aspecto aspecto;

    /**
     * Constructor por defecto que inicializa el objeto Aspecto.
     */
    public Modelo() {
        this.aspecto = new Aspecto();
    }

    /**
     * Método getter para obtener la configuración de aspecto.
     * 
     * @return La configuración de aspecto actual.
     */
    public Aspecto getAspecto() {
        return aspecto;
    }

    /**
     * Método setter para establecer la configuración de aspecto.
     * 
     * @param aspecto La configuración de aspecto a establecer.
     */
    public void setAspecto(Aspecto aspecto) {
        this.aspecto = aspecto;
    }


}
