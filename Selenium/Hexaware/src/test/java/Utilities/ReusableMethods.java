package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ReusableMethods {

	public void appLoad(WebDriver driver,String url)
	{
		driver.navigate().to(url);
	}

	public void sendKeyByID(WebDriver driver,String key, String value)
	{
		driver.findElement(By.id(key)).sendKeys(value);
	}

	public void sendKeyByXpath(WebDriver driver,String key, String value)
	{
		driver.findElement(By.xpath(key)).sendKeys(value);
	}
	
	public void clickByID(WebDriver driver,String key)
	{
		driver.findElement(By.id(key)).click();
	}

	public void clickByClassName(WebDriver driver,String key)
	{
		driver.findElement(By.className(key)).click();
	}
	public void clickByLinkText(WebDriver driver,String key)
	{
		driver.findElement(By.linkText(key)).click();
	}
	public void clickByXpath(WebDriver driver,String key)
	{
		driver.findElement(By.xpath(key)).click();
	}
	
	public void selectByValue(WebDriver driver,String key, String value)
	{
		Select s = new Select(driver.findElement(By.id(key)));
		s.selectByValue(value);
	}

	public void selectByVisibleText(WebDriver driver,String key, String value)
	{
		Select s = new Select(driver.findElement(By.id(key)));
		s.selectByVisibleText(value);
	}
	public String getTextByXpath(WebDriver driver,String key)
	{
		return driver.findElement(By.xpath(key)).getText();
	}

}
