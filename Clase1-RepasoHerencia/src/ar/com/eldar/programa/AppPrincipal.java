package ar.com.eldar.programa;

import ar.com.eldar.Futbolista;
import ar.com.eldar.SeleccionFutbol;

public class AppPrincipal {
	
	public static void main(String[] args) {
			
		SeleccionFutbol sf = new SeleccionFutbol();
		
		
		Futbolista f = new Futbolista(12,"pedro", "butquest","9", "delantero");
		
		System.out.println(f.toString());
		//metodo heredado 
		f.viajar();
		//metodo de la clase hija
		f.concentrarse();
		f.jugarPartido();
		
		System.out.println(f.getDorsal() + f.getPosicion());
			
	}
	 
}
