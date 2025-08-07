package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_implicitwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		
		// impilivt wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		// naviate to an appln
		driver.get("https://shoppersstack.com/");

	//	Thread.sleep(50000);
		
		// identify the logon btn and click
		driver.findElement(By.id("loginBtn")).click();
	}

}
