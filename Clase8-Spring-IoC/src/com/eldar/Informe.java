package com.eldar;

public class Informe implements CreacionInforme {

	@Override
	public String getInforme() {

		return "Este es un informe detallado , y es la caracteristica en comun que tienen todos los objetos"
				+ " (Secretario , director y jefe )";
	}

}
