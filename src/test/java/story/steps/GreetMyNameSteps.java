package story.steps;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

public class GreetMyNameSteps {

	WebDriver webdriver;

	@BeforeScenario
	public void setupWebDriver() {
		webdriver=new FirefoxDriver();
	}

	@AfterScenario
	public void closeWebDriver() {
		webdriver.close();
	}
	
	@Given("I start the greeter")
	public void givenIStartTheGreeter() {
	}

	@When("My name is Gelvis")
	public void whenMyNameIsGelvis() {
	}

	@Then("the greet is Hola Gelvis")
	public void thenTheGreetIsHolaGelvis() {
	}

}
