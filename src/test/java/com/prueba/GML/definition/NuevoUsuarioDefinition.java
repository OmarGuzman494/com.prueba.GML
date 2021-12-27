package com.prueba.GML.definition;

import com.prueba.GML.steps.NuevoUsuarioSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class NuevoUsuarioDefinition {

@Steps
NuevoUsuarioSteps stepsNuevoUsuario;


@Given("ingresar al portal web demo guru99 {string}")
public void ingresar_al_portal_web_demo_guru(String strUrl) {
	stepsNuevoUsuario.ingresarPartalDemoguru(strUrl);
}

@Given("ingresar a la pestana Register")
public void ingresar_a_la_pestana_register() {
	stepsNuevoUsuario.ingresarPestanaRegister();
}

@When("diligenciar informacion de contacto {string}, {string}, {string},{string}")
public void diligenciar_informacion_de_contacto(String strName, String strLastName, String strPhone, String strEmail) {
	stepsNuevoUsuario.diligenciarInfoContacto(strName, strLastName, strPhone, strEmail);
}

@When("diligenciar informacion de mail {string}, {string}, {string}, {string}, {string}")
public void diligenciar_informacion_de_correo(String strAddress, String strCity, String strState, String strPostalCode, String strCountry) {
	stepsNuevoUsuario.diligenciarInfoMail(strAddress, strCity, strState, strPostalCode, strCountry);
}

@When("diligenciar información del usuario {string}, {string},{string},")
public void diligenciar_información_del_usuario(String strUserName, String strPassword, String strComfirmPassword) {
	stepsNuevoUsuario.diligenciarInfoUsuario(strUserName, strPassword, strComfirmPassword);
}

@When("enviar informacion")
public void enviar_informacion() {
	stepsNuevoUsuario.enviarInformacion();
}

@Then("Verificar el registro de usuario {string}")
public void verificar_el_registro_de_usuario(String strUserName) {
	stepsNuevoUsuario.verificarRegistroUsuario(strUserName);
}

@Then("Salir de la pagina")
public void salir_de_la_pagina() {
   
}

}
