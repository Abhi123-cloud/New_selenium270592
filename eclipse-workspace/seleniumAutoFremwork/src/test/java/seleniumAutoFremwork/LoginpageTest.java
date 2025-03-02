package seleniumAutoFremwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import constancts.fremworkConstants;

public class LoginpageTest 
{
	
		
	@Test
	
	public void test()
	
	{
		System.setProperty("webdriver.chrome.driver",fremworkConstants.getChromeDriver()); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	}
	}
