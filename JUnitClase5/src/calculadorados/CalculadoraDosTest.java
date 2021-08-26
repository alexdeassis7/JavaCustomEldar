package calculadorados;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


//podriamos llegar a determinar el orden de los metodos por ejemplo quiero que se ejecute el testA luego el testB ... etc 
//utilizar NAME_ASCENDING (orden lexicográfica) , ejemplo : 
//@Test
// public void p1_primerTest() {}
//@Test
//public void p2_segundoTest() {}

public class CalculadoraDosTest {

	static CalculadoraDos calc;

	@BeforeClass // Este metodo se ejecutara una UNICA vez al inicio de la ejecucion de la clase
					// CalculadoraDosTest
	// sirve por ejemplo para crear objetos muy pesados o asegurarnos que un objeto
	// se crea siempre que se inicia la clase
	public static void beforeClass() {// debe ser static si o si o para que funcione correctamente
		System.out.println(" BeforeClass() ");
		calc = new CalculadoraDos();
	}

	@Before // Sirve para ejecutar codigo antes de que se ejecute cada prueba unitaria
			// (metodo con la anotation @Test)
	public void before() {
		System.out.println("    Before() ");
		calc = new CalculadoraDos();// esto no forma parte de la prueba en si , si no uq ees una precondicion para
									// ejecutar el test
	}

	@After // codigo que se ejecuta despues de finalizar cada uno de los test unitarios
			// (metodos con la anotation @Test)
	public void after() {
		System.out.println("    After() ");
		calc.clear();
	}

	@AfterClass // codigo que se ejecutara una UNICA vez al final de la ejecucion de la clase
				// CalculadoraDosTest
	public static void afterClass() { // este metodo debe ser estatico si o si para que se pueda ejecutar
										// correctamente
		System.out.println(" AfterClass() ");
		calc.clear();
	}

	@Test // prueba unitaria
	public void testSum() {
		System.out.println("        Ejecutando Test Unitario: testSum() ");
		// CalculadoraDos calc = new CalculadoraDos(); //Codigo repetido en todos los
		// test
		int result = calc.add(3, 2);
		int esperado = 6; // Esto hace que nuestro test falle
		assertEquals(esperado, result);
	}

	@Test
	public void testAnsSum() {
		System.out.println("        Ejecutando Test Unitario: testAnsSum()");
		int result = calc.add(6, 4);
		int esper = 10;
		assertEquals(esper, result);
	}
	

	@Test
	public void testDiv() {
		System.out.println("        Ejecutando Test Unitario: testDiv()");
		int result = calc.div(6, 2);
		assertEquals(result, result);
	}

	// este metodo deberia chequear que cuando se intente dividir por cero se genere
	// un ArithmeticException
	@Test(expected = ArithmeticException.class) // esta prueba funcionara por que se espera un error con el "expected",
	// un expected siempre va a fallar si no se lanza la exception que se le indica.
	public void testDivPorCero() {
		System.out.println("        Ejecutando Test Unitario: testDivPorCero()");
		int result = calc.div(5, 0); // forzamos un error intentando dividir por cero
	}

	@Test(timeout = 100)//timeout nos sirve para testear si un metodo tarda mas tiempo de lo normal , en este ejemplo son 
	//100 milisegundos , si modificamos el tiempo NO debera generar una exception
	public void testAlgoritmoOptimo() {
		System.out.println("        Ejecutando Test Unitario: testAlgoritmoOptimo()");
		calc.operacionOptima();
	}
}
