package com.prueba.GML.steps;

import static org.junit.Assert.fail;

import com.prueba.GML.pageObjects.NuevoUsuarioPageObjects;

import utilidades.Utilidades;

public class NuevoUsuarioSteps {

	NuevoUsuarioPageObjects pageObjectsNuevoUsuario;
	Utilidades utilidades;
	
	public void ingresarPartalDemoguru(String strUrl) {
		try {
			pageObjectsNuevoUsuario.openAt(strUrl);
			utilidades.esperaCargarPagina();
			utilidades.borrarcache();
			utilidades.tomarEvidencia();
		}catch (Exception e) {
			pageObjectsNuevoUsuario.openAt(strUrl);
			utilidades.tomarEvidencia();
			}
		
	}

	public void ingresarPestanaRegister() {
		utilidades.posicionarElementoScroll(pageObjectsNuevoUsuario.getLblRegister());
		utilidades.bordearElemento(pageObjectsNuevoUsuario.getLblRegister());
		utilidades.tomarEvidencia();
		utilidades.clickBoton(pageObjectsNuevoUsuario.getLblRegister());
	}

	public void diligenciarInfoContacto(String strFirstName, String strLastName, String strPhone, String strEmail) {
		utilidades.tomarEvidencia();
		diligenciarFirstName(strFirstName);	
		diligenciarLastName(strLastName);
		diligenciarPhone(strPhone);
		diligenciarEmail(strEmail);
		utilidades.tomarEvidencia();
	}

	public void diligenciarFirstName(String strFirstName) {
		utilidades.bordearElemento(pageObjectsNuevoUsuario.getTxtFirstName());
		utilidades.escribirTexto(pageObjectsNuevoUsuario.getTxtFirstName(), strFirstName);
	}
	
	public void diligenciarLastName(String strLastName) {
		utilidades.bordearElemento(pageObjectsNuevoUsuario.getTxtLastName());
		utilidades.escribirTexto(pageObjectsNuevoUsuario.getTxtLastName(), strLastName);
	}
	
	public void diligenciarPhone(String strPhone) {
		utilidades.bordearElemento(pageObjectsNuevoUsuario.getTxtPhone());
		utilidades.escribirTexto(pageObjectsNuevoUsuario.getTxtPhone(), strPhone);
	}
	
	public void diligenciarEmail(String strEmail) {
		utilidades.bordearElemento(pageObjectsNuevoUsuario.getTxtEmail());
		utilidades.escribirTexto(pageObjectsNuevoUsuario.getTxtEmail(), strEmail);
	}

	public void diligenciarInfoMail(String strAddress, String strCity, String strState, String strPostalCode, String strCountry) {
		diligenciarAddress(strAddress);
		diligenciarCity(strCity);
		diligenciarState(strState);
		diligenciarPostalCode(strPostalCode);
		seleccionarCountry(strCountry);
		utilidades.tomarEvidencia();
	}
	
	public void diligenciarAddress(String strAddress) {
		utilidades.bordearElemento(pageObjectsNuevoUsuario.getTxtAddress());
		utilidades.escribirTexto(pageObjectsNuevoUsuario.getTxtAddress(), strAddress);
	}
	
	public void diligenciarCity(String strCity) {
		utilidades.bordearElemento(pageObjectsNuevoUsuario.getTxtCity());
		utilidades.escribirTexto(pageObjectsNuevoUsuario.getTxtCity(), strCity);
	}
	
	public void diligenciarState(String strState) {
		utilidades.bordearElemento(pageObjectsNuevoUsuario.getTxtState());
		utilidades.escribirTexto(pageObjectsNuevoUsuario.getTxtState(), strState);
	}
	
	public void diligenciarPostalCode(String strPostalCode) {
		utilidades.bordearElemento(pageObjectsNuevoUsuario.getTxtPostalCode());
		utilidades.escribirTexto(pageObjectsNuevoUsuario.getTxtPostalCode(), strPostalCode);
	}
	
	public void seleccionarCountry(String strCountry) {
		utilidades.bordearElemento(pageObjectsNuevoUsuario.getTxtCountry());
		utilidades.clickBoton(pageObjectsNuevoUsuario.getTxtCountry());
		utilidades.seleccionarOpcion(pageObjectsNuevoUsuario.getTxtCountry(), strCountry);
	}

	public void diligenciarInfoUsuario(String strUserName, String strPassword, String strComfirmPassword) {
		diligenciarUserName(strUserName);
		diligenciarPassword(strPassword);
		diligenciarConfirmPassword(strComfirmPassword);
		utilidades.tomarEvidencia();
	}
	
	public void diligenciarUserName(String strUserName) {
		utilidades.bordearElemento(pageObjectsNuevoUsuario.getTxtUserName());
		utilidades.escribirTexto(pageObjectsNuevoUsuario.getTxtUserName(), strUserName);
	}
	
	public void diligenciarPassword(String strPassword) {
		utilidades.bordearElemento(pageObjectsNuevoUsuario.getTxtPassword());
		utilidades.escribirTexto(pageObjectsNuevoUsuario.getTxtPassword(), strPassword);
	}
	
	public void diligenciarConfirmPassword(String strComfirmPassword) {
		utilidades.bordearElemento(pageObjectsNuevoUsuario.getTxtComfirmPassword());
		utilidades.escribirTexto(pageObjectsNuevoUsuario.getTxtComfirmPassword(), strComfirmPassword);
	}

	public void enviarInformacion() {
		utilidades.bordearElemento(pageObjectsNuevoUsuario.getBtnEnviar());
		utilidades.tomarEvidencia();
		utilidades.clickBoton(pageObjectsNuevoUsuario.getBtnEnviar());
	}

	
	public void verificarRegistroUsuario(String strUserName) {
		utilidades.elementoExite(pageObjectsNuevoUsuario.getLblVeriUsuario(), 3);
		String VerifiUsuario = utilidades.extraerTextodeLabel(pageObjectsNuevoUsuario.getLblVeriUsuario());
		if(VerifiUsuario.contains(strUserName)) {
			utilidades.bordearElemento(pageObjectsNuevoUsuario.getLblVeriUsuario());
			utilidades.tomarEvidencia();
		}else {
			utilidades.tomarEvidencia();
			fail("El usuario " + strUserName + " No fue registrado en Guru99");
		}
	}
}
