package com.capacitacion2.capacitacion2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capacitacion2.capacitacion2.clase6assertion.MultiMetodo;

public class MultiMetodoTest {
	MultiMetodo ObjMetodo;
	
	@Before
public void inicializarPrecondiciones() {
		ObjMetodo = new MultiMetodo();
	}
	
	@Test
	public void testGetPalabra() {
		String expected = "Palabra1";
		String resultado = ObjMetodo.getPalabra("1");
		assertEquals(expected, resultado);
	}
	
	@Test
	public void testgetGetArregloCarcteres () {
		String palabra = "clase 6";
		char[]  arregloesperado = palabra.toCharArray();
		char[] actual = ObjMetodo.getArregloCaracteres(palabra);
		assertArrayEquals(arregloesperado, actual);
		
	}
	@Test
	public void testGetOpositive () {
		boolean esperado = false;
		boolean actual = ObjMetodo.getOpositive(true);
		assertEquals(esperado, actual);
	}

	@Test
	public void testDividir () {
		int esperado = 5;
		int resultado = ObjMetodo.dividir(10, 2);
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testDividir1 () {
		double esperado = 5;
		double resultado = ObjMetodo.dividir1(10, 2);
		assertEquals(esperado, resultado,0.1);
	}
	
	@Test
	public void testMetodoNulo() {
		assertNull(ObjMetodo.metodoNulo());
	}

	@Test (expected = ArithmeticException.class)
	public void testDividir2() {
		assertEquals(0, ObjMetodo.dividir2(10, 0));
	}
		
}
	

