package asserts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.math.BigDecimal;

import org.junit.Test;

import calculadora.Calculadora;

public class AssertTest {
	
	@Test
	public void test() {
		
		Calculadora s1 = new Calculadora();
//	    Calculadora s2 = new Calculadora();
		Calculadora s2 = s1 ;
		
		
		String st1 = "hola";
		String st2 = "hola";
		
		assertEquals(st1, st2); //esto no da true por que ambos strings son iguales (implementacion metodo equals)
		
		
		//esto da false por que ambos objetos estan en posisciones 
		//diferentes
		//assertSame(s1, s2); 
		assertEquals(s1, s2); 
		
	}
	
/*
	// En jUnit los assert representan condiciones para verificar si los resultados
	// generados por el
	// código se corresponden con los resultados esperados

	// la prueba va a pasar si el valor de la expresion es true
	assertTrue(expresion booleana)
	assertTrue(String ,expresion booleana)
	
	assertTrue("La temperatura debe ser mayor a 25 grados" ,actualTemperatura > 25);
	
	//la prueba va a pasar si el valor de la expresion es false
	assertFalse(expresion booleana)
	assertFalse(String ,expresion booleana)
		
	//verifica si la referencia a un objeto es nula , el test pasa si el objeto es null
	assertNull(Object);
	assertNull(String ,Object);
	
	//verifica si la referencia a un objeto NO es nula , el test pasa si el objeto NO es null
	assertNotNull(Object);
	assertNotNull(String ,Object);
	
	//compara dos referencias y asegura que los objetos referenciados tienen la misma direccion en memoria 
	//la prueba pasa si los 2 argumentos son el mismo objeto o pertenecen al mismo objeto 
	assertSame(Object esperado , Object Actual);
	assertSame(String message,Object esperado , Object Actual);
		

	//compara dos referencias y asegura que los objetos apuntan a diferentes direcciones en memoria 
	//la prueba pasa si los 2 argumentos son objetos diferentes
	assertNotSame(Object esperado , Object Actual);
	assertNotSame(String message,Object esperado , Object Actual);
		
	//el metodo assertEquals() contiene una sobrecarga para cada metodo predefinido de JAVA (int ,float, double ....etc) 
	//se utiliza para comparar igualdad a nivel de contenido 
	//- la igualdad de tipos primitivos se compara con "=="
	//- la igualdad entre objetos se compara con el metodo equals()
	//assertEquals(valor esperado , valor actual);
	//assertEquals(String mensaje , valor esperado , valor actual);
	int valor = 45;
	assertEquals("el valor debe ser 60 ", 60 , valor );
	assertEquals("el  nombre debe ser Pablo", "Pablo" , personaP1.getNombre() );
	
	
	//causa que un test falle inmediatamente , lo podemos utilizar 
	fail() ;
	
	
	

	assertEquals(String ,valor esperado , valor actual);
*/
}
