package org.testingworld.automation.base;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateDriverInstance {
	
	WebDriver driver;
	public WebDriver invokeBrowser()
	{
	
		//ResourceBundle rbdata = ResourceBundle.getBundle("C:/Users/Shweta srivastava/workspace/BDDAutomationProject/src/test/java");
				//if(rbdata.getString("browser").equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
		driver.get("https://www.facebook.com");
		return driver;

}

	public void closebrowser(WebDriver driver)
	{
	driver.quit();
}
	}
