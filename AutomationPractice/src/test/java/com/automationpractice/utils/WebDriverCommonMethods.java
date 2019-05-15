package com.automationpractice.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automationpractice.stepdefinition.StepDefition;

public class WebDriverCommonMethods {

     WebDriverWait wait;
	// Wait for Page Load

	public void WaittoPageLoad() {

		Boolean readyStateComplete 				= false;

		try {

			while (!readyStateComplete) {
				JavascriptExecutor executor 	= (JavascriptExecutor) StepDefition.driver;
				readyStateComplete 				= ((String) executor.executeScript("return document.readyState")).equals("complete");
			}

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void clickJS(WebElement element) {

		try {

			((JavascriptExecutor) StepDefition.driver).executeScript("arguments[0].click();",element);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static void scrollToElement(WebElement element) {

		try {

			((JavascriptExecutor) StepDefition.driver).executeScript("arguments[0].scrollIntoView();",element);

		} catch(Exception e){
			e.printStackTrace();
		}
	}


	public void waitForElementVisibility(WebElement element) {

		try {

			wait	= new WebDriverWait(StepDefition.driver,30);

			wait.until(ExpectedConditions.visibilityOf(element));

		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

	// Wait for Web element Clickable

	public void waitForElement(WebElement element) {

		try {

			wait	= new WebDriverWait(StepDefition.driver,120);

			wait.until(ExpectedConditions.elementToBeClickable(element));

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}

