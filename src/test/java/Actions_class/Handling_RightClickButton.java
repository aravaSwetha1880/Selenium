package Actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_RightClickButton {

	public static void main(String[] args) throws InterruptedException {
		// // launch the browser
		WebDriver driver=new ChromeDriver();
		
		// maximize the window
		driver.manage().window().maximize();
		
		// impicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightclick = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		 
		Actions act=new Actions(driver);
		act.contextClick(rightclick).build().perform();
		driver.navigate().refresh();
		
		// identify the doduble clcick action
		WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		act.doubleClick(doubleclick).perform();
		Thread.sleep(3000);
	}

}
