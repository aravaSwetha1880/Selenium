package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class passThe_TextUsingJSE {

	public static void main(String[] args) throws InterruptedException {
	//launch the broswer
		WebDriver driver=new ChromeDriver();
	// naviagte to an appln
		driver.manage().window().maximize();
		
		// impicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// navigate to an  apln
		driver.get("https://www.flipkart.com/");
		
		//pass the text searc
		WebElement searchtf = driver.findElement(By.name("q"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value=arguments[1]",searchtf,"mobiles");
	   Thread.sleep(3000);
	   
	   //click an element
	   WebElement cart = driver.findElement(By.xpath("//a[text()='Cart']"));
	  js.executeScript("arguments[0].click()", cart);
	   Thread.sleep(3000);
	   driver.quit();
                                  

	}

}
