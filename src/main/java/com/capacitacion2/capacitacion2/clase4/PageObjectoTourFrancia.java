package com.capacitacion2.capacitacion2.clase4;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class PageObjectoTourFrancia extends PageFactory{
	private WebDriver webDriver;
	
	public PageObjectoTourFrancia (WebDriver webDriver) {
		this.webDriver = webDriver;
		PageFactory.initElements( new AjaxElementLocatorFactory(webDriver, 10) , this);
		
	}
	@FindBy (id="didomi-notice-agree-button")
	private WebElement mensajefeo;
	
	@FindBy (id="selectweb")
	private WebElement ListaSeleccionMultiple;
	
	@FindBy (className = "ue-table-ranking__cyclist-name")
	private List <WebElement> ListaCiclistas;
	
	
	public void mensajefeisimo () {
		mensajefeo.click();
	}
	
	public void seleccionListaDesplegable (String opcion)
	{
		Select select =  new Select(ListaSeleccionMultiple);
        select.selectByVisibleText(opcion);	
	}
	
	public void imprimirListaClicistas() {
		int acumulador= 1;
		for (WebElement posicion : ListaCiclistas) {
			System.out.println(acumulador +": " + posicion.getText());
			acumulador++;
		}
	}

}
