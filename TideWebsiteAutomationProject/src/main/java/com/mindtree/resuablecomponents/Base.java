package com.mindtree.resuablecomponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Base {
	public static WebDriver driver;
	public Properties prop;

	public WebDriver invokeBrowser() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Spoorthy\\eclipse-workspace\\TideWebsiteAutomationProject\\testdata\\configurations.properties");
		prop = new Properties();
		prop.load(fis);
		String browserName = prop.getProperty("browser");
	//	Dimension di = null;
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Spoorthy\\eclipse-workspace\\TideWebsiteAutomationProject\\driver\\chromedriver.exe");
		/*	di=new Dimension(400,700);
			Map<String, String> mobileEmulation = new HashMap<String, String>();
			mobileEmulation.put("deviceName", "Galaxy S5");
			Map<String, Object> chromeOptions = new HashMap<String, Object>();
			chromeOptions.put("mobileEmulation", mobileEmulation);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
			driver = new ChromeDriver(capabilities);*/
			driver = new ChromeDriver();
		}
		driver.get(prop.getProperty("url"));
		//driver.manage().window().setSize(di);
		return driver;
	}

	public void getScreenshots(String name) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Spoorthy\\eclipse-workspace\\ecomproject\\Screenshots\\" + name
				+ System.currentTimeMillis() + "screenshot.png"));
	}
}
