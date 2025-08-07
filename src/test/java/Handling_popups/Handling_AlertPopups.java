package Handling_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_AlertPopups {

	public static void main(String[] args) throws InterruptedException {
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//impicit  wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//naviagte to an apln
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//identifu the alert popus
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		//handle alret popups
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		//al.dismiss();
		
		
		//capture the result
		WebElement res = driver.findElement(By.id("result"));
		System.out.println(res.getText());
		
		//close the window
		driver.quit();
		
		
		

	}

}
