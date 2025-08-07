package X_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByGroupIdexing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//identify un tf using group indexing.
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("selenium");
		//identify password tf using group indexing.
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("abc123");
		//identify login btn and click on it.
		driver.findElement(By.xpath("//button")).click();
		Thread.sleep(3000);
		//close the browser.
		driver.quit();
	}

}
