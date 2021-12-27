package com.prueba.GML.pageObjects;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;



public class BuscarVueloPageObjects extends PageObject {
	
	
	@FindBy(xpath="//a[@href='reservation.php' and contains(text(),'Flights')]")
	static WebElementFacade lblFlights;
	
	@FindBy(xpath="")
	static WebElementFacade rdbType;
	
	@FindBy(xpath="")
	static WebElementFacade selPassengers;
	
	@FindBy(xpath="")
	static WebElementFacade selDepartingFrom;
	
	@FindBy(xpath="")
	static WebElementFacade selMonthOn;
	
	@FindBy(xpath="")
	static WebElementFacade selDayOn;
	
	@FindBy(xpath="")
	static WebElementFacade selArrivingIn;
	
	@FindBy(xpath="")
	static WebElementFacade selMonthReturning;
	
	@FindBy(xpath="")
	static WebElementFacade SelDayReturning;
	
	@FindBy(xpath="")
	static WebElementFacade rdbServiceClass;
	
	@FindBy(xpath="")
	static WebElementFacade rdbAirline;
	
	@FindBy(xpath="//input[@name='findFlights']")
	static WebElementFacade btnBuscarVuelo;
	
	@FindBy(xpath="//img[@src='images/home.gif']")
	static WebElementFacade btnBasckToHome;
	
	@FindBy(xpath="//div[@id='ad_position_box']//*[@id='dismiss-button']")
	static WebElementFacade btnCancelarAlerta;
	
	
	
	
	public WebElementFacade getLblFlights() {
		return lblFlights;
	}

	public WebElement getRdbType() {
		return rdbType;
	}

	public void setRdbType(String strType) {
		rdbType = find(By.xpath("//input[@name='tripType'][@value='*']".replace("*", strType)));
		
	}

	public WebElement getSelPassengers() {
		return selPassengers;
	}

	public void setSelPassengers(String strCantPassengers) {
		selPassengers = find(By.xpath("//select[@name='passCount']//option[@value='*']".replace("*", strCantPassengers)));
		
	}


	public WebElement setSelDepartingFrom() {
		return selDepartingFrom;
	}

	public void setSelDepartingFrom(String strDepartingFrom) {
		selDepartingFrom  = find(By.xpath("//select[@name='fromPort']//option[@value='*']".replace("*", strDepartingFrom)));
	}

	public WebElement getSelMonthOn() {
		return selMonthOn;
	}

	public void setSelMonthOn(String strMonthOn) {
		selMonthOn = find(By.xpath("//select[@name='fromMonth']//option[@value='*']".replace("*", strMonthOn)));
		
	}

	public WebElement getSelDayOn() {
		return selDayOn;
	}

	public void setSelDayOn(String strDayOn) {
		selDayOn = find(By.xpath("//select[@name='fromDay']//option[@value='*']".replace("*", strDayOn)));
		
	}

	public WebElement getSelArrivingIn() {
		return selArrivingIn;
	}

	public void setSelArrivingIn(String strArrivingIn) {
		selArrivingIn = find(By.xpath("//select[@name='toPort']//option[@value='*']".replace("*", strArrivingIn)));
		
	}

	public WebElement getSelMonthReturning() {
		return selMonthReturning;
	}

	public void setSelMonthReturning(String strMonthReturning) {
		selMonthReturning = find(By.xpath("//select[@name='toMonth']//option[@value='*']".replace("*", strMonthReturning)));
		
	}

	public WebElement getSelDayReturning() {
		return SelDayReturning;
	}

	public void setSelDayReturning(String strDayReturning) {
		SelDayReturning = find(By.xpath("//select[@name='toDay']//option[@value='*']".replace("*", strDayReturning)));
		
	}

	public WebElement getRdbServiceClass() {
		return rdbServiceClass;
	}

	public void setRdbServiceClass(String strServiceClass) {
		rdbServiceClass = find(By.xpath("//input[@type='radio'][@value='*']".replace("*", strServiceClass)));
		
	}

	public WebElement getRdbAirline() {
		return rdbAirline;
	}

	public void setRdbAirline(String strAirline) {
		rdbAirline = find(By.xpath("//select[@name='airline'][option='*']".replace("*", strAirline)));
		
	}

	public WebElement getBtnBuscarVuelo() {
		return btnBuscarVuelo;
	}

	public WebElement getBtnBasckToHome() {
		return btnBasckToHome;
	}

	public WebElement getBtnCancelarAlerta() {
		return btnCancelarAlerta;
	}

	

	
}
