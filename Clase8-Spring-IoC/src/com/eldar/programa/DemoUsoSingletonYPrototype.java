package com.eldar.programa;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eldar.DirectorEmpleado;
import com.eldar.Empleados;

public class DemoUsoSingletonYPrototype {

	public static void main(String[] args) {
		// paso 1 ) cargar el xml
		// primero creo un contexto y le pasamos el nombre del archivo xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		// paso 2)
		// solicitarle el bean al archivo xml pasandole el alias o id ,
		DirectorEmpleado juan = contexto.getBean("miEmpleado", DirectorEmpleado.class);

		DirectorEmpleado pedro = contexto.getBean("miEmpleado", DirectorEmpleado.class);

		if (juan == pedro) {
			System.out.println(" juan y pedro apunta a la misma direccion de memoria");
		} else {
			System.out.println(" juan y pedro apunta NOOOOOOOOOOO a la misma direccion de memoria");
		}
		
	
		System.out.println(juan);
		System.out.println(pedro);

		// paso 4 )
		// cerramos el contexto para liberar los recursos
		contexto.close();

	}
}
