package Handling_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_FileuploadPopups_usingSendkeys {

	public static void main(String[] args) throws InterruptedException {
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//impilicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		//identify the file upload popups
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\swetha_arava\\OneDrive\\Apps\\Desktop\\swetha_resume2.pdf.docx");
	  Thread.sleep(3000);
		driver.quit();
	}

}
