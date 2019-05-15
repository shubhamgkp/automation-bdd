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
import com.automationpractice.pages.TShirts;
import com.automationpractice.utils.ReadConfig;
import com.automationpractice.utils.WebDriverCommonMethods;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefition {
	public static WebDriver driver;
	BaseClass                base                               =      new BaseClass();
	WebDriverCommonMethods   commom                             =      new WebDriverCommonMethods();
	HomePage                 homepage                           =      new HomePage();
	LoginAndRegistration     login                              =      new LoginAndRegistration();
	MyAccount                myAccount                          =      new MyAccount();
	TShirts					 tshirt								=	   new TShirts(); 

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

	@When("^User clicks on T-Shirts tab$") public void
	User_clicks_on_T_Shirts_tab() throws Throwable {

		tshirt.clickTShirtLink();
	}

	@When("^User add t-shirt in Cart$") public void User_add_t_shirt_in_Cart()
			throws Throwable {
		tshirt.clickAddToCart();
	}

	@When("^User clicks on Proceed to checkout button$") public void
	User_clicks_on_Proceed_to_checkout_button() throws Throwable {

		tshirt.clickProceedToCheckout();
	}

	@When("^User clicks on Proceed to checkout button on Summary tab$") public
	void User_clicks_on_Proceed_to_checkout_button_on_Summary_tab() throws
	Throwable {
		tshirt.clickProceedToCheckoutSummaryBtn();
	}

	@When("^User clicks on Proceed to checkout button on Address tab$") public
	void User_clicks_on_Proceed_to_checkout_button_on_Address_tab() throws
	Throwable {
		tshirt.clickProceedToCheckoutAddressBtn();
	}

	@When("^User accepts the Terms and Condition$") public void
	User_accepts_the_Terms_and_Condition() throws Throwable {
		tshirt.clickTermsAndCondition();
	}

	@When("^User clicks on Proceed to checkout button on Shipping tab$") public
	void User_clicks_on_Proceed_to_checkout_button_on_Shipping_tab() throws
	Throwable {
		tshirt.clickProceedToCheckoutTerms();
	}

	@When("^User choose Pay by bank wire payment option$") public void
	User_choose_Pay_by_bank_wire_payment_option() throws Throwable {
		tshirt.clickPaybyBankWire();
	}

	@When("^User confirms the order$") public void User_confirms_the_order()
			throws Throwable {
		tshirt.clickConfirmMyOrder();
	}


	@Then("^Validate order has been done$") public void
	Validate_order_has_been_done() throws Throwable {
		tshirt.validateOrder();
	}

	@When("^User clicks on back to order history$") public void
	User_clicks_on_back_to_order_history() throws Throwable {

		tshirt.clickBackOrders();
	}

	@Then("^Validate the recent order in order history$") public void
	Validate_the_recent_order_in_order_history() throws Throwable {

		tshirt.clickBackOrders();
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
