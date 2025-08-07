package Handling_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_calendarPopups {

	public static void main(String[] args) throws InterruptedException {
		//launch the broswer
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//impicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an appln
		driver.get("https://www.makemytrip.com/");
		
		//handle the popups
		driver.findElement(By.className("commonModal__close")).click();
		
		// identify the from 
		driver.findElement(By.id("fromCity")).click();
driver.findElement(null);
		
		//identify the from tf
		 driver.findElement(By.xpath("//p[@class='font14 appendBottom5 blackText']")).click();	
		Thread.sleep(3000);
		
		//identify the  to
		driver.findElement(By.id("toCity")).click();
		driver.findElement(By.xpath("(//div[@class=\"makeFlex column flexOne appendRight10\"])[6]")).click();
	
		Thread.sleep(3000);						
		//identify the calender popups
		
		driver.findElement(By.xpath("//div[@aria-label='Thu Aug 07 2025']")).click();
		Thread.sleep(3000);
	   driver.findElement(By.xpath("(//span[@class='lbl_input appendBottom10'])[4]")).click();
	  
	   driver.findElement(By.xpath("//div[@aria-label='Sun Sep 07 2025']")).click();
	   Thread.sleep(3000);
       driver.quit();
	
		
	}
	

}
