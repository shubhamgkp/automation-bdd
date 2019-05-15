package com.automationpractice.stepdefinition;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.automationpractice.Base.BaseClass;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.LoginAndRegistration;
import com.automationpractice.pages.MyAccount;
import com.automationpractice.utils.ReadConfig;
import com.automationpractice.utils.WebDriverCommonMethods;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefitionUpdateProfile {
	public static WebDriver driver;
	BaseClass                base                               =      new BaseClass();
	WebDriverCommonMethods   commom                             =      new WebDriverCommonMethods();
	HomePage                 homepage                           =      new HomePage();
	LoginAndRegistration     login                              =      new LoginAndRegistration();
	MyAccount                myAccount                          =      new MyAccount();


	/*Steps starts from here*/
		
	@When("^User clicks on My Personal Information button$")
	public void User_clicks_on_My_Personal_Information_button() throws Throwable {
		myAccount.clickMyPersonalInformation();
	}

	@When("^User enter \"([^\"]*)\" in firstname input box$")
	public void User_enter_in_firstname_input_box(String firstName) throws Throwable {
		System.out.println("FirstName value from feature file " + firstName);
		myAccount.enterFirstName(firstName);
	}

	@When("^Click on Save$")
	public void Click_on_Save() throws Throwable {
		myAccount.clickSave();
	}

	@When("^User enters \"([^\"]*)\" in Current password$")
	public void User_enters_in_Current_password(String currentPWD) throws Throwable {
		myAccount.enterCurrentPWD(currentPWD);
	}

	@When("^User enters \"([^\"]*)\" in New Password$")
	public void User_enters_in_New_Password(String newPassword) throws Throwable {
		myAccount.enterNewPWD(newPassword);
	}

	@When("^User enters \"([^\"]*)\" in Confirmation$")
	public void User_enters_in_Confirmation(String confirmPWD) throws Throwable {
		myAccount.enterConfirmPWD(confirmPWD);
	}

	@Then("^Validate message \"([^\"]*)\"$")
	public void Validate_message(String expectedMessage) throws Throwable {
		myAccount.validateUserUpdateSuccessMessage(expectedMessage);
	}	

	@After 
	public void afterScenario(Scenario scenario) {

		if (scenario.isFailed()) { // Take a screenshot... 
			final byte[] screenshot =((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png"); // ... and embed it in the report. }

			if(StepDefition.driver!=null) { 
				StepDefition.driver.quit(); }
		}
	}
}
