package partice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_NegativeUsernameTest {

	public static void main(String[] args) throws InterruptedException {
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		// maximize the window
		driver.manage().window().maximize();
		
		// impicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// naviagte to an appln
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		//identify the us tf
		driver.findElement(By.id("username")).sendKeys("asha");
		
		//identify the pswd tf
		driver.findElement(By.id("password")).sendKeys("Password12");
		
		//identify the submit btn
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		
		//verify the error msg dispalyed
		WebElement error = driver.findElement(By.xpath("//div[contains(text(),'Your')]"));
		if (error.isDisplayed()) {
			System.out.println(error.getText());
			
		}
		else
			System.out.println("error msg not dispalyed");
		
	driver.quit();

	}

}
