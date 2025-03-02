package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.login;
import pom.loginpage1;

public class loginTEst 
{

 WebDriver driver;
	
	
	@BeforeClass
	void setUp()
	{
		driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test
	void loginTest()
	{
		login lo=new login(driver);
	
		
		lo.setuserName("Admin");
		lo.setuserPass("Admin123");
		lo.clickLOginBtn();
	}
	
	@AfterClass
	void tearDown()
	{driver.quit();
		
	}
	
	
	
}
