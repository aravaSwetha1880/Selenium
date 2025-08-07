package select_class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosugg_indemowedshop {

	public static void main(String[] args) throws InterruptedException {
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		// maximize the window
		driver.manage().window().maximize();
		
		// impicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//naviagte to an appln
		driver.get("https://demowebshop.tricentis.com/login");
		
		// indentify the serach tf
		driver.findElement(By.name("q")).sendKeys("comp");
		Thread.sleep(3000);
		
		List<WebElement> list = driver.findElements(By.xpath("//a[contains(text(),'comp')]"));
		 Thread.sleep(3000);
		
for (WebElement ele : list) {
	System.out.println(ele.getText());
	
}
driver.quit();
	}

}
