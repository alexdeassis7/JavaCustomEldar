package com.eldar;

public class DirectorEmpleado implements Empleados {
	// Creamos un atributo del tipo CreacionInformes (la interface) , para la
	// inyeccion de dependencia

	private CreacionInforme informeNuevo;

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

	// creamos metodo init: ejecuta tareas antes de que el bean este diponible
	// los metodos no tienen por que llamarse init o destroy
	public void metodoInicial() {
		// aca va el codigo a ejecutar antes que el beans este disponible
		System.out.println("Ejecutando tareas antes de que el bean este listo para su uso ");
	}

	public void metodoFinal() {
		// aca va el codgio que deseamos ejecutar luego de que el bean "muera"
		System.out.println("Ejecutando tareas dentro del metodo destroy");
	}

}
