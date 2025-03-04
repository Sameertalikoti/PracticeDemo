package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DemoPage {
	
	WebDriver driver;
	
	public DemoPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	By UserEmail = By.id("Email");
	By Button = By.id("enterimg");
	
	
	public void enteremail(String email)
	{
		driver.findElement(UserEmail).sendKeys(email);
	}
	
	
	public void enterButton()
	{
		driver.findElement(Button).click();
	}

}
