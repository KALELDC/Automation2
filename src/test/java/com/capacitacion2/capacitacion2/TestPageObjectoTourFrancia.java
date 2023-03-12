package com.capacitacion2.capacitacion2;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.capacitacion2.capacitacion2.clase4.ManagerDriver;
import com.capacitacion2.capacitacion2.clase4.PageObjectoTourFrancia;
import com.capacitacion2.capacitacion2.clase5Unitarias.AnalizarTexto;

public class TestPageObjectoTourFrancia {
	private PageObjectoTourFrancia objPageObjectoTourFrancia;
	int con= 0;
	private String urlPagina ="https://www.marca.com/ciclismo/tour-francia/clasificacion.html";
	private WebDriver webDriver;

	@Before
	public void before() {
		System.out.println("se ejecuto before()");		

		
	   	urlPagina="https://www.marca.com/ciclismo/tour-francia/clasificacion.html";
	  	    ManagerDriver objManager = new ManagerDriver("google", urlPagina);
	  	 objManager.navegarPagina();
	  	objPageObjectoTourFrancia = new PageObjectoTourFrancia(objManager.getWebDriver());
	  	 //PageObjectoTourFrancia objTour = new PageObjectoTourFrancia(objManager.getWebDriver());
	  	  
	  	espera (2); 	
		objPageObjectoTourFrancia.mensajefeisimo();
	  	espera (1);
	}
	
	@Test
	public void Navegar ()
	{
		System.out.println("se ejecuto Navegar()");	
		
	  	for (con=1; con<22; con++) {	
	  	objPageObjectoTourFrancia.seleccionListaDesplegable("Etapa "+ con);
	  	espera (2);
	  	System.out.println("Etapa "+ con +": ");	
	    objPageObjectoTourFrancia.imprimirCampeon();
	    
	  	}
		
	}
	
	
	
	public static void espera(int tiempo) {
		 try {
			Thread.sleep(tiempo*1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	

}
