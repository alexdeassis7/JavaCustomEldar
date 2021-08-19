package calculadora;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CalculadorTest {

	@Test // esta anotacion marca al metodo como una prueba unitaria
	public void testSuma() {
		int resultado = Calculadora.suma(8, 3);
		int esperado = 11;
//		**Assert : son los metodos uqe nos brinda Junit para testear nuestros valores / objetos
		assertEquals(esperado, resultado);
	}

	@Test
	public void testResta() {
		int resultado = Calculadora.resta(3, 2);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}

//	@Test
//	public void test() {
//		// llamada a la funcion fail()
//		// esto hace que automaitcamente la prueba falle
//		fail("tu codigo no funca ! , segui participando");
//	}
}
