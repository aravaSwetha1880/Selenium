package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Writebackto_datatoExcelfile {

	public static void main(String[] args, Date selenium) throws EncryptedDocumentException, IOException {
		// physical file  into java obj

		FileInputStream fis=new FileInputStream("‪C:\\Users\\swetha_arava\\OneDrive\\Apps\\Desktop\\testdata");

		//fetch the workbook
		Workbook wb = WorkbookFactory.create(fis);
		
		//fetch the sheet
		Sheet sh = wb.getSheet("Sheet1");
		
		//fetch the row
		Row r = sh.getRow(1);
		
		//create the row
		r=sh.createRow(7);
		
	
		
		//create a cell
		Cell c = r.createCell(4);
		

		// write the data
		c.setCellValue(selenium);

		//converting obj to physical and saving the file
		FileOutputStream fos=new FileOutputStream("C:\\Users\\swetha_arava\\OneDrive\\Apps\\Desktop\\testdata");
		
		wb.write(fos);
	}
	

	

}
