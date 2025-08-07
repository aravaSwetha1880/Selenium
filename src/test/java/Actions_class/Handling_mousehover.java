package Actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_mousehover{

	public static void main(String[] args) throws InterruptedException {
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		// maximize the window
		driver.manage().window().maximize();
		
		// impilicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//naviagte to an appln
		driver.get("https://www.ajio.com/");
		
		WebElement kids = driver.findElement(By.xpath("//span[text()='MEN']"));
		
		
		//mouse hover the element
		Actions act=new Actions(driver);
		act.moveToElement(kids).perform();
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}
