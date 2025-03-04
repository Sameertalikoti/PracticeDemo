package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DemoPage;

import utilities.ConfigReader;

public class DemoAutomation extends BaseTest
{
	
	static DemoPage page;
	static ConfigReader config1;
	static WebDriver driver;
	
	
	@Test
	static void setusername()
	{
		page = new DemoPage(driver);
		config1 = new ConfigReader();
		try {
		driver.get(config1.getAppURL());
		page.enteremail(config1.enteremail());
		page.enterButton();
		System.out.println("Button Clicked");
		}catch(Exception exp)
		{
			exp.getMessage();
		}
	}
}

