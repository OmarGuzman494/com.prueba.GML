package com.prueba.GML.definition;

import com.prueba.GML.steps.BuscarVueloSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BuscarVueloDefinition {

	@Steps
	BuscarVueloSteps stepsBuscarVuelo;
	
	
	
	@When("diligenciar detalles del vuelo {string}, {string}, {string},{string},{string},{string},{string},{string}")
	public void diligenciar_detalles_del_vuelo(String strType, String strCantPassengers, String strDepartingFrom, String strMonthFrom, String strDayFrom, String strArrivingIn, String strMonthReturning, String strDayReturning) {
		stepsBuscarVuelo.diligenciarDetallesVuelos(strType, strCantPassengers, strDepartingFrom, strMonthFrom, strDayFrom, strArrivingIn, strMonthReturning, strDayReturning);
	}

	@When("diligenciar informacion preferencias {string}, {string}")
	public void diligenciar_informacion_preferencias(String strServiceClass, String strAirline) {
		stepsBuscarVuelo.diligenciarInfoPreferencias(strServiceClass, strAirline);
	}

	@When("Buscar vuelo")
	public void buscar_vuelo() {
		stepsBuscarVuelo.buscarVuelo();
	}

	@Then("Verificar resultado de la busqueda")
	public void verificar_resultado_de_la_busqueda() {
		stepsBuscarVuelo.verificarResultadoBusqueda();
	}

	
}
