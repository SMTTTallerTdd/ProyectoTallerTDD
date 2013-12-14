package story.steps;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
	
	@Given("estoy en el home")
	public void givenEstoyEnElHome() {
	  // PENDING
	}

	@When("introduzco una palabra inv\u00E1lida")
	public void whenIntroduzcoUnaPalabraInválida() {
	  // PENDING
	}

	@Then("se presenta el home con un mensaje de palabra inv\u00E1lida")
	public void thenSePresentaElHomeConUnMensajeDePalabraInválida() {
	  // PENDING
	}
}
