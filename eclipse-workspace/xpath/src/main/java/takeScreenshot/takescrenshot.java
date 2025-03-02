package takeScreenshot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;

public class takescrenshot 
{
	public static void main(String[] args)
	{
		
		//WebDriver driver =new ChromeDriver();
		//declaration
	
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		WebDriver driver =new ChromeDriver(opt);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//us
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
	
		//Full page screen shot
	
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Users\\abhit\\eclipse-workspace\\xpath\\screenshot\\scr.png");
		//System.getProperty("user.dir")+
		
		sourcefile.renameTo(target);//Copy for source to target
		//driver.quit();
		
		
		
		
		
	}
	
	
	
	
	

}
