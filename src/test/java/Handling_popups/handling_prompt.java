package Handling_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_prompt {

	public static void main(String[] args) {
	
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//impicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an appln
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		//handling the popups
		Alert al = driver.switchTo().alert();
		al.sendKeys("swetha");
		al.accept();
		
		
		//fetch the result
		WebElement res = driver.findElement(By.id("result"));
		System.out.println(res.getText());

		driver.quit();

	}

}
