package webElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class using_gettersMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		// maximize the window
		driver.manage().window().maximize();
		
		// navigate to an appln
		driver.get("https://demowebshop.tricentis.com/");
		
		// identify the search Tf
		 WebElement cart = driver.findElement(By.linkText("Shopping cart"));
		 // get visible text
		System.out.println("visible text:" +cart.getText());
	   // fetch the attribute name

		System.out.println("atttributename:" +cart.getAttribute("class"));
		
		// fetch the tagname
		System.out.println("tagname"+cart.getTagName());
		
		// fetch the size
	   Dimension dim = cart.getSize();
		System.out.println("size"+cart.getSize());
		System.out.println("Dimension:"+dim.getHeight());
		System.out.println("Dimention:"+dim.getWidth());
		
		// fetch the location
		Point loc = cart.getLocation();
		System.out.println("location:"+loc);
		System.out.println("location:"+loc.x);
		System.out.println("location:"+loc.y);
		
		
		// fetch size and location
		Rectangle rect = cart.getRect();
		System.out.println("rect:"+rect.getDimension());
		System.out.println("rectlocation:"+rect.getPoint());
		
		// fectch the css value
		System.out.println("cssvalue:"+cart.getCssValue("color"));
		driver.quit();
		
	}
}

