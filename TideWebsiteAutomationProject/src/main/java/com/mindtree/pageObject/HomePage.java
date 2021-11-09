package com.mindtree.pageObject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.mindtree.uistore.HomePageUI;
import com.mindtree.utilities.Log;

public class HomePage extends HomePageUI{
	public WebDriver driver;
	Log log = new Log();
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	public void cliclOnPowderAndValidateText() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(shop_products)).build().perform();
		driver.findElement(powder).click();
		Assert.assertTrue(driver.findElement(text).isDisplayed());
		log.infoLog("Successfully Validated!");
	}
	public void cliclOnLearnMoreAndValidateText() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(wash_clothes).click();
		Thread.sleep(5000);
		driver.findElement(learnmore).click();
		Assert.assertTrue(driver.findElement(text2).isDisplayed());
		log.infoLog("Successfully Validated!");
	}
}
