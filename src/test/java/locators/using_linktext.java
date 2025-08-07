package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class using_linktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// launch the browser
		WebDriver driver=new ChromeDriver();
		
		// maximize the window
		driver.manage().window().maximize();
		
		// naviagte to on apln
		driver.get("https://www.facebook.com/");
		
		// identify the forgot pswd link
		driver.findElement(By.linkText("Forgotten password?")).click();
		
driver.quit();
	}


}
