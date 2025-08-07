package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class fetchingdatafrom_propertyfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         //convert physical file into java obj
		FileInputStream fis=new FileInputStream("./data.properties");
		
		//create an obj of property file
		Properties p = new Properties();
		
		//load the property file
		p.load(fis);
		
		
		//fetch the data from the  property file
		String data = p.getProperty("browser");
		System.out.println(data);
		
		String data1 = p.getProperty("usname");
		System.out.println(data1);
		
		String data2 = p.getProperty("pswd");
		System.out.println(data2);
		
		String data3 = p.getProperty("timeout");
		System.out.println(data3);
		
		
		
	}

}
