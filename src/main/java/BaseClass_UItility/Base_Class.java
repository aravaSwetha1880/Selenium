package BaseClass_UItility;


import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base_Class {
	@BeforeSuite
	public void bs() {
		Reporter.log("Bs-connteing to the dadtabase",true);
		
		
	}
	@AfterSuite
	public void as() {
		Reporter.log("As-Disconnteing to the dadtabase",true);
		
	}
	@BeforeTest
	public void bt() {
		Reporter.log("Bt-configure the parallel execution",true);
		
	}
	@BeforeClass
	public void bc() {
		Reporter.log("Bc-launch the broswer",true);
		
	}
	@AfterMethod
	public void am() {
		Reporter.log("AM-logout the broswer",true);
	}
	@AfterTest
	public void At() {
		Reporter.log("At-close the parallexecution",true);
		
	}
	@BeforeMethod
	public void Bm() {
		Reporter.log("Bm-login ti the broswer",true);
		
	}
	@AfterClass
	public void ac() {
		Reporter.log("Ac-quit the broswer",true);
		
	}

}
