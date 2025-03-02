package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.beust.jcommander.Parameters;

public class prameterpratices 
{
	WebDriver driver;
	@BeforeClass
@org.testng.annotations.Parameters({"browser"})
	void setup(String br) throws InterruptedException
	{
		switch(br)
		{
		case "chrome":driver=new ChromeDriver();break;
		case "edge":driver=new EdgeDriver();break;
		default:System.out.println("incorrect broswser");return;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
		
	}
	
	@Test(dataProvider ="dp")
	void login(String email,String pass)
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
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
	
	@DataProvider(name="logindata")
	Object[][] logindata()
	{
		Object data[][]= {{"Admin","admin123"},
				{"Admin2","admin123"},
				{"Admin3","admin1234"}};
		return data;
			
				
		}
	}

	

