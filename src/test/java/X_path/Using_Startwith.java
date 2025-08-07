package X_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Startwith {

	public static void main(String[] args) throws InterruptedException {
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		// maximize the window
		driver.manage().window().maximize();
		
		// navigate to an appl
		driver.get("https://www.facebook.com/");
		
		// identify the email test feild
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Email ')]"
				+ "")).sendKeys("selenium");
		
		// identify the pswd testfeild
		driver.findElement(By.xpath("//input[starts-with(@aria-label,'Pass')]")).sendKeys("abc@123");
		
		// identify the login button and click on it
		driver.findElement(By.xpath("//button[starts-with(@data-testid,'royal-login-button')]")).click();
		 Thread.sleep(3000);
         driver.quit();
	}

}
