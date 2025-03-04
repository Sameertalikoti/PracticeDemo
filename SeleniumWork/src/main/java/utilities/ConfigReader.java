package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static Properties getpropertiesObject() throws IOException
	{
		FileInputStream FB = new FileInputStream("Config\\config.properties");
		
		Properties prop = new Properties();
		
		prop.load(FB);
		
		return prop;
		
		
	}
	
	public static String getURL() throws IOException
	{
		return getpropertiesObject().getProperty("URL");
	}
	
	public static String getusername() throws IOException
	{
		return getpropertiesObject().getProperty("username");
	}
	
	public static String getpassword() throws IOException
	{
		return getpropertiesObject().getProperty("password");
	}
	
	public static String getwrongemailid() throws IOException
	{
		return getpropertiesObject().getProperty("Wrongusernames");
	}
	public static String getwrongpassword() throws IOException
	{
		return getpropertiesObject().getProperty("Wrogpassword");
	}
	
	
	
	
	public static String getAppURL() throws IOException
	{
		return getpropertiesObject().getProperty("APPURL");
	}
	
	public static String enteremail() throws IOException
	{
		return getpropertiesObject().getProperty("UserNamedemo");
	}
	
	
	
	public static String enterFirstname() throws IOException
	{
		return getpropertiesObject().getProperty("Firstname");
	}
	
	public static String enterLastname() throws IOException
	{
		return getpropertiesObject().getProperty("Lirstname");
	}
	
	public static String enterAddress() throws IOException
	{
		return getpropertiesObject().getProperty("Address");
	}
	
	public static String enterID() throws IOException
	{
		return getpropertiesObject().getProperty("Id");
	}
	
	
	
}
