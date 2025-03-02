package xpath;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver =new ChromeDriver();
	//driver.get("https://www.google.com/");
	//driver.manage().window().maximize();
	
	//Xpth with multipla attribute
//	  WebElement txtbox = driver.findElement(By.xpath("//textarea[@class='gLFyf'][@title='Search']"));
//	txtbox.sendKeys("Abhialsh");
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(10000);
	WebElement un = driver.findElement(By.name("username"));
	WebElement pass = driver.findElement(By.name("password"));
	WebElement btn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	un.sendKeys("Admin");
	pass.sendKeys("admin123");
	btn.click();
	}
	
	

}
