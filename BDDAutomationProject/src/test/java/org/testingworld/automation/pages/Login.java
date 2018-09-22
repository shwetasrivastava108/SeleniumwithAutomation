package org.testingworld.automation.pages;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	//ResourceBundle rbpage;
	WebDriver driver;
	public Login(WebDriver driver)
	{
	this.driver = driver;
	//ResourceBundle rbpage = ResourceBundle.getBundle("C:/Users/Shweta srivastava/workspace/BDDAutomationProject/src/test/java");
	}
	
	public void username(String uname)
	{
		driver.findElement(By.id("email")).sendKeys(uname);
	}
	
	public void password(String pname)
	{
		driver.findElement(By.id("pass")).sendKeys(pname);
	}
	
	public void ClickSignInButton()
	{
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}

}
