package com.capacitacion2.capacitacion2;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;

import javax.swing.event.ListDataEvent;
import javax.swing.plaf.basic.BasicComboPopup.ListDataHandler;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.capacitacion2.capacitacion2.clase6assertion.MultiMetodo;

@RunWith(value = Parameterized.class)
public class MultiMetodoTest {
	private MultiMetodo ObjMetodo;
	private int experado;
	private int variableA;
	private int variableB;
	
	public MultiMetodoTest(int experado, int variableA, int variableB) {
		this.experado = experado;
		this.variableA = variableA;
		this.variableB = variableB;
		
	}
	
	// forma de pasarle varios valores  a Junit en forma de objeto e itera varias veces
/*	@Parameters
	public static Iterable datosEntrada() {
		List<Object[]> listaDeValores = new ArrayList<>();
		listaDeValores.add(new Object[] {"2,10,5"}); //10/5=2
		listaDeValores.add(new Object[] {"3,21,7"}); //21/7=3
		listaDeValores.add(new Object[] {"5,100,20"}); //100/20=5
		return listaDeValores;
	}
	*/
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

	// Expected significa que espera un error
	@Test (expected = ArithmeticException.class)
	public void testDividir2() {
		assertEquals(0, ObjMetodo.dividir2(10, 0));
	}
	
	@Test
	public void testDividirValoresPositivos () {
		/*int divisor = 5;
		int dividendo = 25;
		int respuesta = ObjMetodo.dividir(dividendo, divisor);
		int valorEsperado = 5;
		assertEquals (valorEsperado,respuesta);*/
		
		int respuesta = ObjMetodo.dividir(variableA, variableB);
		assertEquals (experado,respuesta);
	}
	
	// le decimos al sistema que se demora maximo 100 milisegundos
	@Test(timeout = 4000)
	public void testTimeOut () {
		ObjMetodo.timeOut();
		//System.out.println("hola");
		assertTrue(true);
	}
	
	
		
		
	
		
}
	

