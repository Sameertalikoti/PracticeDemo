package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	private WebDriver driver;
	
	private By usernameTextBox = By.id("Email");
	private By passwordTextBox = By.id("Password");
	private By loginButton = By.xpath("//button[@class=\"button-1 login-button\"]");
	
	public void enterUserName(String username)
	{
		driver.findElement(usernameTextBox).clear();
		driver.findElement(usernameTextBox).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(passwordTextBox).clear();
		driver.findElement(passwordTextBox).sendKeys(password);
	}
	
	public void enterButton()
	{
		driver.findElement(loginButton).click();
	}
	
	
	

}
