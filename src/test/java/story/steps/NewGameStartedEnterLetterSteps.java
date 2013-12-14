package story.steps;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.*;

import story.pages.GamePage;
import story.pages.HomePage;

public class NewGameStartedEnterLetterSteps {

	WebDriver webdriver;
	HomePage hp = null;
	GamePage gp = null;
	
	@BeforeScenario
	public void setupWebDriver() {
		webdriver=new FirefoxDriver();
		hp = new HomePage(webdriver);
		gp = new GamePage(webdriver);
	}
	
	@Given("He iniciado mi juego")	
	public void givenHeIniciadoMiJuego() {
	  hp.open();
	  hp.enterWord("hola");
	}

	@When("introduzco una letra y")	
	public void whenIntroduzcoUnaLetraY() {
	  gp.enterLetter("h");
	}

	@Then("se muestra la pantalla de juego")
	public void thenSeMuestraLaPantallaDeJuego() {
	 boolean res = gp.Active();
	 assertTrue(res);
	}
	
	@AfterScenario
	public void closeWebDriver() {
		webdriver.close();
	}
	
}
