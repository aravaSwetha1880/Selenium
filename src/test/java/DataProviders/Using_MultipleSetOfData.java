package DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Using_MultipleSetOfData {
	@Test(dataProvider = "data")
	public void LogintestScript(String un,String pswd) {
		System.out.println(un+" "+pswd);
		
	}
	@DataProvider
 public Object[][] data() {
		Object [] [] obj=new Object[3] [2];
		
		obj[0][0]="user1";
		obj[0][1]="pasword1";
		
		obj[1][0]="user2";
		obj[1][1]="pasword2";
		
		obj[2][0]="user3";
		obj[2][1]="pasword3";
		return obj;
		
		
	}
}
