package com.automationpractice.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import com.automationpractice.stepdefinition.StepDefition;
import com.automationpractice.utils.WebDriverCommonMethods;
import com.vimalselvam.cucumber.listener.Reporter;

public class HomePage {
	
	WebDriverCommonMethods      common   = new WebDriverCommonMethods();
	
	public static final String SIGNIN_LINK       =  "//*[contains(text(),'Sign in')]";
	
	/*Constructor of the class*/
	public HomePage()  {
		
	}
	
	
	public void clickSignIn()  {
		WebElement element = StepDefition.driver.findElement(By.xpath(SIGNIN_LINK));
		try {
			common.waitForElement(element);
			element.click();
			System.out.println("Click Performed SignIN");
		} catch (Exception e) {
			Reporter.addStepLog("Unable to click on SignIn link "  + e.getMessage());
			
		}
		 
		
	}
	
	
	
}
