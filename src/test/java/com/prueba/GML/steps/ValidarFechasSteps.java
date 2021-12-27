package com.prueba.GML.steps;


import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

import com.prueba.GML.pageObjects.ValidarFechasPageObjects;

import utilidades.Utilidades;

public class ValidarFechasSteps {

	
	Utilidades utilidades;
	ValidarFechasPageObjects pageObjectsValidarFechas;
	String fechaPagina = "";
	
	
	public void ingresarPestanaHome() {
		utilidades.tomarEvidencia();
		utilidades.posicionarElementoScroll(pageObjectsValidarFechas.getLblHome());
		utilidades.bordearElemento(pageObjectsValidarFechas.getLblHome());
		utilidades.tomarEvidencia();
		utilidades.clickBoton(pageObjectsValidarFechas.getLblHome());
		
	}

	public void capturarFechaPagina() {
		utilidades.posicionarElementoScroll(pageObjectsValidarFechas.getLblFechaPagina());
		utilidades.bordearElemento(pageObjectsValidarFechas.getLblFechaPagina());
		utilidades.tomarEvidencia();
		}

	public void comprarFechaPaginaSistema() {
		String strMes = "";
		Date fecha = new Date(Calendar.getInstance().getTimeInMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd, yyyy");
		String fechaTexto = formatter.format(fecha);
		String month = fechaTexto.split("/")[0];
		String day =fechaTexto.split("/")[1];
		strMes = utilidades.nombreMes(month);
		String nuevaFecha = strMes +" "+ day;
	
		try {
			assertTrue(!nuevaFecha.contentEquals(fechaPagina));
			utilidades.bordearElemento(pageObjectsValidarFechas.getLblFechaPagina());
			utilidades.tomarEvidencia();
			Logger.getLogger(nuevaFecha, fechaPagina);
			
			}catch(Exception e){
				fail("Hay diferencias entre la fecha de la pagina y la fecha actual,  La fecha de la pagina web es: " + fechaPagina + " y la fecha del sistema es " + nuevaFecha);
			}
		utilidades.tomarEvidencia();
	}
	
}
