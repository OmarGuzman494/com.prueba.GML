package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RunnerNuevoUsuario {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RunnerNuevoUsuario.class);
	
	@Test
	public void subRunner() {
		try {
			LOGGER.info("Medio");
			JUnitCore.runClasses(CRunnerNuevoUsuario.class);
		}
		catch (Exception e) {
			LOGGER.error("Error Runner: RunnerNuevoRegistro {}", e.getMessage());	
		}
	}
	
	@Before
	public void test()  {
	try {
			LOGGER.info("Inicio test runner registro usuario");
			com.prueba.GML.modelo.FeatureOverright.overrideFeatureFiles("src/test/resources");
		}
		catch(Exception e){
			LOGGER.error("Error Runner registro usuario: {}", e.getMessage());		
		}
	}
	
	@RunWith(CucumberWithSerenity.class)
	@CucumberOptions(features = "src/test/resources/features/RegistroUsuarios.feature"
	,tags = "@AgregarNuevoUsuario"
	,plugin = {"pretty","html:target/cucumber-reports"}
	,glue = {"com.prueba.GML.definition"}) 
	
	public class CRunnerNuevoUsuario {

	}
}
