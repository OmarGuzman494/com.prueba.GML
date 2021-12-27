package com.prueba.GML.steps;

import com.prueba.GML.pageObjects.BuscarVueloPageObjects;

import utilidades.Utilidades;

public class BuscarVueloSteps {

	BuscarVueloPageObjects pageObjectsBuscarVuelo;
	Utilidades utilidades;
	
	
		
	public void diligenciarDetallesVuelos(String strType, String strCantPassengers, String strDepartingFrom,
			String strMonthFrom, String strDayFrom, String strArrivingIn, String strMonthReturning,
			String strDayReturning) {
		utilidades.tomarEvidencia();
		diligenciarType(strType);
		diligenciarCantPassengers(strCantPassengers);
		diligenciarDepartingFrom(strDepartingFrom);
		diligenciarMonthOn(strMonthFrom);
		diligenciarDayOn(strDayFrom);
		diligenciarArrivingIn(strArrivingIn);
		diligenciarMonthReturning(strMonthReturning);
		diligenciarDayReturning(strDayReturning);
		utilidades.tomarEvidencia();
	}

	public void diligenciarType(String strType) {
		pageObjectsBuscarVuelo.setRdbType(strType);
		utilidades.bordearElemento(pageObjectsBuscarVuelo.getRdbType());
		utilidades.clickBoton(pageObjectsBuscarVuelo.getRdbType());
	}
	
	public void diligenciarCantPassengers(String strCantPassengers) {
		pageObjectsBuscarVuelo.setSelPassengers(strCantPassengers);
		utilidades.clickBoton(pageObjectsBuscarVuelo.getSelPassengers());
		utilidades.seleccionarOpcion(pageObjectsBuscarVuelo.getSelPassengers(), strCantPassengers);
	}
	
	public void diligenciarDepartingFrom(String strDepartingFrom) {
		pageObjectsBuscarVuelo.setSelDepartingFrom(strDepartingFrom);
		utilidades.clickBoton(pageObjectsBuscarVuelo.setSelDepartingFrom());
		utilidades.seleccionarOpcion(pageObjectsBuscarVuelo.setSelDepartingFrom(), strDepartingFrom);
	}
	
	public void diligenciarMonthOn(String strMonthOn) {
		String strMonth = utilidades.seleccionarMes(strMonthOn);
		pageObjectsBuscarVuelo.setSelMonthOn(strMonth);
		utilidades.clickBoton(pageObjectsBuscarVuelo.getSelMonthOn());
		utilidades.seleccionarOpcion(pageObjectsBuscarVuelo.getSelMonthOn(), strMonth);
	}
	
	public void diligenciarDayOn(String strDayOn) {
		pageObjectsBuscarVuelo.setSelDayOn(strDayOn);
		utilidades.clickBoton(pageObjectsBuscarVuelo.getSelDayOn());
		utilidades.seleccionarOpcion(pageObjectsBuscarVuelo.getSelDayOn(), strDayOn);
	}
	
	public void diligenciarArrivingIn(String strArrivingIn) {
		pageObjectsBuscarVuelo.setSelArrivingIn(strArrivingIn);
		utilidades.clickBoton(pageObjectsBuscarVuelo.getSelArrivingIn());
		utilidades.seleccionarOpcion(pageObjectsBuscarVuelo.getSelArrivingIn(), strArrivingIn);
	}
	
	public void diligenciarMonthReturning(String strMonthReturning) {
		String strMonthReturn = utilidades.seleccionarMes(strMonthReturning);
		pageObjectsBuscarVuelo.setSelMonthReturning(strMonthReturn);
		utilidades.clickBoton(pageObjectsBuscarVuelo.getSelMonthReturning());
		utilidades.seleccionarOpcion(pageObjectsBuscarVuelo.getSelMonthReturning(), strMonthReturn);
	}
	
	public void diligenciarDayReturning(String strDayReturning) {
		pageObjectsBuscarVuelo.setSelDayReturning(strDayReturning);
		utilidades.clickBoton(pageObjectsBuscarVuelo.getSelDayReturning());
		utilidades.seleccionarOpcion(pageObjectsBuscarVuelo.getSelDayReturning(), strDayReturning);
	}
	
	public void diligenciarInfoPreferencias(String strServiceClass, String strAirline) {
		seleccionarServiceClass(strServiceClass);
		seleccionarAirline(strAirline);
		utilidades.tomarEvidencia();
	}

	public void seleccionarServiceClass(String strServiceClass) {
		utilidades.desplazarScroll("700","400");
		pageObjectsBuscarVuelo.setRdbServiceClass(strServiceClass);
		utilidades.bordearElemento(pageObjectsBuscarVuelo.getRdbServiceClass());
		utilidades.clickBoton(pageObjectsBuscarVuelo.getRdbServiceClass());
	}
	
	public void seleccionarAirline(String strAirline) {
		pageObjectsBuscarVuelo.setRdbAirline(strAirline);
		utilidades.seleccionarOpcion(pageObjectsBuscarVuelo.getRdbAirline(), strAirline);
	}
	
	public void buscarVuelo() {
		utilidades.bordearElemento(pageObjectsBuscarVuelo.getBtnBuscarVuelo());
		utilidades.tomarEvidencia();
		utilidades.clickBoton(pageObjectsBuscarVuelo.getBtnBuscarVuelo());
		
	}

	public void verificarResultadoBusqueda() {
		utilidades.bordearElemento(pageObjectsBuscarVuelo.getBtnBasckToHome());
		utilidades.tomarEvidencia();
		utilidades.clickBoton(pageObjectsBuscarVuelo.getBtnBasckToHome());
		
	}

	
}
