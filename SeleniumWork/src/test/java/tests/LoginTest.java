package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utilities.ConfigReader;

public class LoginTest extends BaseTest{
	
	ConfigReader config;
	LoginPage login;
	
	@Test
	public void validTest() throws IOException
	{
	
		login = new LoginPage(driver);
	driver.get(config.getURL());
	
	 config= new ConfigReader();
	
	login.enterUserName(config.getusername());
	login.enterPassword(config.getpassword());
	login.enterButton();
	
	System.out.println("Page Title is =" +driver.getTitle());
	Assert.assertEquals(driver.getTitle(), "Just a moment...");
	
	}	
	
	@Test
	public void validTest1() throws IOException
	{
		login = new LoginPage(driver);
	 config= new ConfigReader();
	
	login.enterUserName(config.getwrongemailid());
	login.enterPassword(config.getwrongpassword());
	login.enterButton();
	
	System.out.println("Page Title is =" +driver.getTitle());
	Assert.assertEquals(driver.getTitle(), "Just a moment...");

}
}
