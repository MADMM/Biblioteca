package Modelo;

public class Autor {
	int id;
	String Nombre;
	public Autor(int id, String nombre) {
		super();
		this.id = id;
		Nombre = nombre;
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

}

