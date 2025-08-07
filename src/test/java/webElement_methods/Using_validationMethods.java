package webElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_validationMethods {
		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException {
			// launch the  broswer
			WebDriver driver=new ChromeDriver();
			
			// maximize the window
			driver.manage().window().maximize();
			
			// naviagete to an appln
			driver.get("https://demowebshop.tricentis.com/");
			
			// fetch the text feild
			WebElement dispalyed = driver.findElement(By.id("newsletter-email"));
			//System.out.println(dispalyed.isDisplayed());
			if (dispalyed.isDisplayed()) {
			
				System.out.println("element is dispalyed");
				
			} else {
				
				System.out.println("element is not dispalyed");

			}
			// fetch the button
			WebElement sub = driver.findElement(By.id("newsletter-subscribe-button"));
			System.out.println(sub.isEnabled());
			Thread.sleep(3000);
			sub.click();
			Thread.sleep(3000);
			if (sub.isDisplayed()) {
				sub.click();
				System.out.println("element is dispalyed"+sub.isDisplayed());
			
				
			} else {
				System.out.println("element is not dispalyed");

			}
			
			WebElement radio = driver.findElement(By.id("pollanswers-2"));
			//System.out.println(radio.isDisplayed());
			radio.click();
			if (radio.isSelected()) {
				//radio.click();
				System.out.println(" radio btn is selected");
				
			} else {
				System.out.println("radio btn is not selected");

			}
			driver.quit();

	}

}
