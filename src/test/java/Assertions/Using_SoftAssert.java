package Assertions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Using_SoftAssert {
 @Test
 public void softassert() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//navigate to an appln
		driver.get("https://www.facebook.com/");
		
		String acttitle = driver.getTitle();
		
		String exptitle="Facebook – log in or sign up";
		
		//validate title using soft assert
		SoftAssert soft=new SoftAssert();
		//soft.assertEquals(acttitle, exptitle);
		soft.assertNotEquals(acttitle, exptitle);
		
		System.out.println("verified title");
		driver.quit();
		//soft.assertAll();
	 
 }
}
