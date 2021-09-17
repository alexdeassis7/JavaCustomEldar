package com.eldar;

public class JefeEmpleado implements Empleados{

	@Override
	public String getTareas() {
		return "soy el jefe y me encargo de toda las treas operativas";
	}

	@Override
	public String getInforme() {
		return "";
	}
	
	

}
