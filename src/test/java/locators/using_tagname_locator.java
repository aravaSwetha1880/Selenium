package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class using_tagname_locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		// maximize the window
		driver.manage().window().maximize();
		// navigate to an appl
		driver.get("https://demowebshop.tricentis.com/");
		
		// identify the all links
		List<WebElement> link = driver.findElements(By.tagName("a"));
		for (WebElement ele: link) {
			System.out.println(ele.getText());
			
		}
		driver.quit();
		}
}
