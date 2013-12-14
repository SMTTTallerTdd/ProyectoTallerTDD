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

public class NewGameEnterInvalidWordSteps {

	WebDriver webdriver;
	HomePage hp = null;
	@BeforeScenario
	public void setupWebDriver() {
		webdriver=new FirefoxDriver();
		hp = new HomePage(webdriver);
	}

	@AfterScenario
	public void closeWebDriver() {
		webdriver.close();
	}
	
	@Given("estoy en el home2")
	public void givenEstoyEnElHome() {
	  hp.open();
	}

	@When("introduzco una palabra inv\u00E1lida")
	public void whenIntroduzcoUnaPalabraInválida() {
	  hp.enterWord("1234");
	}

	@Then("se presenta el home con un mensaje de palabra inv\u00E1lida")
	public void thenSePresentaElHomeConUnMensajeDePalabraInválida() {
	  assertTrue(hp.Active());
	}
}
