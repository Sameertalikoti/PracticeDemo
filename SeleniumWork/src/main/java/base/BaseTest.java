package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

protected  WebDriver driver;

@BeforeMethod
public void setUp()
{
	
	
	  ChromeOptions option = new ChromeOptions();
	  option.addArguments("headless");
	 
	driver= new ChromeDriver(option);
	
	driver.get("https://admin-demo.nopcommerce.com/login");
	//driver.get("https://demo.automationtesting.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}

@AfterMethod
public void teardown()
{
if(driver != null)
	{
		driver.quit();
	}
}
}
