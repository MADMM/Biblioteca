package Modelo;

/**
 * Clase Aspecto que representa la configuración de aspecto y diseño de los formularios.
 * En esta clase se gestionan propiedades como el título y otros elementos visuales.
 * 
 * @author Miguel Angel
 * @version 1.0
 */
public class Aspecto {

    private String titulo;

    /**
     * Método getter para obtener el título del formulario.
     * 
     * @return El título actual del formulario.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Método setter para establecer el título del formulario.
     * 
     * @param titulo El título a establecer para el formulario.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
