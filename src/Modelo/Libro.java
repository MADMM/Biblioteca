package Modelo;

public class Libro {
	int id;
	String Nombre;
	Autor autor;
	public Libro(int id, String nombre, Autor autor) {
		super();
		this.id = id;
		Nombre = nombre;
		this.autor = autor;
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
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	

}
