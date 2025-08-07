package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_passthetext {

	public static void main(String[] args) throws InterruptedException {
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		// impicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an appln
		driver.get("https://www.facebook.com/");
	
		//identify the un tf
		WebElement email= driver.findElement(By.id("email"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=arguments[1]",email,"aravaswetha014@gmail.com");
		 Thread.sleep(3000);
		
		WebElement pass = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].value=arguments[1]",pass,"swetha@123");
		Thread.sleep(3000);
		
		
		WebElement login = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()",login);
		Thread.sleep(3000);
		System.out.println("login sucessfully...");
		driver.quit();
		

	}

}
