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

public class PlayingLetterMatchSteps {

	public PlayingLetterMatchSteps() {
		// TODO Auto-generated constructor stub
	}

	WebDriver webdriver;
	GamePage gp = null;
	
	@BeforeScenario
	public void setupWebDriver() {
		webdriver=new FirefoxDriver();
		gp = new GamePage(webdriver);
	}
	
	@Given("Jugando")
	public void givenJugando() {
	  // PENDING
	}

	@When("Ingreso una letra contenida en la plabra")
	public void whenIngresoUnaLetraContenidaEnLaPlabra() {
	  // PENDING
	}

	@When("No se completa la palabra con la letra introducida")
	public void whenNoSeCompletaLaPalabraConLaLetraIntroducida() {
	  // PENDING
	}

	@Then("Se pinta la letra introducida en los espacios correspondientes")
	public void thenSePintaLaLetraIntroducidaEnLosEspaciosCorrespondientes() {
	  // PENDING
	}


	@When("se completa la palabra con la letra introducida")
	public void whenSeCompletaLaPalabraConLaLetraIntroducida() {
	  // PENDING
	}

	@Then("Se muestra un mensaje indicando juego terminado con victoria")
	public void thenSeMuestraUnMensajeIndicandoJuegoTerminadoConVictoria() {
	  // PENDING
	}


	@When("Ingreso una letra contenida en la plabra otra vez")
	public void whenIngresoUnaLetraContenidaEnLaPlabraOtraVez() {
	  // PENDING
	}

	@When("La letra ingresada ya hab\u00EDa sido jugada")
	public void whenLaLetraIngresadaYaHabíaSidoJugada() {
	  // PENDING
	}

	@Then("se muestra un mensaje indicando que esa letra ya fue ingresada")
	public void thenSeMuestraUnMensajeIndicandoQueEsaLetraYaFueIngresada() {
	  // PENDING
	}

}
