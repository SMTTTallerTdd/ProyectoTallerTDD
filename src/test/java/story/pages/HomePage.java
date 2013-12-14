package story.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void open(){
		driver.get("");
	}
	
	public boolean Active(){
		return driver.findElement(By.id("begin")) != null;
	}
	
	public void beginGame(){
		driver.findElement(By.id("begin")).click();
	}
}
