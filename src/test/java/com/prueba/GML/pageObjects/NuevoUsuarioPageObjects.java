package com.prueba.GML.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;



public class NuevoUsuarioPageObjects extends PageObject {
	
	@FindBy(xpath="//a[@href='register.php' and contains(text(),'REGISTER')]")
	static WebElementFacade lblRegister;
	
	@FindBy(xpath="//input[@name='firstName']")
	static WebElementFacade txtFirstName;
	
	@FindBy(xpath="//input[@name='lastName']")
	static WebElementFacade txtLastName;
	
	@FindBy(xpath="//input[@name='phone']")
	static WebElementFacade txtPhone;
	
	@FindBy(xpath="//input[@id='userName']")
	static WebElementFacade txtEmail;
	
	@FindBy(xpath="//input[@name='address1']")
	static WebElementFacade txtAddress;
	
	@FindBy(xpath="//input[@name='city']")
	static WebElementFacade txtCity;
	
	@FindBy(xpath="//input[@name='state']")
	static WebElementFacade tTxtState;
	
	@FindBy(xpath="//input[@name='postalCode']")
	static WebElementFacade txtPostalCode;
	
	@FindBy(xpath="//Select[@name='country']")
	static WebElementFacade txtCountry;
	
	@FindBy(xpath="//input[@id='email']")
	static WebElementFacade txtUserName;
	
	@FindBy(xpath="//input[@name='password']")
	static WebElementFacade txtPassword;
	
	@FindBy(xpath="//input[@name='confirmPassword']")
	static WebElementFacade txtComfirmPassword;
	
	@FindBy(xpath="//input[@name='submit']")
	static WebElementFacade btnEnviar;
	
	@FindBy(xpath="//table//p//b[contains(text(),' Note: Your user name is')]")
	static WebElementFacade lblVeriUsuario;
	
	
	
	public WebElementFacade getLblRegister() {
			return lblRegister;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtPhone() {
		return txtPhone;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCity() {
		return txtCity;
	}

	public WebElement getTxtState() {
		return tTxtState;
	}

	public WebElement getTxtPostalCode() {
		return txtPostalCode;
	}

	public WebElement getTxtCountry() {
		return txtCountry;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getTxtComfirmPassword() {
		return txtComfirmPassword;
	}

	public WebElement getBtnEnviar() {
		return btnEnviar;
	}

	public WebElementFacade getLblVeriUsuario() {
		return lblVeriUsuario;
	}
	
}
