package com.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

//con esta anotacion le indicamos explicitamente a partir de la java 1.7 que utilice los nombres 
//de los metodos para ejecutar en ese order de nombre ascendente
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MethodOrderTestJunit {
	

	
	@Test
	public void test1first() {
		System.out.println("test1");
	}
	
	
	
	@Test
	public void test2Second() {
		System.out.println("test2");
	}
	
	@Test
	public void test3Three() {
		System.out.println("test3");
	}

}
