package Modules;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import Utilities.ReusableMethods;

public class Login {

	public void LoginValidation(WebDriver driver, XSSFSheet sheet)
	{
		ReusableMethods rm = new ReusableMethods();	
		rm.sendKeyByXpath(driver,"//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[1]/input[1]",sheet.getRow(10).getCell(1).getStringCellValue());
		rm.sendKeyByXpath(driver,"//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[2]/input[1]",sheet.getRow(11).getCell(1).getStringCellValue());
		rm.clickByXpath(driver,"//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]");
	}


}
