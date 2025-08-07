package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToAppln {

	public static void main(String[] args) throws InterruptedException {
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		// impicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String url="https://www.facebook.com/";
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]",url);
		Thread.sleep(3000);
		driver.quit();

	}

}
