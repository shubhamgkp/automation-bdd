package com.automationpractice.Base;


import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import com.automationpractice.utils.ReadConfig;

public class BaseClass {
	public static WebDriver driver;
	static String BrowserName;

	public static WebDriver getDriver() throws Exception{
		Properties  config =  ReadConfig.readPropertFile();
		BrowserName = config.getProperty("BrowserName");
		System.out.println("Browsername is " +BrowserName);
		
		if (BrowserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
		} else if (BrowserName.equalsIgnoreCase("Firefox")) {

			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();


		} else if (BrowserName.equalsIgnoreCase("IE")) {
          /*Please set the property if you want to execute on IE*/
			driver = new InternetExplorerDriver();


		} else {
			throw new Exception("Invalid Browser Name");
		}

		return driver;

	}

}
