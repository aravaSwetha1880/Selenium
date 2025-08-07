package Assertions;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class using_HardAssertion {
@Test
public void hardAssert() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//navigate to an appln
	driver.get("https://www.facebook.com/");
	
	
	//fetch the title
	String acttitle = driver.getTitle();
	
	String exptitle="Facebook – log in  ";
	
	//validating the tittle
	//Assert.assertEquals(acttitle, exptitle);
	
	Assert.assertFalse(acttitle.contains(exptitle));
	// Assert.assertNull(exptitle);
	//System.out.println("fetch the title");
	Assert.fail();
	
	driver.quit();
	
	
	
	
}
}
