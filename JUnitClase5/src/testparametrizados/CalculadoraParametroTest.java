package testparametrizados;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import calculadorados.CalculadoraDos;

//Test Parametrizados

@RunWith(value = Parameterized.class)
//esta anotacion sive para indicarle a Junit que corra el test con un Runner en particular en este caso el 
//runner es parameterized ,es el contructor que se ocupa de realizar las pruebas parametrizadas y necesita un 
//metodo static  , public y que retorne un "Iterable"
public class CalculadoraParametroTest {

	@Parameters // le indicamos a Junit que estos son los parametros para ejecutar el test parametrizado
	public static Iterable<Object[]> getData() {
		
		// el array debera tener tantos parametros como posea el constructor en este
		// caso seran 3 (a , b, expected)
		// cuando se ejecute la prueba unitaria buscara este metodo por que posee la
		// anotacion @Parameters
		// de aqui se extraen los "n" datos para realizar los "n" test

		List<Object[]> obj = new ArrayList<>();
		obj.add(new Object[] { 3, 1, 4 }); // agrego un set de datos para el test
		obj.add(new Object[] { -3, -2, -5 });
		obj.add(new Object[] { 3, 3, 6 });
		obj.add(new Object[] { 23, 1, 24 });

		return obj;
		
		/*Otra opcion es realizar por ejemplo este iterable*/
//		return Arrays.asList(new Object[][] {
//			{3,1,4},{2,3,5},{3,3,6}
//		});		
		
	}

	private int a, b, expected;

	// creamos un constructor para nuestro test parametrizado
	public CalculadoraParametroTest(int a, int b, int expected) {
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	@Test
	public void testAdd() {
		CalculadoraDos calc = new CalculadoraDos();
		int resultado = calc.add(a, b);
		System.out.println("Ejecutando Test Unitario con " + a + " + " + b + " = " + resultado);
		assertEquals(expected, resultado);
	}
}
