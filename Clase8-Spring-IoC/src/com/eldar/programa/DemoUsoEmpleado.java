package com.eldar.programa;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eldar.DirectorEmpleado;
import com.eldar.Empleados;
import com.eldar.Informe;
import com.eldar.JefeEmpleado;

public class DemoUsoEmpleado {
	public static void main(String[] args) {

		// creamos objetos de tipo empleado de la forma clasica , sin spring
//		JefeEmpleado e1 = new JefeEmpleado();
//		Informe  inf = new Informe();
//		Empleados e2 = new DirectorEmpleado(inf);
//		System.out.println(e2.getInforme());
//		System.out.println(e2.getTareas());

//		ahora hagamoslo con Spring 

		// paso 1 ) cargar el xml
		// primero creo un contexto y le pasamos el nombre del archivo xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		// paso 2)
		// solicitarle el bean al archivo xml pasandole el alias o id ,
		Empleados juan = contexto.getBean("miEmpleado", Empleados.class);

		// paso 3) utilizamos el objeto que nos brindo Spring de su contenedor
		System.out.println("Utilizamos nuestro primer bean : " + juan.getTareas());

		// Demo uso de la dependencia Inyectada por Spring
		// la ventaja de esto es q ue ahora podemos reutilizarlo en otra clase como por
		// ejemplo en JefeEmpleado.java

		System.out.println(juan.getInforme());

		// paso 4 )
		// cerramos el contexto para liberar los recursos
		contexto.close();

	}
}
