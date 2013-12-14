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

public class NewGameStartedFailCountSteps {

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
	}

	@When("estoy en la pantalla de juego")
	public void whenEstoyEnLaPantallaDeJuego() {
		hp.enterWord("hola");
		hp.beginGame();
		gp.SetOpportunitiesLeft(4);
	}

	@Then("se muestra las oportunidades restantes de equivocarme.")
	public void thenSeMuestraLasOportunidadesRestantesDeEquivocarme() {
	  String op = gp.GetOpportunitiesLeft();
	  
	  assertEquals("1-4", op);
	}
	
	@AfterScenario
	public void closeWebDriver() {
		webdriver.close();
	}
	
}
