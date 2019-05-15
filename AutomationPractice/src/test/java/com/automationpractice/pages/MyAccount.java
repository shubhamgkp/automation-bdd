package com.automationpractice.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByName;

import com.automationpractice.stepdefinition.StepDefition;
import com.automationpractice.utils.WebDriverCommonMethods;

public class MyAccount {
	
	public final String  MYPERSONALINFO             =  "//span[text()='My personal information']";
	public final String  FIRSTNAME                  = "firstname";
	public final String  CURRENTPWD                 = "old_passwd";
	public final String  NEWPWD                     = "passwd";
	public final String  CONFPWD                    = "confirmation";
	public final String  SAVEBTN                    = "submitIdentity";	
	public final String  EXPMSG		                = "//*[contains(text(),'Your personal information has been')]";
	
	public void clickMyPersonalInformation() {
		
		WebElement element = StepDefition.driver.findElement(By.xpath(MYPERSONALINFO));
		WebDriverCommonMethods.clickJS(element);
	}

	
 public void enterFirstName(String firsname) throws InterruptedException {
	 WebElement element = StepDefition.driver.findElement(By.name(FIRSTNAME));
	 element.clear();
	 element.sendKeys(firsname);
 }	
	
 
 public void enterCurrentPWD(String currentPWD) {
	 WebElement element = StepDefition.driver.findElement(By.name(CURRENTPWD));
	 element.clear();
	 element.sendKeys(currentPWD);
 }	
 
 
 public void enterNewPWD(String newPWD) {
	 WebElement element = StepDefition.driver.findElement(By.name(NEWPWD));
	element.clear();
	 element.sendKeys(newPWD);
 }
 
 public void enterConfirmPWD(String confirmPWD) {
	 WebElement element = StepDefition.driver.findElement(By.name(CONFPWD));
	 element.clear();
	 element.sendKeys(confirmPWD);
	
 }
 
 public void clickSave() {
	 
	 WebElement element = StepDefition.driver.findElement(By.name(SAVEBTN));
	 element.click();
 }
 
 public void validateUserUpdateSuccessMessage(String expectedMessage) {
	String actualMessage  =   StepDefition.driver.findElement(By.xpath(EXPMSG)).getText();
	System.out.println("actual message is " + actualMessage);
	Assert.assertEquals(expectedMessage, actualMessage);
	 
 }
 
 
}
