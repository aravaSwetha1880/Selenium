package X_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//navigate to the application.
		driver.get("https://www.facebook.com/");
		//identify forgotten password link and click on it
		//using xpath by contains-->using text.
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
		//identify Tf abd pass the phno.
		//using xpath by contains-->using attribute
		driver.findElement(By.xpath("//input[contains(@placeholder,'Em')]")).sendKeys("9493221156");
		//identify search btn and click on it.
		driver.findElement(By.xpath("//button[contains(@id,'did')]")).click();
		Thread.sleep(3000);
		//close the browser.
		driver.quit();
 
	}

}
