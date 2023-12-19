package Modelo;

/**
 * ESTA ES LA CLASE LIBRO
 * Los atributos de la clase libro son
 * id
 * Nombre
 * Autor
 * @author Miguel Angel
 * @version 1.0
 */

public class Libro {
	int id;
	String Nombre;
	String Autor;
	public Libro(int id, String nombre, String autor) {
		super();
		this.id = id;
		Nombre = nombre;
		Autor = autor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	

	

}
