package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class paramaterization<object> 
{
	private static final String testdata1 = null;
	//data provider-data driver taesting
	//useing xml file  parameters-praller testing
	
	WebDriver driver;
	@BeforeMethod
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test(dataProvider = "dp")
	void testlogin(String email,String pass)
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String act = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		String exp="Dashboard";
		Assert.assertEquals(act,exp);
	}
	@AfterClass
	void teardown()
	{
		driver.close();
		
	}
	
	@DataProvider(name="dp")
	Object[][] loginData()
	{
	  Object data[][]= {{"Admin","admin123"},
				      {"abhilash2@gmai.com","test2343"},
				      {"abhilash3@gmai.com","test2343"},
				      {"abhilash4@gmai.com","test2343"},};
		
		return data;
	}
}
