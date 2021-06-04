package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public void writeData(String AccValidation,String Status) throws IOException
	{
		FileInputStream fis = new FileInputStream(new File(System.getProperty("user.dir")+"/src/test/resources/TestData/OutPut.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fis); 
		XSSFSheet outputSheet = workbook.getSheet("Sheet1");
		Row row = outputSheet.createRow(1);
		Cell cell = row.createCell(0);
		cell.setCellValue(AccValidation);		
		Cell CellStatus = row.createCell(1);
		CellStatus.setCellValue(Status);		
		FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+"/src/test/resources/TestData/OutPut.xlsx");
		workbook.write(fos);
		fos.close();
	}
}
