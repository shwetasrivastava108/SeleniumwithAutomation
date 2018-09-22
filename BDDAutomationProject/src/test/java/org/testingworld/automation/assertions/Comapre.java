package org.testingworld.automation.assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Comapre {
	
	public static boolean validateUrl(WebDriver driver, String expectedUrl)
	{
		boolean result = false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expectedUrl))
				{
				result= true;
				}
		return result;
	}
	
	public static boolean validateexistenceofElements(WebDriver driver, String xpath)
	{
		boolean result= false;
		try
		{
			driver.findElements(By.xpath(xpath));
			result = true;
		}
		catch(Exception ex)
		{
		}
		return result;
		}
	}


 