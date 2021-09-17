package com.eldar;

public class SecretarioEmpleado implements Empleados{

	private CreacionInforme informeNuevo;

	@Override
	public String getTareas() {
		return "soy un secretario y me gusta recibir ordenes de mi jefe XD";
	}

	@Override
	public String getInforme() {
		return "";
	}
	
	//Inyeccion de dependencias mediante un Setters 
	//para hacer uso de este tipo de inyeccion tenemos que previamente definir el tag "<property>" dentro 
	//de nuestro archivo applicationContext.xml
	public void setInformeNuevo(CreacionInforme informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	
	

}
