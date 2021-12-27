package utilidades;

import net.serenitybdd.core.Serenity;


import static org.junit.Assert.fail;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.util.EnvironmentVariables;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;


public class Utilidades extends PageObject{

	
	private static final Logger LOGGER = LoggerFactory.getLogger("Registro");
	private EnvironmentVariables environmentVariables; 
	private static final String WEBDRIVERTIMEOUT = "webdriver.timeouts.implicitlywait";
		
	
	
	public void borrarcache() {
		getDriver().manage().deleteAllCookies();
		
	}
	
	public void esperaCargarPagina() {		
		int intTimer = 15;
		try {
			new WebDriverWait(getDriver(), intTimer).until((ExpectedCondition<Boolean>) wd -> ((JavascriptExecutor) wd)
					.executeScript("return document.readyState").equals("complete"));			
		}catch (Exception e) {
			LOGGER.error("en la clase Utilidades en el metodo esperaCargarPagina " + e);
			}		
	}
	
	public void escribirTexto(WebElement webElement, String strTexto) {
		try {
			//WebDriverWait wait = new WebDriverWait(getDriver(), obtenerTiempoSerenity());
			WebElementFacade input = element(webElement);
			waitFor(input).isEnabled();
			input.clear();
			input.type(strTexto);
		}catch (Exception e) {
			LOGGER.error("en la clase Utilidades en el metodo escribirTexto" + e);
		}
	}

	public void tomarEvidencia() {
		try {
			Serenity.takeScreenshot();
		}catch(Exception e) {
			LOGGER.error("en la clase Utilidades en el metodo tomarEvidencia " + e);
		}
	}
	
	public int obtenerTiempoSerenity() {
		return (Integer.parseInt(EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(WEBDRIVERTIMEOUT)))/1000;
	}
	
	public void bordearElemento(WebElement txtProductoASeleccionar) {
		try {
			((JavascriptExecutor) getDriver()).executeScript("arguments[0].style.border='3px dashed green'",
					element(txtProductoASeleccionar));
			((JavascriptExecutor) getDriver()).executeScript("arguments[0].style.background='#8fcc9e'", element(txtProductoASeleccionar)); 
		}catch(Exception e) {
			LOGGER.error("en la clase Utilidades en el metodo bordearElemento " + e);
		}
	}
	
	
public void clickEnBoton(WebElementFacade webElementFacade) {
		
		try {
				WebDriverWait wait = new WebDriverWait(getDriver(), 15);
				wait.until(ExpectedConditions.elementToBeClickable(webElementFacade));
				((WebElement) webElementFacade).click();
	
		} catch (Exception e) {
			System.out.println(webElementFacade + " error: " + e.getMessage());
			LOGGER.error("ERROR: en la clase Utilidades en el método clickEnBoton: " + e);
		}
	}
	
