package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.models.EmpleadoBO;

public class EmpleadoBOTest {

	@Test
	public void testCalculaSalarioBruto1() {
		float resultadoReal = EmpleadoBO.calculaSalarioBruto(TipoEmpleado.vendedor, 2000.0f, 8.0f);
		float resultadoEsperado = 1360.0f;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
	}

	@Test
	public void testCalculaSalarioBruto2() {
		float resultadoReal = EmpleadoBO.calculaSalarioBruto(TipoEmpleado.vendedor, 1500.0f, 3.0f);
		float resultadoEsperado = 1260.0f;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
	}

	@Test
	public void testCalculaSalarioNeto1() {
		float resultadoReal = EmpleadoBO.calculaSalarioNeto(TipoEmpleado.vendedor, 2000.0f, 3.0f);
		float resultadoEsperado = 1640.0f;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);

	}

	@Test
	public void testCalculaSalarioNeto2() {
		float resultadoReal = EmpleadoBO.calculaSalarioNeto(TipoEmpleado.vendedor, 1500.0f, 3.0f);
		float resultadoEsperado = 1230.0f;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);

	}

}
