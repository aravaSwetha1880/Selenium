package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_CssSelector {

	public static void main(String[] args) throws InterruptedException {
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		// maximize the window
		driver.manage().window().maximize();
		
		// navigate to an appln
		driver.get("https://www.flipkart.com/");
		
		// identify the login and click on it
		driver.findElement(By.cssSelector("img[alt=\"Login\"]")).click();
		Thread.sleep(3000);
		
		// identify the Tf
		driver.findElement(By.cssSelector("input[class=\"r4vIwl BV+Dqf\"]")).sendKeys("9391423325");
		Thread.sleep(3000);
		
		//clcick on  requset otp
		driver.findElement(By.cssSelector("button[class=\"QqFHMw twnTnD _7Pd1Fp\"]")).click();
		Thread.sleep(3000);
		 
		// close the window
		driver.quit();
	}

}
