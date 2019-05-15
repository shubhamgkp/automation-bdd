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

	@Given("^Open browser$")
	public void Open_browser() throws Throwable {
		this.driver                       = BaseClass.getDriver();
		Properties  config                =  ReadConfig.readPropertFile();
		driver.get(config.getProperty("Testing_URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		commom.WaittoPageLoad();
	}

	@When("^User click on Sign In link$")
	public void User_click_on_Sign_In_link() throws Throwable {
		homepage.clickSignIn();

	}

	@When("^User enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void User_enter_username_and_password(String username, String password) throws Throwable {
		login.enterUsername(username);
		login.enterPassword(password);
	}

	@When("^Click on SignIn button$")
	public void Click_on_SignIn_button() throws Throwable {
		login.clickSignInButton();
	}

	
	
	

	/*
	 * @When("^User clicks on T-Shirts tab$") public void
	 * User_clicks_on_T_Shirts_tab() throws Throwable {
	 * 
	 * }
	 * 
	 * @When("^User add t-shirt in Cart$") public void User_add_t_shirt_in_Cart()
	 * throws Throwable {
	 * 
	 * }
	 * 
	 * @When("^User clicks on Proceed to checkout button$") public void
	 * User_clicks_on_Proceed_to_checkout_button() throws Throwable {
	 * 
	 * }
	 * 
	 * @When("^User clicks on Proceed to checkout button on Summary tab$") public
	 * void User_clicks_on_Proceed_to_checkout_button_on_Summary_tab() throws
	 * Throwable {
	 * 
	 * }
	 * 
	 * @When("^User clicks on Proceed to checkout button on Address tab$") public
	 * void User_clicks_on_Proceed_to_checkout_button_on_Address_tab() throws
	 * Throwable {
	 * 
	 * }
	 * 
	 * @When("^User accepts the Terms and Condition$") public void
	 * User_accepts_the_Terms_and_Condition() throws Throwable {
	 * 
	 * }
	 * 
	 * @When("^User clicks on Proceed to checkout button on Shipping tab$") public
	 * void User_clicks_on_Proceed_to_checkout_button_on_Shipping_tab() throws
	 * Throwable {
	 * 
	 * }
	 * 
	 * @When("^User choose Pay by bank wire payment option$") public void
	 * User_choose_Pay_by_bank_wire_payment_option() throws Throwable {
	 * 
	 * }
	 * 
	 * @When("^User confirms the order$") public void User_confirms_the_order()
	 * throws Throwable {
	 * 
	 * }
	 * 
	 * @Then("^Validate order has been done$") public void
	 * Validate_order_has_been_done() throws Throwable {
	 * 
	 * }
	 * 
	 * @When("^User clicks on back to order history$") public void
	 * User_clicks_on_back_to_order_history() throws Throwable {
	 * 
	 * }
	 * 
	 * @Then("^Validate the recent order in order history$") public void
	 * Validate_the_recent_order_in_order_history() throws Throwable {
	 * 
	 * }
	 * 
	 */
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

	/*
	 * @After public void afterScenario(Scenario scenario) {
	 * 
	 * if (scenario.isFailed()) { // Take a screenshot... final byte[] screenshot =
	 * ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	 * scenario.embed(screenshot, "image/png"); // ... and embed it in the report. }
	 * 
	 * if(this.driver!=null) { this.driver.quit(); }
	 * 
	 * }
	 */

}
