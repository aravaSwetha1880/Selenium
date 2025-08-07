package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetchthedatafrom_excelfile {
    public static void main(String[] args) throws EncryptedDocumentException, IOException {
    	
    	//conveting physical file into java obj
    	FileInputStream fis=new FileInputStream("./src/test/resources/testdata.xlsx");
    	
    	//fetch the workbook
    	Workbook wb = WorkbookFactory.create(fis);
    	
    	//fetch the sheet
    	Sheet sh = wb.getSheet("Sheet1");
    	
    	//fetch the row
    	Row r = sh.getRow(1);
    	
    	//fetch the cell
        Cell c = r.getCell(0);
        
        
        Cell num = r.getCell(1);
    Cell num_c = r.getCell(1);
       
      // fetch the string data
       
      String data = c.getStringCellValue();
    // System.out.println(data);
      
      //fetch data in string formate irrespestive with tha data type stiored in excel
      double data1 =num_c.getNumericCellValue();
      String numdata = num_c.toString();
      
      System.out.println(data+""+numdata);
      
      //close the workbook
      wb.close();
      
    
	
}
	

}
