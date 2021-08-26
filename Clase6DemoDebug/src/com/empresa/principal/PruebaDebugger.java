package com.empresa.principal;

import com.empresa.ClaseParaDepurar;

public class PruebaDebugger {
	public static void main(String[] args) {
		ClaseParaDepurar clase = new ClaseParaDepurar();
		double valor = clase.echaCuentas();
		System.out.println("la Salida del metodo echaCuentas() es : " + valor);
	}
}
