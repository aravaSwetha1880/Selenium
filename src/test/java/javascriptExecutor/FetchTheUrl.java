package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTheUrl {

	public static void main(String[] args) throws InterruptedException {
		        // launch the broswer
				WebDriver driver=new ChromeDriver();
				
				//maximize the window
				driver.manage().window().maximize();
				
				// impicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get("https://www.facebook.com/");
				JavascriptExecutor js=(JavascriptExecutor)driver;
				System.out.println(js.executeScript("return document.title"));
				
				//fetch the url
				System.out.println(js.executeScript("return document.URL"));
				Thread.sleep(3000);
				
				//refersh the wedpage
				js.executeScript("history.go(0)");
				Thread.sleep(3000);
				driver.quit();

	}

}
