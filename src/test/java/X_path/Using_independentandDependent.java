package X_path;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_independentandDependent {

	public static void main(String[] args) {
		// launch the browser
		WebDriver driver=new ChromeDriver();
		
		// maximize the window
		driver.manage().window().maximize();
		// navigate to an apln
		driver.get("https://www.flipkart.com/");
		
		// identify the search tf
		driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("toyes"+Keys.ENTER);
		WebElement price = driver.findElement(By.xpath("//a[text()='CLICKEDIA Toy-Monster Truck-Pack of 4']/../a[@class=\"DMMoT0\"]/div/div[@class=\"Nx9bqj\"]"));
		  System.out.println(price.getText());
driver.quit();
	}
}

