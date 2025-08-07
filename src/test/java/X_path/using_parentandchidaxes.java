package X_path;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class using_parentandchidaxes {

	public static void main(String[] args) throws InterruptedException {
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		// maximize the window
		driver.manage().window().maximize();
		
		// naviaget to an appln
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(5000);
		
		// identify the Tf
	driver.findElement(By.name("q")).sendKeys("mobiles"+Keys.ENTER);
	Thread.sleep(5000);
	
WebElement mobile = driver.findElement(By.xpath("//div[text()='REDMI A3X (Ocean Green, 64 GB)']/parent::div/parent::div/child::div[@class='col col-5-12 BfVC2z']/child::div[@class='cN1yYO']/child::div/child::div[contains(@class,'Nx9bqj ')]"));

System.out.println(mobile.getText());
driver.quit();

	
	}

}
