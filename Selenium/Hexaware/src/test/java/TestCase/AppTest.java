package TestCase;

import org.testng.annotations.Test;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import Modules.AccountVerfication;
import Modules.Login;
import Modules.OpenAccount;
import Modules.UserRegistration;
import Utilities.DriverInitialize;
import Utilities.ReadData;

public class AppTest {

	private WebDriver driver;
	XSSFSheet sheet;

	/*Method Name : Before Test
	 *Description : To initialize the Browser and Read the data 
	 */	
	@BeforeTest
	public void beforeTest() throws IOException
	{
		DriverInitialize dvr = new DriverInitialize();
		ReadData ReadData = new ReadData();
		driver = dvr.driver();
		sheet = ReadData.readData();
	}


	/*Method Name : userRegister
	 *Description : Validate the User Registration, User Login, 
	 *              Address Validation, Verify Account modules
	 */		
	@Test(priority=0)
	public void userRegister() throws IOException 
	{
		//Verify the user Registration 
		UserRegistration usr = new UserRegistration();
		usr.usrRegistration(driver, sheet);
	}
	@Test(priority=1)
	public void userLogin()
	{
		//Verify the Login module
		Login product = new Login();
		product.LoginValidation(driver, sheet);
	}
	@Test(priority=2)
	public void openAccount() throws InterruptedException
	{
		//Verify the address validation
		OpenAccount open = new OpenAccount();
		open.accountOpen(driver);
	}
	@Test(priority=3)
	public void verifyAccount() throws IOException
	{
		//Verify Account
		AccountVerfication acc = new AccountVerfication();
		acc.verifyAccount(driver);
	}

	/*Method Name : After Test
	 *Description : To close the Browser when validation are completed 
	 */	
	@AfterTest
	public void afterTest()
	{
		driver.close();
	}

}
