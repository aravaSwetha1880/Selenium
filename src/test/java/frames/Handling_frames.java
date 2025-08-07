package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_frames {

	public static void main(String[] args) throws InterruptedException {
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an appln
		driver.get("https://www.zomato.com/india");
		
		//identify the login 
		driver.findElement(By.linkText("Log in")).click();
		
		Thread.sleep(3000);
		
		// switch to the driver control to frame
		driver.switchTo().frame("auth-login-ui");
		
		//identify the mno tf
		driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("8186979838");
		
		//identify the cross btn
		driver.findElement(By.xpath("//i[@aria-label=\"close Modal\"]")).click();
		
		
		//switch driver control to the main web page
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		//identify the login btn
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
		
				
		

	}

}

























