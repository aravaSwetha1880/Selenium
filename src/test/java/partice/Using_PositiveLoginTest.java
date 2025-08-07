package partice;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_PositiveLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//imlicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to application
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		//identify un text field and enter text
		driver.findElement(By.name("username")).sendKeys("student");
		Thread.sleep(3000);
		
		//identify password text field and enter the text
		driver.findElement(By.id("password")).sendKeys("Password123");
		Thread.sleep(3000);
		
		//identify submit button and click
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		
		
		//fetch the current url
		String url = driver.getCurrentUrl();
				if (url.contains("https://practicetestautomation.com/logged-in-successfully/")) 
				{
					System.out.println("url is verified");
    	   
	} else
     System.out.println("url is not verified");
	
       // verify the text presentbor not
       String text1= driver.findElement(By.tagName("strong")).getText();
       
       if (text1.contains(text1)) {
    	   System.out.println(" text present in the wedpage");
		
	}else
		System.out.println("text not present in the wedpage");
		
	
		// verify the logout button
       
       WebElement btn = driver.findElement(By.linkText("Log out"));
       if (btn.isDisplayed()) {
    	   System.out.println("btn is dispalyed");
		
	}
       else {
    	   System.out.println("btn is not dispalyed");
       }
    	  driver.quit(); 
	}

		
	}


