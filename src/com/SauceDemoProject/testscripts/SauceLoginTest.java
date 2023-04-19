package com.SauceDemoProject.testscripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemoProject.pages.SauceLogin;
import com.SauceDemoProject.utils.Browser;
import com.SauceDemoProject.utils.ReadData;

public class SauceLoginTest {
	WebDriver driver;

	@BeforeMethod
	public void setup() throws IOException {
		String browsername = ReadData.getData("browser", "browsername");
		String driverpath = ReadData.getData("browser", "driverpath");
		String url = ReadData.getData("browser", "url");

		driver = Browser.launchBrowser(browsername, driverpath);
		Browser.openurl(url);
	}

	@AfterMethod
	public void teardown() {
		Browser.closeBrowser();
	}

	@Test
	public void verifySauceLogin() throws IOException {
		String uname = ReadData.getData("saucedemo", "username");
		String pass = ReadData.getData("saucedemo", "password");
		String expectedurl = ReadData.getData("saucedemo", "expectedurl");

		SauceLogin login = new SauceLogin(driver);
		login.sauceLogin(uname, pass);
		Browser.verifyResult(expectedurl);

	}

}
