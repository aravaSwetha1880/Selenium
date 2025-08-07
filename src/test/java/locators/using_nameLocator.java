package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class using_nameLocator {

	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		WebDriver driver=new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		
		// naviage the appl
		driver.get("https://www.facebook.com/");
		
		// identify the us tf
		driver.findElement(By.name("email")).sendKeys("selenium");
		
		// identify the pswd tf
		driver.findElement(By.name("pass")).sendKeys("abc123");
		
		
		// click on login
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
		// close the window
		driver.quit();

	}

}
