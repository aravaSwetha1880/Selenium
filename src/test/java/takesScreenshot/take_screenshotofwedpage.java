package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class take_screenshotofwedpage {

	public static void main(String[] args) throws IOException {
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//impicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// navugate to an appln
		driver.get("https://www.flipkart.com/");
		
		
		//takes the ss of wedelement
		//step1: identify the wed element
		WebElement chair = driver.findElement(By.xpath("(//img[@class='_2puWtW _3a3qyb'])[6]"));
		
		//stpe2
		File src=chair.getScreenshotAs(OutputType.FILE);
		
		//step3:create the empty folder
		File dest=new File("./screenshot/flipkartele1.png");
		FileUtils.copyFile(src, dest);
		driver.quit();

	}

}
