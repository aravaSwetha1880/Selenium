package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class using_partialLinktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// launch the browseer
		WebDriver driver=new ChromeDriver();
		// maximize the window
	driver.manage().window().maximize();
	// navigate the windows
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.partialLinkText("?")).click();
	driver.quit();
		
	
		
		

	}

}
