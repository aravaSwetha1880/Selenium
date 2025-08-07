package Relative_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class using_toleftofandtotorihgtof {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		WebElement act_list = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Thread.sleep(3000);

		driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(act_list)).click();
		
		driver.navigate().back();
		
		WebElement act_list1 = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Thread.sleep(3000);
		
		driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(act_list1)).click();
		Thread.sleep(3000);
		
		driver.quit();
	}
	

}
