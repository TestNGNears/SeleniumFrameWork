package Modules;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import Utilities.ReusableMethods;

public class UserRegistration {
	public void usrRegistration(WebDriver driver, XSSFSheet sheet)
	{
		ReusableMethods rm = new ReusableMethods();	
		rm.clickByLinkText(driver, "Register");	
		rm.sendKeyByID(driver,"customer.firstName", sheet.getRow(2).getCell(1).getStringCellValue());
		rm.sendKeyByID(driver,"customer.lastName", sheet.getRow(3).getCell(1).getStringCellValue());
		rm.sendKeyByID(driver,"customer.address.street", sheet.getRow(4).getCell(1).getStringCellValue());
		rm.sendKeyByID(driver,"customer.address.city", sheet.getRow(5).getCell(1).getStringCellValue());
		rm.sendKeyByID(driver,"customer.address.state", sheet.getRow(6).getCell(1).getStringCellValue());
		rm.sendKeyByID(driver,"customer.address.zipCode", sheet.getRow(7).getCell(1).getStringCellValue());
		rm.sendKeyByID(driver,"customer.phoneNumber", sheet.getRow(8).getCell(1).getStringCellValue());
		rm.sendKeyByID(driver,"customer.ssn", sheet.getRow(9).getCell(1).getStringCellValue());
		rm.sendKeyByID(driver,"customer.username", sheet.getRow(10).getCell(1).getStringCellValue());
		rm.sendKeyByID(driver,"customer.password", sheet.getRow(11).getCell(1).getStringCellValue());
		rm.sendKeyByID(driver,"repeatedPassword", sheet.getRow(12).getCell(1).getStringCellValue());
		rm.clickByClassName(driver, "button");
		
	}
}
