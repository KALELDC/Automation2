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



/*public class AutomatizacionPaginaWeb extends PageFactory{
private WebDriver webDriver;
	
	public AutomatizacionPaginaWeb (WebDriver webDriver) {
		this.webDriver = webDriver;
		PageFactory.initElements(webDriver, AutomatizacionPaginaWeb.class);
		
	}
	
	@FindBy (className = "premium-blog-content-wrapper empty-thumb")
	private WebElement cargodisponible;
	
	public void interactuarConSophos () {

		WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize() ;		
		chrome.navigate().refresh();
//		WebElement clicPP = chrome.findElement(By.xpath("/html/body"));
//		clicPP.click();
//		String originalWindow = chrome.getWindowHandle();
//		chrome.switchTo().window(originalWindow);
		WebElement clictrabaja = chrome.findElement(By.id("mega-menu-item-1541") );
		clictrabaja.click();
			chrome.close(); 	
	}	
	
	
	public void imprimircargo() {
		//int acumulador= 1;
		//for (WebElement posicion : cargodisponible) {
			System.out.println(cargodisponible.getText());
			//acumulador++;
		//}
	}
	
}*/


public class AutomatizacionPaginaWeb {
	private WebDriver webDriver;
	
	public AutomatizacionPaginaWeb (WebDriver webDriver) {
		this.webDriver = webDriver;
	}
		
	public void interactuarConSophos () {
		
		webDriver.manage().window().maximize() ;
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 		
		webDriver.navigate().refresh();
		WebElement clictrabaja = webDriver.findElement(By.id("mega-menu-item-1541") );
		clictrabaja.click();
		
	}	
	

	
	
	public void imprimircargo() {
		//Este busca el elemento por Xpath
		
		/*
		//WebElement cargodisponible = webDriver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div[1]/div[2]/div[4]/div"));
		//WebElement cargodisponible = webDriver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div[1]/div[2]/div[5]/div");
		//WebElement cargodisponible = webDriver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div[1]/div[2]/div[6]/div");
		//WebElement cargodisponible = webDriver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div[1]/div[2]/div[7]/div"));
		//WebElement cargodisponible = webDriver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div[1]/div[2]/div[8]/div");
		//WebElement cargodisponible = webDriver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div[1]/div[2]/div[9]/div");
		WebElement cargodisponible1= webDriver.findElement(By.className("premium-blog-post-container"));
		WebElement cargodisponible2= webDriver.findElement(By.className("premium-blog-post-container"));
		
		System.out.println(cargodisponible1.getText());
		System.out.println(cargodisponible2.getText());

		System.out.println("LO LOGREE 100%");
		*/
		//System.out.println(cargodisponible.getText());
		int acumulador= 1;
		for (acumulador=1; acumulador<=9; acumulador++) {
			System.out.println("\n"+ "Oferta " + acumulador +": " );
			WebElement nombreOferta= webDriver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div[1]/div[2]/div[" + acumulador +"]/div/div[2]/div[1]/div/h3/a"));
			System.out.println( "Nombre de la oferta : "+ nombreOferta.getText());
			WebElement fechaOferta= webDriver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div[1]/div[2]/div[" + acumulador +"]/div/div[2]/div[1]/div/div/span/span"));   
			System.out.println("Fecha de publicación : "+ fechaOferta.getText());
			//WebElement descripcion= webDriver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div[1]/div[2]/div["+ acumulador +"]/div/div[2]/div[2]/text()"));
			WebElement descripcion= webDriver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div[1]/div[2]/div["+ acumulador +"]/div/div[2]/div[2]"));
		    System.out.println("Descripción : " +  descripcion.getText());
			
			//WebElement cargodisponible= webDriver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div[1]/div[2]/div["+ acumulador +"]/div"));
			//System.out.println(cargodisponible.getText());
		}
			
		
		

		
	}
	
	
	
}
