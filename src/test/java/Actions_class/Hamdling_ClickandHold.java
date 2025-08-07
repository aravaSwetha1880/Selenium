package Actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hamdling_ClickandHold {

	public static void main(String[] args) throws InterruptedException {
		// launch the broswer
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// impilicyt wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// naviagete to an appln
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");

		WebElement circle = driver.findElement(By.id("circle"));

		Actions act = new Actions(driver);

		act.clickAndHold(circle).perform();
		Thread.sleep(3000);

		act.release(circle).perform();
		Thread.sleep(2000);

		driver.quit();
	}

}
