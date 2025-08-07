package testNG;


	import java.awt.Window;
	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.Reporter;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class NavigateToFacebook {
		@Parameters("browser")
	@Test(groups = "reg")
	public void facebookTest(String Browser) throws InterruptedException {
		WebDriver driver= null;
		if(Browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(Browser.equals("edge")) {
			driver=new EdgeDriver();
			
		}
		else {
			driver = new ChromeDriver();
		}
		//WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		//Reporter.log("facebook");
		Reporter.log("facebook",true);
		driver.quit();
	}
	}


