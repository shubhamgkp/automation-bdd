Feature: Order T-Shirt

@Test
Scenario: Order and Validate Purchase
Given Open browser
When User click on Sign In link
And User enter username "automationpractice25@gmail.com" and password "test@1234"
And Click on SignIn button
And User clicks on T-Shirts tab
And User add t-shirt in Cart
And User clicks on Proceed to checkout button
And User clicks on Proceed to checkout button on Summary tab
And User clicks on Proceed to checkout button on Address tab
And User accepts the Terms and Condition
And User clicks on Proceed to checkout button on Shipping tab
And User choose Pay by bank wire payment option
And User confirms the order
Then Validate order has been done
When User clicks on back to order history