	public void clickBoton(WebElement webElement) {
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), 15);
			wait.until(ExpectedConditions.elementToBeClickable(webElement));
			webElement.click();

	} catch (Exception e) {
		System.out.println(webElement + " error: " + e.getMessage());
		LOGGER.error("ERROR: en la clase Utilidades en el método clickEnBoton: " + e);
	}
		
	}

	public void posicionarElemento(WebElement webElement) {
		Actions actions=new Actions(getDriver());
		actions.moveToElement((WebElement) webElement).perform();
		if(elementoExite(find(By.id("js-cookie-notification")), 1))
		{			
			System.out.println("MENSAJE");
					find(By.xpath("//*[@id='js-cookie-notification']//div[contains(@class,'button')]")).click();
					
		
		}	
	}
	
	public void desplazarScrollArriba() {
		try {
			((JavascriptExecutor) getDriver()).executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		}catch(Exception e) {
			LOGGER.error("en la clase Utilidades en el metodo desplazarScrollArriba " + e);
		}
	}
	
	
	public void posicionarElementoScroll(WebElement webElement) {
		try {
			((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoViewIfNeeded(true);",
					element(webElement));
		}catch(Exception e) {
			LOGGER.error("en la clase Utilidades en el metodo posicionarElementoScroll " + e);
		}
	
	}
	public boolean elementoExite(WebElementFacade webElemento, int iespera ) {
		try { 
			int contador=0;
				
				do {
					contador++;	
						System.out.println("Elemnto existe"+iespera);		
						if (webElemento.isCurrentlyVisible()) {
							return true;
						}
				waitFor(300).milliseconds();
				}while (contador<iespera);
				return false;
			} catch (Exception e) {
				 return false;
			 }
	}
	
	
		
	public void desplazarScroll(String x, String y) {
		((JavascriptExecutor) getDriver()).executeScript("window.scrollBy(" + x + "," + y + ")");
	}
	
	public void seleccionarOpcion(WebElement webElement, String stgOpcion) {
		try {
			WebElementFacade dropbox = element(webElement);
			dropbox.selectByVisibleText(stgOpcion);
		} catch (Exception e) {
			LOGGER.error("en la clase Utilidades en el metodo seleccionarOpcion" + e);
		}
	}
	
	
	public String extraerTextodeLabel(WebElement webElement) {
		try {
			if (element(webElement).isCurrentlyVisible() && element(webElement).isCurrentlyEnabled()) {
				WebDriverWait wait = new WebDriverWait(getDriver(), obtenerTiempoSerenity());
				wait.until(ExpectedConditions.elementToBeClickable(webElement));
				return element(webElement).getText().toString();
			}
			return "";
		} catch (Exception e) {
			LOGGER.error("en la clase Utilidades en el metodo extraerTextodeLabel " + e);
		}
		return null;
	}
	
	public String seleccionarMes(String strMonthOn) {
		String strMonth= "";
		switch(strMonthOn) {
		case "January":
		case "Enero":
			strMonth = "1";
			break;
		case "February":
		case "Febrero":
			strMonth = "2";
			break;
		case "March":
		case "Marzo":
			strMonth= "3";
			break;
		case "April":
		case "Abril":
			strMonth= "4";
			break;
		case "May":
		case "Mayo":
			strMonth= "5";
			break;
		case "June":
		case "Junio":
			strMonth= "6";
			break;
		case "July":
		case "Julio":
			strMonth= "7";
			break;
		case "August":
		case "Agosto":
			strMonth= "8";
			break;
		case "September":
		case "Septiembre":
			strMonth= "9";
			break;
		case "October":
		case "Octubre":
			strMonth= "10";
			break;
		case "November":
		case "Noviembre":
			strMonth= "11";
			break;
		case "December":
		case "Diciembre":
			strMonth= "12";
			break;
		default:
				strMonth= "1";
			break;
		}
		
		return strMonth;
	}
	
	public void cerrarPagina() {
		getDriver().close();
		
	}

	public void finalizarEjecucionFallida(String strMensaje) {
		tomarEvidencia();
		fail(strMensaje);
	}
	 
	 public void cambioDeFrameDefault() {
			try {
				getDriver().switchTo().defaultContent();
			}catch(Exception e) {
				LOGGER.error("en la clase Utilidades en el metodo cambioDeFrameDefault " + e);
			}
		}
		
		public void cambioDeFrame(int frame) {
			try {
				getDriver().switchTo().frame(frame);
			}catch(Exception e) {
				LOGGER.error("en la clase Utilidades en el metodo cambioDeFrame" + e);
			}
		}
		
		
	 public void diligenciarAlerta(String txtTextoAlerta){
			Alert alert;
			WebDriverWait wait = new WebDriverWait(getDriver(), obtenerTiempoSerenity());
			try {
				wait.until(ExpectedConditions.alertIsPresent());
				alert = getDriver().switchTo().alert();
				alert.sendKeys(txtTextoAlerta);
				alert.accept();
			} catch (Exception e) {
				LOGGER.error("en la clase Utilidades en el metodo diligenciarAlerta " + e);
			}
		}
	 
	 
				
		public void aceptarAlertaEnPantalla() {
			try {
				Alert alert = getDriver().switchTo().alert();
				alert.dismiss();
			} catch (Exception e) {
				finalizarEjecucionFallida("ERROR: en la clase UtilidadesWeb en el método aceptaAlertaEnPantalla: " + e);
			}
		}
		

	
	public String nombreMes(String strMes) {
		String strMonth= "";
		switch(strMes) {
		case "1":
			strMonth = "Ene";
			break;
		case "2":
			strMonth = "Feb";
			break;
		case "3":
			strMonth= "Mar";
			break;
		case "4":
			strMonth= "Abr";
			break;
		case "5":
			strMonth= "May";
			break;
		case "6":
			strMonth= "Jun";
			break;
		case "7":
			strMonth= "Jul";
			break;
		case "8":
			strMonth= "Ago";
			break;
		case "9":
			strMonth= "Sep";
			break;
		case "10":
			strMonth= "Oct";
			break;
		case "11":
			strMonth= "Nov";
			break;
		case "12":
			strMonth= "Dic";
			break;
		default:
				strMonth= "Ene";
			break;
		}
		return strMonth;
	}
	 public void cerrarAlerta() {
		 getDriver().switchTo().window("http://demo.guru99.com/test/newtours/#google_vignette");
	 }
}
