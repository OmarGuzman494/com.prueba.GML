package com.prueba.GML.pageObjects;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;



public class ValidarFechasPageObjects extends PageObject {
	
	
	@FindBy(xpath="//a[@href='index.php' and contains(text(),'Home')]")
	static WebElementFacade lblHome;
	
	@FindBy(xpath="//tr[@align]//td[@colspan]//font[@face]//b")
	static WebElementFacade lblFechaPagina;
	
	
	
	

	public WebElementFacade getLblHome() {
		return lblHome;
	}

	public WebElement getLblFechaPagina() {
		return lblFechaPagina;
	}
	
	

}
