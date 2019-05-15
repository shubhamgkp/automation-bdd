package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.automationpractice.stepdefinition.StepDefition;

public class LoginAndRegistration {

	public static final String USERNAME           = "email";
	public static final String PWD                = "passwd";
	public static final String SIGNIN             = "SubmitLogin";


	public void enterUsername(String username) {

		WebElement element = StepDefition.driver.findElement(By.name(USERNAME));
		element.sendKeys(username);
	}

	public void enterPassword(String password) {

		WebElement element = StepDefition.driver.findElement(By.name(PWD));
		element.sendKeys(password);
	}	

	public void clickSignInButton(){
		WebElement element = StepDefition.driver.findElement(By.id(SIGNIN));
		element.click();
	}

}
