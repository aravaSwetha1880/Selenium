package X_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class using_xpathkeywords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@name=\"email\"and@id=\"email\"]")).sendKeys("swetha");
		driver.findElement(By.xpath("//input[@placeholder='Password' or @id=\"pas\"]")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[@type='submit' or @ text()='Log in' ]")).click();
		driver.quit();

	}

}
