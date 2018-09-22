package testdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("uname");
		driver.findElement(By.id("pass")).sendKeys("pname");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.close();
	}

}
