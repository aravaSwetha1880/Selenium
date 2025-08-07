package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_NestedFrames {

	public static void main(String[] args) throws InterruptedException {
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//naviagte to an appln
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		
		WebElement outer_frame = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
     driver.switchTo().frame(outer_frame);
     
    WebElement email = driver.findElement(By.xpath("//p[@class='para' and contains(text(),'Admin@gmail.com')]"));
     System.out.println(email.getText());
     Thread.sleep(3000);
     
     //switch to driver control to inner frame
     driver.switchTo().frame(0);
     
     //sign up
     driver.findElement(By.id("email")).sendKeys("aravaswetha@014.COM");
     driver.findElement(By.id("password")).sendKeys("swetha123");
     
     driver.findElement(By.id("confirm-password")).sendKeys("swetha123");
     driver.findElement(By.id("submitButton")).click();
     
     Thread.sleep(3000);
     driver.quit();
	}

}
