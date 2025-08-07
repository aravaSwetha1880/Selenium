package Relative_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class using_near {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// launch the broswer
		WebDriver driver=new EdgeDriver();
		
		// maximize the window
		driver.manage().window().maximize();
		
		
		// navigate to appln
		driver.get("https://www.amazon.in/");

		//identify the mxpalyer
		WebElement mobiles = driver.findElement(By.xpath("(//a[@class='nav-a  '])[6]"));
		mobiles.click();
		driver.navigate().back();
		WebElement mobiles1= driver.findElement(By.xpath("(//a[@class='nav-a  '])[6]"));

		driver.findElement(RelativeLocator.with(By.tagName("a")).near(mobiles1)).click();
		driver.quit();
		
		
		

	}

}
