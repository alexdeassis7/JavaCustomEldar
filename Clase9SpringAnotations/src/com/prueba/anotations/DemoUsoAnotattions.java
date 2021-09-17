package com.prueba.anotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.interfaces.IEmpleados;

public class DemoUsoAnotattions {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		IEmpleados comercialDario = contexto.getBean("comercialExperimentado", IEmpleados.class);
		IEmpleados comercialSantiago = contexto.getBean("comercialExperimentado", IEmpleados.class);

		if (comercialDario == comercialSantiago) {
		
			System.out.println("Direcciones de memoria ");
			System.out.println("SINGLETON: apuntan al mismo objeto en memoria ");
			System.out.println(comercialDario + "\n" + comercialSantiago);
		
		} else {

			System.out.println("PROTOTYPE : NO APUNTAN AL MISMO LUGAR EN MEMORIA , son dos instancias diferentes");
			System.out.println(comercialDario + "\n" + comercialSantiago);
		}

		System.out.println(comercialDario.getTareas());

		System.out.println(comercialDario.getInforme());
		
		contexto.close();
	}
}
