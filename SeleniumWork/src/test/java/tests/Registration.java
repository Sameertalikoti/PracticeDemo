package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Register;
import utilities.ConfigReader;

public class Registration extends BaseTest 
{
	static WebDriver driver;
	static Register register;
	static ConfigReader config2;
	
	@Test
	static void setFirstname()
	{
		register = new Register(driver);
		config2 = new ConfigReader();
		
		try {
		register.firstName(config2.enterFirstname());
		register.lastName(config2.enterLastname());
		register.Address(config2.enterAddress());
		register.enterId(config2.enterID());
		System.out.println("Register Completed");
		}catch(Exception exp)
		{
			exp.getMessage();
		}
		
		
	}
	
}
