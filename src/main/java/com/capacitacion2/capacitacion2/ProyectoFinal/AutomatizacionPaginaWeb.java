package com.capacitacion2.capacitacion2.ProyectoFinal;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatizacionPaginaWeb {

	public void intractuarConSophos () {
		String UbicaDriver = "src\\main\\java\\resources\\Drivers\\chromedriver.exe";
		String sophos = "https://www.sophossolutions.com/";
		System.setProperty("webdriver.chrome.driver", UbicaDriver);
		WebDriver chrome = new ChromeDriver();
		chrome.get(sophos);
		chrome.manage().window().maximize() ;
		chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 		
		WebElement clicPP = chrome.findElement(By.xpath("/html/body"));
		clicPP.click();
		String originalWindow = chrome.getWindowHandle();
		chrome.switchTo().window(originalWindow);
		WebElement clictrabaja = chrome.findElement(By.id("mega-menu-item-1541") );
		clictrabaja.click();
		
		try {
			Thread.sleep(10000);
		} catch (Exception e){}
		
		
		chrome.close(); 
		chrome.close(); 
		
		
	}
	
}
