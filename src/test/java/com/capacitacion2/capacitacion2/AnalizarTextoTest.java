package com.capacitacion2.capacitacion2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.capacitacion2.capacitacion2.clase5Unitarias.AnalizarTexto;

public class AnalizarTextoTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");		
	}*/
	private AnalizarTexto objAnalizarTexto;
	private String oracion;
	
	@Before
	public void before() {
		System.out.println("se ejecuto before(1)");
		String oracion = "esta clase es de pruebas unitarias";
		objAnalizarTexto = new AnalizarTexto(oracion);
		 
	}
	
	@Test
	public void testdeterminarNumeroDePalabras () {
		System.out.println("se ejecuto test determinarNumeroDePalabras()");
    	//System.out.println("El numero de palabras de la oracion es: " + AnalizarTexto.determinarNumeroDePalabras(oracion));
    	int valorEsperado = 6;
    	int valorRecibido= objAnalizarTexto.determinarNumeroDePalabras();

    	assertEquals(valorEsperado, valorRecibido);
	}

	@Test
	public void testcantidadCaracteres() {
		System.out.println("se ejecuto test testcantidadCaracteres()");
		int esperado = 34;
		int resultado=  objAnalizarTexto.cantidadCaracteres();
		assertEquals(esperado, resultado);
	}
	

@After
public void aftes () {
	System.out.println("se ejecuto test after(1)");
}


	
}
