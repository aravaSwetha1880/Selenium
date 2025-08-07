package X_path;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Independent {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
		// navigate to an apln
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);																																								
		
		// identify the search tf
		driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("toyes"+Keys.ENTER);
		WebElement rating = driver.findElement(By.xpath("//a[text()='CLICKEDIA Toy-Monster Truck-Pack of 4']/../div/span/div[@class=\"XQDdHH\"]"));
		System.out.println(rating.getText());
		driver.quit();
	}

}
