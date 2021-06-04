package Modules;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import Utilities.ReadData;
import Utilities.ReusableMethods;
import Utilities.WriteData;

public class AccountVerfication extends ReadData {

	public void verifyAccount(WebDriver driver) throws IOException
	{
		ReusableMethods rm = new ReusableMethods();	
		WriteData wd = new WriteData();
		String AccValidation = rm.getTextByXpath(driver,"//p[contains(text(),'Congratulations, your account is now open.')]");
		
		if(AccValidation.equals("Congratulations, your account is now open."))
		{
			wd.writeData(AccValidation,"PASSED");
		}
		else
		{
			wd.writeData("Validation not matched", "FAILED");
		}
		
	}

}
