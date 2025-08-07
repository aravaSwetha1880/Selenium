package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_classname {

	public static void main(String[] args) throws InterruptedException {
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		// maximize the window
		driver.manage().window().maximize();
		
		// get on appln
		driver.get("https://www.facebook.com/");
		
		// identify the un tf
		driver.findElement(By.className("_55r1")).sendKeys("selinum");
		
		// identify the pswd tf
		driver.findElement(By.className("_9npi")).sendKeys("abc@123");
		
		// identify the login button
		driver.findElement(By.className("_42ft")).click();
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
