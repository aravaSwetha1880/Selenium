package select_class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class using_multiselectedDD {

	public static void main(String[] args) throws InterruptedException {
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		
		
		// maximize the window
		driver.manage().window().maximize();
		
		// impicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// naviagte to an appln
		driver.get("https://demoqa.com/select-menu");
		
		// idemtify the dd
		WebElement multidd = driver.findElement(By.id("cars"));
	Select	s=new Select(multidd);
	
	//chech the dd whether it is single or multi select dd
	System.out.println("multi seleted DD:"+s.isMultiple());
	
	//seleting multiole elements
	 s.selectByIndex(0);
	   Thread.sleep(3000);
	 s.selectByValue("saab");
	   Thread.sleep(3000);
	 s.selectByVisibleText("Audi");
	   Thread.sleep(3000);
	 // fetch the all options
	List<WebElement> options = s.getAllSelectedOptions();
	for (WebElement ele : options) {
		System.out.println("all the options:"+ele.getText());
		
	}
	// fetch the first seleted option
        String text = s.getFirstSelectedOption().getText();
        System.out.println("first seleted option:"+text);
        
        //fetch the all seleted option
        List<WebElement> selectdrop = s.getAllSelectedOptions();
        for (WebElement ele : selectdrop) {
        	
        	System.out.println("seleted options:"+ele.getText());
        	   Thread.sleep(3000);
			
		}
        // deseleted the options
        s.deselectByIndex(0);
        Thread.sleep(3000);
        s.deselectByValue("saab");
        Thread.sleep(3000);
        s.deselectByVisibleText("Audi");
        Thread.sleep(3000);
	
	 driver.quit();

	}


}
