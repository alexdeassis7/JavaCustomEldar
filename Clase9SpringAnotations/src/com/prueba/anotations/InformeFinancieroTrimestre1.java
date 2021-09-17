package com.prueba.anotations;

import org.springframework.stereotype.Component;

import com.interfaces.CreacionInformesFinancieros;

//esta clase es la dependencia de "comercial Experimentado 

@Component
public class InformeFinancieroTrimestre1 implements CreacionInformesFinancieros{

	@Override
	public String getInformeFinanciero() {
		return "Presentacion del informe financiero del primer trimestre del año";
	}

}
