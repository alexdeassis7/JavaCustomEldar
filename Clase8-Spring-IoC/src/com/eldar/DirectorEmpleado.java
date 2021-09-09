package com.eldar;

public class DirectorEmpleado implements Empleados {
	// Creamos un atributo del tipo CreacionInformes (la interface) , para la
	// inyeccion de dependencia

	private CreacionInforme informeNuevo ;

	public DirectorEmpleado(CreacionInforme informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	// implementamos los dos metodos abstractos de la inteface Empleados
	@Override
	public String getTareas() {
		return "Gestiono la nomina de todos los empleado de la empresa";

	}

	@Override
	public String getInforme() {
		return "Informe Creado por el director";
	}

}
