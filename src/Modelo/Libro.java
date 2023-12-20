package Modelo;

/**
 * Clase que representa un libro con sus atributos básicos.
 * Esta clase contiene los atributos id, Nombre y Autor, así como métodos para acceder y modificar estos atributos.
 * 
 * @author Miguel Angel
 * @version 1.0
 */
public class Libro {
    private int id;
    private String Nombre;
    private String Autor;

    /**
     * Constructor de la clase Libro.
     * 
     * @param id El identificador único del libro.
     * @param nombre El nombre del libro.
     * @param autor El autor del libro.
     */
    public Libro(int id, String nombre, String autor) {
        this.id = id;
        this.Nombre = nombre;
        this.Autor = autor;
    }

    /**
     * Método getter para obtener el ID del libro.
     * 
     * @return El ID del libro.
     */
    public int getId() {
        return id;
    }

    /**
     * Método setter para establecer el ID del libro.
     * 
     * @param id El ID a establecer para el libro.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método getter para obtener el nombre del libro.
     * 
     * @return El nombre del libro.
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Método setter para establecer el nombre del libro.
     * 
     * @param nombre El nombre a establecer para el libro.
     */
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    /**
     * Método getter para obtener el autor del libro.
     * 
     * @return El autor del libro.
     */
    public String getAutor() {
        return Autor;
    }

    /**
     * Método setter para establecer el autor del libro.
     * 
     * @param autor El autor a establecer para el libro.
     */
    public void setAutor(String autor) {
        this.Autor = autor;
    }
}
