package X_path;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_AncentorAndDesedent {

	public static void main(String[] args) throws InterruptedException {
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		// maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// naviagte to an appln
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		// identify the us Tf
		driver.findElement(By.name("q")).sendKeys("toys"+Keys.ENTER);
		Thread.sleep(5000);

		WebElement rating = driver.findElement(By.xpath("//a[contains(text(),'TAPUJI ')]/ancestor::div[@class=\"slAVV4\"]/descendant::a[@class=\"DMMoT0\"]/descendant::div[@class=\"Nx9bqj\"]"));
		System.out.println(rating.getText());	
	    Thread.sleep(5000);
	    // using following sibling and preceding sibling axes
	    
	    ////html/head/link/following-sibling::link/preceding-sibling::meta
	 
	 driver.quit();
	 
	}
	

}
