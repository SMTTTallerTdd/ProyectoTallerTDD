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

public class NewGameEnterValidWordSteps {

	public NewGameEnterValidWordSteps() {
		// TODO Auto-generated constructor stub
	}

	WebDriver webdriver;
	HomePage hp = null;
	GamePage gp = null;
	
	@BeforeScenario
	public void setupWebDriver() {
		webdriver=new FirefoxDriver();
		hp = new HomePage(webdriver);
		gp = new GamePage(webdriver);
	}
	
	@Given("estoy en el home")
	public void givenEstoyEnElHome() {
	  hp.open();
	}

	@When("introduzco una palabra v\u00E1lida e inicio el juego")	
	public void whenIntroduzcoUnaPalabraVálidaEInicioElJuego() {
	  hp.enterWord("hola");
	  hp.beginGame();
	}

	@Then("se presenta la pantalla de juego iniciado")	
	public void thenSePresentaLaPantallaDeJuegoIniciado() {
	  boolean b = gp.Active();
		assertTrue(b);
	}

	@AfterScenario
	public void closeWebDriver() {
		webdriver.close();
	}
	
	
}
