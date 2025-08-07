package Handling_popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Authenticationpopups {

	public static void main(String[] args) throws InterruptedException {
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		
		//maximize the window
		driver.manage().window().maximize();
		
		//impicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//naviagete to an appln
		driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		Thread.sleep(3000);
		
		
		//close the window
		driver.quit();
	}

}
