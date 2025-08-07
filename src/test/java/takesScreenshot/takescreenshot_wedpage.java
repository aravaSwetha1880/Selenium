package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takescreenshot_wedpage {

	public static void main(String[] args) throws IOException {
		// launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the windoe
		driver.manage().window().maximize();
		
		//impicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//naviagte to an appln
		driver.get("https://www.flipkart.com/");
		
		//takes the screenshot on the wedpage
		//stpe1:downcasting with wedriver ref
		TakesScreenshot tks=(TakesScreenshot)driver;
		
		//stpe2:taks the ss and store the tmp
		File src=tks.getScreenshotAs(OutputType.FILE);
		
		//step3:create the empt floder
		File dest=new File("./screenshot/flipkart.png");
		
		//stpe4: store the ss from src to dest
		FileUtils.copyFile(src, dest);
		
		
		//close the broswer
		driver.quit();
		

	}

}

