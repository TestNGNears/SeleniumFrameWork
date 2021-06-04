package Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import TestCase.AppTest;
import Utilities.ReusableMethods;

public class OpenAccount extends AppTest{
	public void accountOpen(WebDriver driver) throws InterruptedException
	{
		ReusableMethods rm = new ReusableMethods();	
		driver.findElement(By.xpath("//a[contains(text(),'Open New Account')]")).click();		
		rm.selectByVisibleText(driver, "type","SAVINGS");
		Thread.sleep(3000);
		rm.clickByXpath(driver, "//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='rightPanel']/div[1]/div[1]/form[1]/div[1]/input[1]");
	}

}
