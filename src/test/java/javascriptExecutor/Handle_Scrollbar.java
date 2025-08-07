package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Scrollbar {

	public static void main(String[] args) throws InterruptedException {
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an appln
		driver.get("https://www.swiggy.com/restaurants"); 
		
		
		// scroll the wedpage using gardcoded coordinates
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//js.executeScript("window.scrollBy(100,1000)");
		
		Thread.sleep(3000);
		
		//scroll the wedpage using element reference
		WebElement ele = driver.findElement(By.xpath("//h2[text()='Best Cuisines Near Me']"));
		
		js.executeScript("arguments[0].scrollIntoView(true)",ele);
		Thread.sleep(3000);
		
		//find the x axies and y axies
		int xaxies = ele.getLocation().getX();
		int yaxies = ele.getLocation().getY();
		//js.executeScript("window.scrollBy("+xaxies+","+yaxies+")");
		Thread.sleep(3000);
		//scroll till buttom of the wedpage
		js.executeScript("window,scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(3000);
		js.executeScript("window,scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(3000);
		driver.quit();
		
	}


}
