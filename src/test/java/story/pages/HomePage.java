package story.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.internal.selenesedriver.SendKeys;

public class HomePage {

	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void open(){
		driver.get("http://localhost:8080/ahorcado");
	}
	
	public boolean Active(){
		return driver.findElement(By.id("begin")) != null;
	}
	
	public void beginGame(){
		driver.findElement(By.id("begin")).click();
	}
	
	public void enterWord(String word){
		driver.findElement(By.id("word")).sendKeys(word);
	}
}
