package ar.com.eldar;

public class SeleccionFutbol {

	public int id;
	public String nombre;
	public String apellido;

	public SeleccionFutbol(int id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public SeleccionFutbol() {
	}

	public void viajar() {
		System.out.println("Hola estoy viajando");
	}

	@Override
	public String toString() {
		return "SeleccionFutbol [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	

	
	
}
