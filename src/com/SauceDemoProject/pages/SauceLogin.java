package com.SauceDemoProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.SauceDemoProject.locators.SaucedemoLoginLocators;

public class SauceLogin extends SaucedemoLoginLocators {
	private WebDriver driver;

	public SauceLogin(WebDriver driver) {
		this.driver = driver;
	}

	private void enterusername(String uname) {
		WebElement SauceUsername = driver.findElement(sauceusername);
		SauceUsername.sendKeys(uname);
	}

	private void enterpassword(String pass) {
		WebElement SaucePassword = driver.findElement(saucepassword);
		SaucePassword.sendKeys(pass);
	}

	private void clickLogin() {
		driver.findElement(saucelogin).click();
	}

	public void sauceLogin(String uname, String pass) {
		Reporter.log("Sauce Login Started Execution");
		this.enterusername(uname);
		this.enterpassword(pass);
		this.clickLogin();
		Reporter.log("Sauce Login button clicked");

	}

}
