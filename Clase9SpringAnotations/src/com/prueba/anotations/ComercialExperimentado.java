package com.prueba.anotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.interfaces.CreacionInformesFinancieros;
import com.interfaces.IEmpleados;

//registro el bean en el contenedor , no es necesario que el id coincida con el nombre de la clase y
//podemos prescidinr del mismo  y Spring tomaria el nombre de la clase como id pero con la 
//primer letra en minuscula 
@Component("comercialExperimentado")

//modificamos el scope mediante una anotacion para que Spring sea capaz de clonar varias instancias de un objeto
//@Scope("prototype")
public class ComercialExperimentado implements IEmpleados {

	private CreacionInformesFinancieros informeNuevo;

	// en la versiones mas nuevas de spring si tenemos un unico constructor podemos
	// omitir el @Autowired y todo seguira funcionando
	// pero si luego escaneamos , pero es recomendable siempre poner la anotaciones
	// para que cuando escalemos la app no
	// genere incomvenientes
	@Autowired
	public ComercialExperimentado(CreacionInformesFinancieros informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		return "Soy un Super Vendedor y me gano todos los premios por vender mucho";
	}

	@Override
	public String getInforme() {
		return informeNuevo.getInformeFinanciero();
	}

	// Para usar PostConstruct y pre destroy chequear que tengamos la libreria
	// javax.anotation-api
	@PostConstruct
	public void ejecutarDespuesCreacion() {
		System.out.println("ejecutamos este proceso tras al creacion de nuestro bean en el container ");
	}

	@PreDestroy
	public void ejecutaAntesDestruccion() {
		System.out.println("Ejecutando antes de la destruccion");
	}

}
