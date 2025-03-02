package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.AccountRegrestrationForm;
import pageObjects.HomePage;

public class Tc01_accountRegrestratintest extends BasaClass
{
	@Test(dataProvider = "userData")
	void  verify_accountRegrestration(String name,String lname,String place,String nato,
			String pass,String conPass) 
	{
		
		logger.info("***********---Starting test case----*********");
//		HomePage ho=new HomePage(driver);
//		ho.clickMyaccount();
//		logger.info("Click on myaccount link");
//		ho.clickRegister();
//		logger.info("Click on registe  link");
		
		AccountRegrestrationForm A1=new AccountRegrestrationForm(driver);
		logger.info("Providing client detils");
		A1.enterFirstname(name);
		logger.info("Enter user name");
		A1.enterlastname(lname);
		logger.info("Enter user lastname");
		A1.enterPlace(place);
		logger.info("Enter user place");
		A1.enterNation(nato);
		logger.info("Enter user nation");
		A1.enterPass(pass);
		logger.info("Enter user pass"+pass);
		A1.enterCom_Pass(conPass);
		logger.info("Enter user conpass"+conPass);
		A1.clickSubmit();
		
		String Actconf = A1.getCOnfirmationmsg();
		Assert.assertEquals(Actconf, "Registration successful!");
		logger.info("validating  client validation");
		
		
			//logger.error("Test failed");
			logger.debug("Debug log");
			//Assert.fail();
	
		
	}
	
	  @DataProvider(name = "userData")
	    public Object[][] provideUserData() {
	        return new Object[][] {
	            {"Abhilash", "Tembhurne", "Pune", "India", "India@2030", "India@2030"},
	            {"John", "Doe", "Mumbai", "UK", "Password123", "Password123"},
	            {"Jane", "Smith", "Delhi", "DUbai", "SecurePass2025", "SecurePass2025"}
	        };
	    }
	
	
	
}
