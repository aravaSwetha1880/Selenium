package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteBackToPropertyFile {

	public static void main(String[] args) throws IOException {
		// converted physical file to java obj
		FileInputStream fis=new FileInputStream("./data.properties");

		//craeate an obj of property file
		Properties p=new Properties();
		
		//load the prop onj
		 p.load(fis);
		 
		 //write data to prop obj
		 p.put("subject", "selenium");
		 
		  FileOutputStream fos=new FileOutputStream("./data.properties");
		  p.store(fos, "updated subject");
		 
	}

}
