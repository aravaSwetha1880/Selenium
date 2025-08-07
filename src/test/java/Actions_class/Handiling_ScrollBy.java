package Actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handiling_ScrollBy {

	public static void main(String[] args) throws InterruptedException {
		// launch the browser
		WebDriver driver=new EdgeDriver();
		
		// maximize the window
		driver.manage().window().maximize();
		
		// impicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// naviagte to an appln
		driver.get("https://www.amazon.in/");
		
		
		// scroll the wedpage based on x and y coordinate
		Actions act=new Actions(driver);
		act.scrollByAmount(100, 1700).perform();
		System.out.println("sucessfully scroll the wedpage");
		
		
		// identify the element and scroll the wedpage till element visible
		WebElement backtotop = driver.findElement(By.xpath("//span[contains(text(),'Back to top')]"));
		act.scrollToElement(backtotop).perform();
		System.out.println("element is visible"
				+ "");
		
		Thread.sleep(3000);
		
		//close the window
		driver.quit();
		

	}

}
