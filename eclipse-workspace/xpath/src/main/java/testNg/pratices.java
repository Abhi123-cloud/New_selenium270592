package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class pratices
{
	WebDriver driver;
	@Parameters({"browser"})
	void setup(String br)
	{
		
		switch(br)
		{
		case "chrome": driver=new ChromeDriver();break;
		case "edge": driver=new EdgeDriver();break;
		case "firefox": driver=new FirefoxDriver();break;
		default:System.out.println("incorrect broswser");return;
		
		}
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
@Test(priority=1)
void testlog()
{
	boolean status = driver.findElement(By.xpath("")).isDisplayed();
	AssertJUnit.assertEquals(status, true);
}
@Test(priority=2)
void testTitle()
{
	AssertJUnit.assertEquals(driver.getTitle(), "OrangeHRM");
	
}
@Test(priority=3)
void testurl()
{AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
}
@AfterClass
void teardown()
{
	driver.close();
}
	
	
}
