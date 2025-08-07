package X_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_xpathbyText {

	public static void main(String[] args) throws InterruptedException {
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		// maximze the window
		driver.manage().window().maximize();
		
		// naviagte to an appln
		driver.get("https://www.facebook.com/");

		// identify by create new account btn and click
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		
		// identify the already have an account
		driver.findElement(By.xpath("//a[.='Already have an account?']")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
