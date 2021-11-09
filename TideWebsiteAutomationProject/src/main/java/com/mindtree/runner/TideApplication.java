package com.mindtree.runner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mindtree.pageObject.HomePage;
import com.mindtree.resuablecomponents.Base;

public class TideApplication{
	public WebDriver driver;
	Base b = new Base();
	@BeforeMethod
	public void getBrowser() throws IOException {
		driver = b.invokeBrowser();
	}
	@Test(priority=2)
	public void validateAntibacterialText() {
		HomePage hp = new HomePage(driver);
		hp.cliclOnPowderAndValidateText();
	}
	@Test(priority=1)
	public void validateLaundrySymbolsText() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.cliclOnLearnMoreAndValidateText();
	}
	@AfterMethod
	public void closeDriver() {
		driver.close();
	}
}
