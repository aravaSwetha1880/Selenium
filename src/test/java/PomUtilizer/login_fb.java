package PomUtilizer;




import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.loginpom;


public class login_fb {

	public static void main(String[] args) throws InterruptedException {
		// launch the brower
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//impicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//naviagte to an appln
		driver.get("https://www.facebook.com/");
		
		//WebElement un = driver.findElement(By.id("email"));  .getUnTf().sendKeys("selenium");
		//un.sendKeys("selenium");
		//Thread.sleep(3000);
		//driver.navigate().refresh();
	   //WebElement un = driver.findElement(By.id("email"));
	   //un.sendKeys("hii");
		loginpom login=new loginpom(driver);
		
		
		//fb.getUnTf().sendKeys("selenium");
	
		
		
		//driver.navigate().refresh();
		
		//fb.getUnTf().sendKeys("hii");
		//fb.getPsTf().sendKeys("selenium");
		//fb.getLoginbtn().click();
		//Thread.sleep(3000);
	login.login("selenium", "abc123");
		
		driver.quit();
		
	}

}
