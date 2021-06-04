package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverInitialize {

	public WebDriver driver()
	{
		WebDriver driver = null;
		String DriverSelection = "Chrome";
		if(DriverSelection=="Chrome")
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/Driver/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(DriverSelection=="FireFox")
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/src/test/resources/Driver/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(DriverSelection=="IE")
		{
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"/src/test/resources/Driver/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		ReusableMethods rm = new ReusableMethods();	
		rm.appLoad(driver,"https://parabank.parasoft.com/parabank/index.htm");
		return driver;
	}

}
