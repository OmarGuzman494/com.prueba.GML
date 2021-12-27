package com.prueba.GML.definition;

import com.prueba.GML.steps.ValidarFechasSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ValidarFechasDefinition {

	@Steps
	ValidarFechasSteps stepsValidarFechas;	
	
	
	@Given("ingresar a la pestana Home")
	public void ingresar_a_la_pestana_home() {
		stepsValidarFechas.ingresarPestanaHome();
	}

	@When("capturar la fecha de la pagina")
	public void capturar_la_fecha_de_la_pagina() {
		stepsValidarFechas.capturarFechaPagina();
	}

	@Then("comparar fecha pagina con fecha sistema")
	public void comparar_fecha_pagina_con_fecha_sistema() {
		stepsValidarFechas.comprarFechaPaginaSistema();
	}
}
