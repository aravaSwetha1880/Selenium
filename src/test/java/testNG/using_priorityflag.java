package testNG;

import org.testng.annotations.Test;

public class using_priorityflag {
	@Test(priority = 2)
	public void login() {
		System.out.println("login");
		
	}
@Test(priority = 1)
public void register() {
	System.out.println("register");
	
}
@Test()
public void create() {
	System.out.println("create");
	
}
}
