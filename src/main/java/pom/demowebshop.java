package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demowebshop {
//declere the elements
	@FindBy(id="name")
	private WebElement name;
	
@FindBy(id="email")
private  WebElement email;


@FindBy(id="password")
private WebElement Password;

@FindBy(xpath = "//button[text()='Register']")
private WebElement reg;

//intialize
public demowebshop(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
	
}

//intailzation
public void getName( String user) {
	name.sendKeys(user);
}

public WebElement getEmail( ) {
return email;
}

public WebElement getPassword() {
	return Password;
}
public WebElement getReg() {
	return reg;

}


//utilize

public void demewedshop( String user,String emailid,String Passwordid) {
name.sendKeys(user);
email.sendKeys(emailid);
Password.sendKeys(Passwordid);
reg.click();





}
}





		
	



	





	


