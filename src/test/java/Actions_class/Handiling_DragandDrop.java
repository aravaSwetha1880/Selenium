package Actions_class;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handiling_DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		// maximize the window
		driver.manage().window().maximize();
		
		// impilicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// naviaget to an appln
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		// drag and drop elements
		WebElement drag1 = driver.findElement(By.id("fourth"));
		WebElement drop1 = driver.findElement(By.id("amt7"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(drag1, drop1).perform();
		
		
		WebElement drag2 = driver.findElement(By.id("credit2"));
		WebElement drop2 = driver.findElement(By.id("bank"));
		act.dragAndDrop(drag2, drop2).perform();
		
		
		
		WebElement drag3 = driver.findElement(By.id("credit1"));
		WebElement drop3 = driver.findElement(By.id("loan"));
		act.dragAndDrop(drag3, drop3).perform();
		
		
		
		WebElement drag4 = driver.findElement(By.id("fourth"));
		WebElement drop4 = driver.findElement(By.id("amt8"));
		act.dragAndDrop(drag4, drop4).perform();
		
		Thread.sleep(3000);
		
		WebElement res = driver.findElement(By.id("equal"));
	if (res.isDisplayed()) {
		System.out.println(res.getText());
		
		
	}else
		System.out.println("perfect is not dispalyed");

		driver.quit();	

	}
}

	




