package Handling_popups;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_fileUploadUsingRobotcls {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// launch the broswer
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 // copy the path and store the clikboard
		 StringSelection s=new StringSelection("C:\\Users\\swetha_arava\\OneDrive\\Apps\\Desktop\\swetha_resume2.pdf.docx");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		 Thread.sleep(3000);
		 
		 //naviagte to an appln
		 driver.get("https://the-internet.herokuapp.com/upload");
		 
		 //identify the fileupload  
		WebElement upload = driver.findElement(By.id("file-upload"));
		 
		 //by using action cls we can perform the click action
		 Actions act=new Actions(driver);
		 act.click(upload).perform();
		 
		 //by using robot cls we perorme past
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_V);
		 Thread.sleep(3000);
		 
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_V);
		 Thread.sleep(3000);
		 
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
		 Thread.sleep(3000);
		 driver.quit();
		 

	}

}
