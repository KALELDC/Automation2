package com.capacitacion2.capacitacion2.ProyectoFinal;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.capacitacion2.capacitacion2.clase4.PageObjectoTourFrancia;
import com.capacitacion2.capacitacion2.clase4.ManagerDriver;



public class AutomatizacionPaginaWeb {
	private WebDriver webDriver;
	
	public AutomatizacionPaginaWeb (WebDriver webDriver) {
		this.webDriver = webDriver;
	}
		
	public void interactuarConSophos () {
		
		webDriver.manage().window().maximize() ;
		webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 		
		webDriver.navigate().refresh();
		WebElement clictrabaja = webDriver.findElement(By.id("mega-menu-item-1541") );
		clictrabaja.click();
		
	}	
	
	public void imprimircargo() {

		int acumulador= 1;
		for (acumulador=1; acumulador<=9; acumulador++) {
			System.out.println("\n"+ "Oferta " + acumulador +": " );
			WebElement nombreOferta= webDriver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div[1]/div[2]/div[" + acumulador +"]/div/div[2]/div[1]/div/h3/a"));
			System.out.println( "Nombre de la oferta : "+ nombreOferta.getText());
			WebElement fechaOferta= webDriver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div[1]/div[2]/div[" + acumulador +"]/div/div[2]/div[1]/div/div/span/span"));   
			System.out.println("Fecha de publicación : "+ fechaOferta.getText());
			WebElement descripcion= webDriver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div[1]/div[2]/div["+ acumulador +"]/div/div[2]/div[2]"));
		    System.out.println("Descripción : " +  descripcion.getText());
			
		}
		}
	}
