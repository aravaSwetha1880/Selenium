package Relative_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class using_aboveandbelow{
	public static void main(String[] args) throws InterruptedException {
		
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		// navigate to an appln
		driver.get("https://www.facebook.com/");
		
		// identify the pswd Tf
		WebElement pswd = driver.findElement(By.id("pass"));
		
		// identofy the  un TF
		WebElement un = driver.findElement(RelativeLocator.with(By.tagName("input")).above(pswd));
	    un.sendKeys("selenium");
	 
	 pswd.sendKeys("abc123");
	 
	 // IDENTIFY the login
	 driver.findElement(RelativeLocator.with(By.tagName("button")).below(pswd)).click();
	 
	 Thread.sleep(3000);
	 driver.quit();
		
	}

}
