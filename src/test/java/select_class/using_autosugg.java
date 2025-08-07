package select_class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class using_autosugg {

	public static void main(String[] args) throws InterruptedException {
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		
		// impicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an apln
		driver.get("https://www.google.com/");

		
		//identfy the search Tf
		driver.findElement(By.id("APjFqb")).sendKeys("sele");
		Thread.sleep(3000);
		
		List<WebElement> list = driver.findElements(By.xpath("//span[text()='sele']"));
		for (WebElement ele : list) {
			System.out.println(ele.getText());
			
		}
		Thread.sleep(3000);
		//driver.quit();
		

	}

}
