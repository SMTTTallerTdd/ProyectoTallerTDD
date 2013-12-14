package story.steps;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

import story.pages.HomePage;

public class NewGameSteps {

	public NewGameSteps() {
		// TODO Auto-generated constructor stub
	}

	WebDriver webdriver;
	HomePage hp = null;
	@BeforeScenario
	public void setupWebDriver() {
		webdriver=new FirefoxDriver();
		hp = new HomePage(webdriver);
	}

	@Given("estoy en el home")
	public void givenEstoyEnElHome() {
		hp.open();
	  
	}

	@When("no he hecho nada")
	public void whenNoHeHechoNada() {
	  
	}

	@Then("se muestra la pantalla de Inicio")
	public void thenSeMuestraLaPantallaDeInicio() {
	   //assertTrue(hp.Active());
	}

	@AfterScenario
	public void closeWebDriver() {
		webdriver.close();
	}
	
	
}
