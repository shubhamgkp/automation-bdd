Feature: Update personal Information

@Test
Scenario: Update personal information(First Name) in my account
Given Open browser
When User click on Sign In link
And User enter username "automationpractice25@gmail.com" and password "test@1234"
And Click on SignIn button
And User clicks on My Personal Information button
And User enter "newtestuserrrr" in firstname input box
And User enters "test@1234" in Current password
And User enters "test@1234" in New Password
And User enters "test@1234" in Confirmation
And Click on Save
Then Validate message "Your personal information has been successfully updated."