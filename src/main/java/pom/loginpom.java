package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpom{
	//delecre
	
	@FindBy(xpath = "//h2")
	private WebElement header;
	
	@FindBy(id="email")
    private WebElement UnTf;
	
	@FindBy(id="pass")
	private WebElement PsTf;
	
	@FindBy(name="login")
	private WebElement loginbtn;

	
	
	
	//initialize
   public loginpom(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
   //utilizer

public  WebElement WebDriver() {
	return header;
}

public void getUnTf( String user) {
	UnTf.sendKeys(user);

}

public WebElement getPsTf() {
	return PsTf;
}
public WebElement getLoginbtn() {
	return loginbtn;
}
//business logic

public  void login(String User, String password) {
	 UnTf.sendKeys("user");
	 PsTf.sendKeys("password");
	 loginbtn.click();
	
}
	
	
	
}
   
