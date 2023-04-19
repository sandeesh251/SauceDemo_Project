package com.SauceDemoProject.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Browser 
{
	private static WebDriver driver;
	public static WebDriver launchBrowser(String browsername,String driverpath )
	{
		browsername.equals("edge");
		System.setProperty("webdriver.edge.driver", driverpath);
		driver= new EdgeDriver();
		return driver;
	}
	public static void openurl(String url)
	{
		driver.navigate().to(url);
	}
	public static void closeBrowser()
	{
		driver.close(); 
	}
	public static void verifyResult(String expectedurl)
	{
		String actualurl=driver.getCurrentUrl();
		boolean status = actualurl.contains(expectedurl);
		Assert.assertTrue(status, "Actualurl does not expectedurl");
	}
}
