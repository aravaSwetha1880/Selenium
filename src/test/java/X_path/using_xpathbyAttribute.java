package X_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class using_xpathbyAttribute {

	public static void main(String[] args) throws InterruptedException {
		// launch the browser
		WebDriver driver=new ChromeDriver();
		
		// maximize
		driver.manage().window().maximize();
		
		// navigate to an appln
		driver.get("https://www.facebook.com/");
		
		// identify the username tf and pass the text
		driver.findElement(By.xpath("//input[@data-testid='royal-email']")).sendKeys("selenium");
		Thread.sleep(3000);
		// identify the pswd tf
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc123");
		Thread.sleep(3000);
		
		// click on login btn
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);
		// close the window
		driver.quit();
		

	}

}
