package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_DisabledElements {

	public static void main(String[] args) throws InterruptedException {
		 // launch the broswer
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		// impicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/swetha_arava/OneDrive/Apps/Desktop/login.html");
		
		//handling desabledtextfield
		WebElement untf = driver.findElement(By.id("un"));
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].value=arguments[1]",untf,"swetha@123");
		 Thread.sleep(3000);
		 
		 //handle the button
		 WebElement loginbtn = driver.findElement(By.id("login"));
		 
		 js.executeScript("arguments[0].disabled=false",loginbtn);
		 loginbtn.click();
		 
		 Thread.sleep(3000);
		 
		 driver.quit();

	}

}
