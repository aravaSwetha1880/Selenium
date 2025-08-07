package webElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class using_actionsMethods {
	public static void main(String[] args) throws InterruptedException {
		// launch the  broswer
		WebDriver driver=new ChromeDriver();
		
		// maximize the window
		driver.manage().window().maximize();
		
		// naviagete to an appln
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement search = driver.findElement(By.id("small-searchterms"));
		search.sendKeys("mobiles");
		Thread.sleep(3000);
		search.clear();
		
		search.sendKeys("computers");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
