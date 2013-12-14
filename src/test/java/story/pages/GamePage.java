package story.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GamePage {

	private WebDriver webDriver = null;
	
	public GamePage(WebDriver driver)
	{
		webDriver = driver;
	}
	
	public boolean Active(){
		return webDriver.findElement(By.id("guess")) != null;
	}
	
	public void enterLetter(String letter){
		webDriver.findElement(By.id("letter")).sendKeys("h");
		webDriver.findElement(By.id("inputletter")).click();
		}
	
}
