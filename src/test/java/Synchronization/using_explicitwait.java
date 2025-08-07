package Synchronization;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class using_explicitwait {

	public static void main(String[] args) {
		
		// launch the broswer
	WebDriver driver=new ChromeDriver();
	
	// maximze the window
	driver.manage().window().maximize();
	
	// impilcit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	
	
	// naviaget to am appln
	driver.get("https://shoppersstack.com/");
	WebElement login = driver.findElement(By.linkText("Login"));

	WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
Wait.until(ExpectedConditions.visibilityOf(login));
login.click();

// expicity wait using title contains method
Wait.until(ExpectedConditions.titleContains("ShoppersStack | Login\")"));
 driver.findElement(By.id("Email")).sendKeys("selenium@123");
 driver.findElement(By.id("Password")).sendKeys("abc");

 WebElement login1 = driver.findElement(By.xpath("//span[text()='Login']"));
 login1.click();


driver.quit();

	}

}
