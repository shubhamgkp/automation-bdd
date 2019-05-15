$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("OrderT-Shirt.feature");
formatter.feature({
  "line": 1,
  "name": "Order T-Shirt",
  "description": "",
  "id": "order-t-shirt",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Order and Validate Purchase",
  "description": "",
  "id": "order-t-shirt;order-and-validate-purchase",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click on Sign In link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enter username \"automationpractice25@gmail.com\" and password \"test@1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Click on SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on T-Shirts tab",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User add t-shirt in Cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User clicks on Proceed to checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User clicks on Proceed to checkout button on Summary tab",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User clicks on Proceed to checkout button on Address tab",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User accepts the Terms and Condition",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User clicks on Proceed to checkout button on Shipping tab",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User choose Pay by bank wire payment option",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User confirms the order",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Validate order has been done",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User clicks on back to order history",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefition.Open_browser()"
});
formatter.result({
  "duration": 22869312300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefition.User_click_on_Sign_In_link()"
});
formatter.result({
  "duration": 4347718000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "automationpractice25@gmail.com",
      "offset": 21
    },
    {
      "val": "test@1234",
      "offset": 67
    }
  ],
  "location": "StepDefition.User_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 431023600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefition.Click_on_SignIn_button()"
});
formatter.result({
  "duration": 5155359400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefition.User_clicks_on_T_Shirts_tab()"
});
formatter.result({
  "duration": 10903666500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefition.User_add_t_shirt_in_Cart()"
});
formatter.result({
  "duration": 5207638000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefition.User_clicks_on_Proceed_to_checkout_button()"
});
formatter.result({
  "duration": 10493139800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefition.User_clicks_on_Proceed_to_checkout_button_on_Summary_tab()"
});
formatter.result({
  "duration": 5936013900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefition.User_clicks_on_Proceed_to_checkout_button_on_Address_tab()"
});
formatter.result({
  "duration": 3227865500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefition.User_accepts_the_Terms_and_Condition()"
});
formatter.result({
  "duration": 77537900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefition.User_clicks_on_Proceed_to_checkout_button_on_Shipping_tab()"
});
formatter.result({
  "duration": 5808439500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefition.User_choose_Pay_by_bank_wire_payment_option()"
});
formatter.result({
  "duration": 2016433900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefition.User_confirms_the_order()"
});
formatter.result({
  "duration": 8477754000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefition.Validate_order_has_been_done()"
});
formatter.result({
  "duration": 56197000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefition.User_clicks_on_back_to_order_history()"
});
formatter.result({
  "duration": 3482039300,
  "status": "passed"
});
formatter.after({
  "duration": 162800,
  "status": "passed"
});
});