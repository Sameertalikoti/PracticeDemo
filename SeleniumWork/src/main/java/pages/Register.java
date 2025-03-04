package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register 
{
   static WebDriver driver; 
	public Register(WebDriver driver)
     {
    	 this.driver = driver;
    	 
     }
	
	By Firstname = By.xpath("//input[@placeholder = 'First Name']");
	
	By Lastname = By.xpath("//input[@placeholder = 'Last Name']");
	
	By Address = By.xpath("//textarea[@ng-model = \"Adress\"]");
	
	By Emailid = By.id("eid");
	
	
	public void firstName(String firstname)
	{
		driver.findElement(Firstname).sendKeys(firstname);
	}
	
	public void lastName(String lastname)
	{
		driver.findElement(Lastname).sendKeys(lastname);
	}
	
	public void Address(String address)
	{
		driver.findElement(Address).sendKeys("BGK 487101");
	}
	
	public void enterId(String id)
	{
		driver.findElement(Emailid).sendKeys(id);
	}
}
