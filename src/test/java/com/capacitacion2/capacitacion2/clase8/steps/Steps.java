package com.capacitacion2.capacitacion2.clase8.steps;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	private List<Integer> listaNumeros;
	private int ultResultado;
	
	@Before
	public void antesDe () {
		listaNumeros = new ArrayList<>();
	 ultResultado=0;
	}
	

	@Before
	public void despuesDe () {
		listaNumeros.clear();;
	 ultResultado=0;
	}
	
	@Given ("^Dada una lista de números$")
	public void Dada_una_lista_de_números() throws Throwable
	{System.out.println("Paso de lista");
	
	}
		

	
	@Given ("^el usuario ingresa el número (\\d+)$")
	public void el_usuario_ingresa_el_número(int arg1) throws Throwable
	{System.out.println("Paso de ingresar numero, número ingresado " + arg1);
	listaNumeros.add(arg1);
		
	}
	
	@When ("^El usuario suma los numeros ingresados$")
	public void El_usuario_suma_los_numeros_ingresados() throws Throwable
	{
		System.out.println("Paso de sumar o when");	
		for (Integer numero: listaNumeros)
		{
			ultResultado = +numero ;
			
		}
		}
	
	
	@Then ("^la suma debe ser igual a (\\d+)$")
	public void la_suma_debe_ser_igual_a (String arg1 ) throws Throwable
	{
		{System.out.println("Then la suma debe ser igual a ");	
	assertEquals(arg1, ultResultado);
		}
	
	
}
	
}
