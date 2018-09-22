Feature: Facebook login functionality
 Scenario: Login with Valid credentials
 Given User is on the login page
  When user enters username
  And User enters password
  And User clicks on the signin button
  Then user logged in successfully
  Then application should be closed
  
 
 Scenario: Login with Invalid credentials
 Given User is on the login page
  When user enters incorrect username
  And User enters password
  And User clicks on the signin button
  Then user should not be logged in
  