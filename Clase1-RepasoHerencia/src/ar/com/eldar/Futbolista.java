package ar.com.eldar;

public class Futbolista extends SeleccionFutbol {

	private String dorsal;
	private String posicion;

	public Futbolista(int id, String nombre, String apellido, String dorsal, String posicion) {
		super(id, nombre, apellido);
		this.dorsal = dorsal;
		this.posicion = posicion;
	}

	public String getDorsal() {
		return dorsal;
	}

	public void setDorsal(String dorsal) {
		this.dorsal = dorsal;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

//	@Override
//	public String toString() {
//		return "Futbolista [dorsal=" + dorsal + ", posicion=" + posicion + ", id=" + id + ", nombre=" + nombre
//				+ ", apellido=" + apellido + "]";
//	}
	@Override
	public String toString() {
		return "Futbolista [dorsal=" + dorsal + ", posicion=" + posicion + ", toString()=" + super.toString() + "]";
	}
	
	public void jugarPartido() {
		System.out.println("Estoy jugando el partido ");
	}

	

	public void concentrarse() {
		System.out.println("Estoy concentrando para el partido ");
	}

	@Override
	public void viajar() {
		System.out.println("Hola estoy viajando solo en clase turista por que no fuy a entrenar con mi team ");
	}

}
