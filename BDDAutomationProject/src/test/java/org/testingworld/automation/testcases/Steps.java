package org.testingworld.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.testingworld.automation.base.CreateDriverInstance;
import org.testingworld.automation.pages.Login;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class Steps {
	
WebDriver driver;


Login datalogin;
@Given("^User is on the login page$")
public void User_is_on_the_login_page() throws Throwable {
	CreateDriverInstance driverInstance = new CreateDriverInstance();
	driver = driverInstance.invokeBrowser();
	
}

@When("^user enters username$")
public void user_enters_username() throws Throwable {
	Login datalogin = new Login(driver);
	datalogin.username("username1");
	
   
}

@When("^User enters password$")
public void User_enters_password() throws Throwable {
	Login datalogin = new Login(driver);
datalogin.password("password1");  
}

@When("^User clicks on the signin button$")
public void User_clicks_on_the_signin_button() throws Throwable {
Login datalogin = new Login(driver);
 datalogin.ClickSignInButton();  
}

@Then("^user logged in successfully$")
public void user_logged_in_successfully() throws Throwable {
    
}

@Then("^application should be closed$")
public void application_should_be_closed() throws Throwable {
  driver.quit();
}

@When("^user enters incorrect username$")
public void user_enters_incorrect_username() throws Throwable {
    
}

@Then("^user should not be logged in$")
public void user_should_not_be_logged_in() throws Throwable {
  
}



}
