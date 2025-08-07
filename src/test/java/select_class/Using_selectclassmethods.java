package select_class;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Using_selectclassmethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
// launch the browser
		WebDriver driver=new EdgeDriver();
		// maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// navigayte to an appln
		driver.get("https://www.amazon.in/");
		
		// identify the dropdown
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		
       Select select = new Select(dropdown);
       // select the option-index
        select.selectByIndex(6);
        Thread.sleep(3000);
        // select the option-value
        select.selectByValue("search-alias=baby");
        Thread.sleep(3000);
        //select the value=visible text
        select.selectByVisibleText("Kindle Store");
        //fetch all the option
       List<WebElement> list = select.getOptions();
       for (WebElement ele : list) {
    	   System.out.println(ele.getText());
       }
    	   
     // check the dd whether iy is sindleor multi select 
             if(select.isMultiple()){
            	 System.out.println("multi select dd");
             }
             else {
            	 System.out.println("single select dd");
            	 
            	 
             }
             // fetch the first selected option
             String text = select.getFirstSelectedOption().getTagName();
             System.out.println("firstselected option:"+text);
             
             // fetch the all selected option
             List<WebElement> list1 = select.getAllSelectedOptions();
            for (WebElement ele: list1) {
            	System.out.println("selected options:"+ele.getText());
				
			}
            driver.quit();
	}
	
	
	
}
			
             

		
		
	


