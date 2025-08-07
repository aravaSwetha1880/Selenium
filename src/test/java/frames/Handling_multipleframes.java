package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_multipleframes {

	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		// impicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class=\"w-full h-96\"]"));
		Thread.sleep(3000);

		driver.switchTo().frame(frame);
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Admin@1234");
		driver.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
		Thread.sleep(3000);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(3000);
		
	 
		//driver.navigate().refresh();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		
		driver.findElement(By.id("username")).sendKeys("SuperAdmin@gmail.com");
		driver.findElement(By.id("password")).sendKeys("SuperAdmin@1234");
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(3000);
		driver.quit();
		

}

}
