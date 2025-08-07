package X_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_xpathbyContains {

	public static void main(String[] args) throws InterruptedException {
		// launch the broswer
		WebDriver driver= new ChromeDriver();
		
		// maximize the window
		driver.manage().window().maximize();
		
		// naviagte to an appln
		driver.get("https://demowebshop.tricentis.com/");
		
		// identify the search tf amd click on it
		driver.findElement(By.xpath("//a[contains(text(),'Reg')]")).click();
		Thread.sleep(3000);
		
		//click on gender btn
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		Thread.sleep(3000);
		
		// click on first name tf
		driver.findElement(By.xpath("//input[contains(@id,'FirstName')]")).sendKeys("arava");
		Thread.sleep(3000);
		// clcick on last name tf
		driver.findElement(By.xpath("//input[contains(@id,'LastName')]")).sendKeys("swetha");
		Thread.sleep(3000);
		
		//click on email and enter the test
		driver.findElement(By.xpath("//input[contains(@data-val-required,'Email')]")).sendKeys("swetha014@gamail.com");
		Thread.sleep(3000);
		// click on pswd tf
		driver.findElement(By.xpath("//input[contains(@data-val-length,'The pass')]")).sendKeys("swetha@1880");
		Thread.sleep(3000);
		
		// clcick on confirme pswd link
		driver.findElement(By.xpath("//input[contains(@name,'ConfirmPassword')]")).sendKeys("swetha@1880");
		Thread.sleep(3000);
		
		// clcik on register btn
		driver.findElement(By.xpath("//input[contains(@ name,'reg')]")).click();
		Thread.sleep(3000);
		// close the window
		driver.quit();
	}

}
