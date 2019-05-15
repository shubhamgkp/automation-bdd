package com.automationpractice.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.automationpractice.stepdefinition.StepDefition;

public class TShirts {

	
	public static final String TShirts_LINK       =  "/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]";
	public static final String AddToCart       =  "//span[contains(text(),'Add to cart')]";
	public static final String ProceedToCheckout = "//a[@title='Proceed to checkout']//span";	
	public static final String ProceedToCheckoutSummaryBtn = "//p[@class='cart_navigation clearfix']//span";	
	public static final String ProceedToCheckoutAddressBtn	= "//button[@name='processAddress']//span";	
	public static final String TermsAndCondition = "//input[@id='cgv']";	
	public static final String ProceedToCheckoutTerms = "//button[@name='processCarrier']//span";	
	public static final String PaybyBankWire = "//a[@title='Pay by bank wire']";	
	public static final String ConfirmMyOrder = "//p[@id='cart_navigation']//span";
	public static final String OrderDone = "//strong[contains(text(),'Your order on My Store is complete.')]";
	public static final String BackOrders = "//a[@title='Back to orders']";
	
	/*
	 * public static final String OrderConfirmVerified =
	 * "//strong[contains(text(),'Your order on My Store is complete.')]"; public
	 * static final String BackOrderHistory = "//a[@title='Back to orders']";
	 */
	public void clickTShirtLink(){
		WebElement element = StepDefition.driver.findElement(By.xpath(TShirts_LINK));
		element.click();
	}
	
	public void clickAddToCart() throws InterruptedException{
		
		JavascriptExecutor jse = (JavascriptExecutor)StepDefition.driver;
		jse.executeScript("window.scrollBy(0,750)", "");
				
		Actions action = new Actions(StepDefition.driver);
		
		WebElement elementHover = StepDefition.driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
        action.moveToElement(elementHover).build().perform();
        
        Thread.sleep(5000);
        WebElement element = StepDefition.driver.findElement(By.xpath(AddToCart));
		element.click();
	}

	public void clickProceedToCheckout() throws InterruptedException{
		
		Thread.sleep(5000);
		WebElement element = StepDefition.driver.findElement(By.xpath(ProceedToCheckout));
		element.click();
	}
	
	public void clickProceedToCheckoutSummaryBtn(){
		WebElement element = StepDefition.driver.findElement(By.xpath(ProceedToCheckoutSummaryBtn));
		element.click();
	}
	
	public void clickProceedToCheckoutAddressBtn(){
		WebElement element = StepDefition.driver.findElement(By.xpath(ProceedToCheckoutAddressBtn));
		element.click();
	}
	
	public void clickTermsAndCondition(){
		WebElement element = StepDefition.driver.findElement(By.xpath(TermsAndCondition));
		element.click();
	}
	
	public void clickProceedToCheckoutTerms(){
		WebElement element = StepDefition.driver.findElement(By.xpath(ProceedToCheckoutTerms));
		element.click();
	}
	
	public void clickPaybyBankWire(){
		WebElement element = StepDefition.driver.findElement(By.xpath(PaybyBankWire));
		element.click();
	}	
	
	public void clickConfirmMyOrder() throws InterruptedException{
		
		Thread.sleep(3000);
		WebElement element = StepDefition.driver.findElement(By.xpath(ConfirmMyOrder));
		element.click();
	}
	
	public void validateOrder(){
		WebElement element = StepDefition.driver.findElement(By.xpath(OrderDone));		
		System.out.println(element.getText());
		Assert.assertEquals("Your order on My Store is complete.", element.getText());
	}
	
	public void clickBackOrders(){
		WebElement element = StepDefition.driver.findElement(By.xpath(BackOrders));
		element.click();
	}
	
}
