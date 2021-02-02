package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class excel {
	XSSFCell cell;
	XSSFSheet sheet;
	WebDriver driver;
	XSSFWorkbook xs;
	FileInputStream fis;
	public excel() throws IOException 
	{	
	try {
		fis = new FileInputStream("D:\\Selenium\\Book2.xlsx");
		 xs= new XSSFWorkbook(fis);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	}
	public  String input(int sheetnum,int rownum, int column) {	
	 sheet = xs.getSheetAt(sheetnum);
		
		 DataFormatter formatter = new DataFormatter(); //creating formatter using the default locale
		 Cell data = sheet.getRow(rownum).getCell(column);
		 String dataret = formatter.formatCellValue(data);
		return dataret;
	} 
}
