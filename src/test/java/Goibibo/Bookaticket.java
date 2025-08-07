package Goibibo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Bookaticket {

	public static void main(String[] args) throws InterruptedException {
		// launch the broswer
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("--disable-geolocation");
		WebDriver driver=new ChromeDriver(opt);
		
		//maximize the window
	driver.manage().window().maximize();
	
	  //impicit  wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//naviagete to an appln
	driver.get("https://www.goibibo.com/");
	
	//handling the poups
	driver.findElement(By.xpath("//span[@class='sc-koXPp bDtzaf']")).click();
	
	
	//select the one way
	driver.findElement(By.xpath("//li[@class='sc-12foipm-69 ivuLpM']")).click();
	Thread.sleep(3000);
	
	// Enter From & To
	driver.findElement(By.xpath("//span[text()='From']")).click();
	Thread.sleep(3000);
	WebElement from = driver.findElement(By.xpath("//input[@type='text']"));
	from.sendKeys(" Delhi (DEL) ");
	driver.findElement(By.xpath("//p[@class='sc-12foipm-34 cNjjrh']")).click();
	

	Thread.sleep(3000);

	
	driver.findElement(By.xpath("//span[text()='To']")).click();
	WebElement to = driver.findElement(By.xpath("//input[@type='text']"));
	to.sendKeys("Hyderabad (HYD) ");
	driver.findElement(By.xpath("//p[@class='sc-12foipm-34 cNjjrh']"));

	
	// 4. Select Departure Date (7 days from today)
	LocalDate futureDate = LocalDate.now().plusDays(7);
	String depDate = futureDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	driver.findElement(By.id("departureCalendar")).click();
	driver.findElement(By.xpath("//div[@data-date='" + depDate + "']")).click();

	// 5. Select Passengers
	driver.findElement(By.id("pax_link_common")).click();
	driver.findElement(By.id("adultPaxPlus")).click(); // Repeat for 2 adults
	driver.findElement(By.id("childPaxPlus")).click(); // 1 child
	driver.findElement(By.id("pax_close")).click();

	// 6. Click Search
	driver.findElement(By.id("gi_search_btn")).click();

	// 7. Wait for results
	new WebDriverWait(driver, Duration.ofSeconds(20))
	     .until(ExpectedConditions.visibilityOfElementLocated(By.className("flt_fare")));


	// 8. Apply Time Filter (6 AM - 12 PM)
	driver.findElement(By.xpath("//label[contains(text(),'6AM - 12PM')]")).click();

	// 9. Apply Airline Filters
	driver.findElement(By.xpath("//label[contains(text(),'IndiGo')]")).click();
	driver.findElement(By.xpath("//label[contains(text(),'Air India')]")).click();

	// 10. Validate Results
	List<WebElement> airlines = driver.findElements(By.className("airlineName"));
	for (WebElement airline : airlines) {
	    String name = airline.getText();
	    assert(name.contains("IndiGo") || name.contains("Air India"));
	}

	
	
	//close the window
	driver.quit();
		
		

	}

}
