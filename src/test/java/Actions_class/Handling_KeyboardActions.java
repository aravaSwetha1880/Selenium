package Actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		
		// maximize the window
		driver.manage().window().maximize();
		
		// impilicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//naviagte  to an appln
		driver.get("https://www.flipkart.com/");
		
		WebElement searchtf = driver.findElement(By.name("q"));
		Actions act=new Actions(driver);
		act.moveToElement(searchtf).click().sendKeys("mobiles").keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		driver.quit();

	}

}
