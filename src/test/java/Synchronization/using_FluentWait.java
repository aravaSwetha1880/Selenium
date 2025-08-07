package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class using_FluentWait {

	public static void main(String[] args) {
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		// navigate to an appln
		driver.get("https://www.facebook.com/");
		
		//fluent wait
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		// menting time duration to wait
		wait.withTimeout(Duration.ofSeconds(10));
		
		// customizing the polling period
		
		wait.pollingEvery(Duration.ofSeconds(1));
		
		// ingoneing all the ecepetion
		wait.ignoring(Exception.class);
		
		//identify un tf
		WebElement un = driver.findElement(By.id("email"));
		
		// comdition
		wait.until(ExpectedConditions.visibilityOf(un));
		
		un.sendKeys("swetha");
		
		//driver.close();
		driver.quit();

	}

}
