package com.capacitacion2.capacitacion2;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.capacitacion2.capacitacion2.clase6assertion.Calculadora;


public class CalculadoraTest {
	Calculadora objCalcu;
 
	@Before
public void inicializarPrecondiciones() {
		objCalcu = new Calculadora();
	}
 
/*	@Test
	public void menu () {
		int opc = 1;
		int a = 5;
		int b = 5;
		int esperado = 10;		
		int resultado = objCalcu.menu(opc);
		assertEquals(esperado, resultado);
	}*/
	
	@Test
	public void testSuma () {
		int esperado = 12;
		int resultado = objCalcu.suma(10, 2);
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testResta () {
		int esperado = 8;
		int resultado = objCalcu.resta(10, 2);
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testMulti () {
		int esperado = 20;
		int resultado = objCalcu.multi(10, 2);
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testDivi () {
		int esperado = 5;
		int resultado = objCalcu.divi(10, 2);
		assertEquals(esperado, resultado);
	}
	
}
