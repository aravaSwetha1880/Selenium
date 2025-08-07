package PomUtilizer;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.demowebshop;

public class using_demowedSshop {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		demowebshop demo = new demowebshop(driver);
		FileInputStream fis = new FileInputStream("./src/main/resources/data.properties");
		Properties p = new Properties();
		p.load(fis);
		String name = p.getProperty("name");
		String email = p.getProperty("email");
		String pass = p.getProperty("password");

		// maximize the window
		driver.manage().window().maximize();

		// impicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// naviaget to an apln
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	
	demowebshop demo1=new demowebshop(driver);
	demo1.demewedshop(name, email, pass);
	Thread.sleep(3000);
	driver.quit();
		

	}

}
