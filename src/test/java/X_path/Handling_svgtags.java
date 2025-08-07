package X_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_svgtags {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		
		driver.findElement(By.name("q")).sendKeys("toys");
		driver.findElement(By.xpath("//*[name()='svg'][@width=\"24\"]")).click();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
