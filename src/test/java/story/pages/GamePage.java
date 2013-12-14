package story.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.smartmatic.tdd.word.WordUtils;

public class GamePage {

	private WebDriver webDriver = null;
	
	public GamePage(WebDriver driver)
	{
		webDriver = driver;
	}
	
	public boolean Active(){
		return webDriver.findElement(By.id("guess")) != null;
	}
		
	public void playing(String word){
		webDriver.get("http://localhost:8080/ahorcado/game?name="+word);
	}
	public void enterLetter(String letter){
		webDriver.findElement(By.id("letter")).sendKeys("h");
		webDriver.findElement(By.id("inputletter")).click();
		}
	public void getCurrentWord(){
		webDriver.findElement(By.id("guess"));
	}
	
	public void SetOpportunitiesLeft(int opportunitiesLeft)
	{
		WordUtils utils = new WordUtils();
		String o = utils.getOpportunitiesLeftString(opportunitiesLeft);
		webDriver.findElement(By.id("opportunitiestext")).sendKeys(o);
	}
	
	public String GetOpportunitiesLeft()
	{
		String opportunities = webDriver.findElement(By.id("opportunitiestext")).getText();	
		
		return opportunities;
	}
}
