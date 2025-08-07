package Handling_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handling_NotificationPopups {

	public static void main(String[] args) throws InterruptedException {
		
		// handling the notification popups
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("--disable-geolocation");
		
		// launch the broswer
		WebDriver driver=new ChromeDriver(opt);
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//naviagte to an appln
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		Thread.sleep(3000);
		
		//identify the notifications and click on it
		driver.findElement(By.id("browNotButton")).click();
		Thread.sleep(3000);
		
		//close the window
		driver.quit();
		

	}

}
