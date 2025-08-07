package Handling_popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class childwindow_popups {

	public static void main(String[] args) throws InterruptedException {
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		// impicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		//naviagte to an appln
		driver.get("https://www.flipkart.com/");
		
		//identify the search tf
		driver.findElement(By.name("q")).sendKeys("mobiles"+Keys.ENTER);
		
		String pwid = driver.getWindowHandle();
		//identify the product link and click on it
		driver.findElement(By.xpath("//div[contains(text(),'Motorola g45 5G (Brilliant G')]")).click();
		//fetch all window handles
		Set<String> wids = driver.getWindowHandles();
		
		for(String s : wids) {
			driver.switchTo().window(s);
			if(driver.getTitle().contains(s)) {
				driver.findElement(By.xpath("//button[@class=\"QqFHMw vslbG+ In9uk2\"]"));
				Actions act = new Actions(driver);
				act.click().perform();
				Thread.sleep(3000);
				break;
				
			}
		}
		driver.switchTo().window(pwid);
		System.out.println(driver.getTitle());
       //close the browser
		driver.quit();
	}

}
