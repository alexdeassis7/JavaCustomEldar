package testjunitsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import calculadora.test.CalculadoraTest;
import calculadorados.CalculadoraDosTest;
import testparametrizados.CalculadoraParametroTest;

//esta clase deberia ser creada como una "SuiteJunit" y NO como un "Junit Test"
@RunWith(Suite.class)
@SuiteClasses({ 
	CalculadoraTest.class,
	CalculadoraDosTest.class,
	CalculadoraParametroTest.class})

public class AllTestSuite {

	// esta clase puede estar vacia ,lo importante es lo de "arriba" donde le
	// indicamos el runner Suite.class , luego
	// debemos indicar mediante la anotacion @SuiteClasses entre las llaves "{}"
	// todas las clases test que queremos que se ejecuten y se ejecutaran en el
	// mismo orden en el que fueron escritas

}
