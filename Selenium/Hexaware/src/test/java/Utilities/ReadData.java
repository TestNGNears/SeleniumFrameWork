package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public XSSFSheet readData() throws IOException
	{
		FileInputStream fis = new FileInputStream(new File(System.getProperty("user.dir")+"/src/test/resources/TestData/Input.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fis); 
		XSSFSheet sheet = workbook.getSheet("Sheet1");	
		return sheet;
	}
}
