package com.capacitacion2.capacitacion2;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.capacitacion2.capacitacion2.ProyectoFinal.AutomatizacionPaginaWeb;
import com.capacitacion2.capacitacion2.clase4.ManagerDriver;
import com.capacitacion2.capacitacion2.clase4.PageObjectoTourFrancia;
import com.capacitacion2.capacitacion2.clase5Unitarias.AnalizarTexto;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	Scanner selec = new Scanner (System.in);
    	String seleccionarpagina = "";
    	String urlPagina= "";
    	String nombreNavegador= "";
        System.out.println( "Hola Maestro Eder!" );
        System.out.println( "Hi, I hope to do start my final project !" );
        System.out.println( "Selecciona la opción a automatizar : "
        		+ "\n- sophos"
        		+ "\n- Unitaria"
        		+ "\n- tour \n" );
              
        seleccionarpagina= selec.nextLine();
   	 
        switch (seleccionarpagina) {

        case "sophos" : 
        	System.out.println( "Digita el navegador : google \n" );
          	 nombreNavegador = selec.nextLine();
        	urlPagina="https://www.sophossolutions.com";
       	    ManagerDriver objManager1 = new ManagerDriver(nombreNavegador, urlPagina);
       	 objManager1.navegarPagina();
        	 AutomatizacionPaginaWeb auto= new AutomatizacionPaginaWeb (objManager1.getWebDriver());
             auto.interactuarConSophos();
             espera (5);
             System.out.println("viene lo dificil");
             auto.imprimircargo();
             objManager1.cerrarNavegador();
			break;

        
        case "tour" : 
        	System.out.println( "Digita el navegador : google \n" );
          	 nombreNavegador = selec.nextLine();
        	urlPagina="https://www.marca.com/ciclismo/tour-francia/clasificacion.html";
       	    ManagerDriver objManager = new ManagerDriver(nombreNavegador, urlPagina);
       	 objManager.navegarPagina();
       	 PageObjectoTourFrancia objTour = new PageObjectoTourFrancia(objManager.getWebDriver());
       	espera (10);
       	objTour.mensajefeisimo();
       	espera (5);
       	 objTour.seleccionListaDesplegable("Etapa 17");
       	espera (5);
       	 objTour.imprimirListaClicistas();
       	 objManager.cerrarNavegador();
			break;	
			
        
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
