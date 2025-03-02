package xpathwaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicateWait 
{
public static void main(String[] args) 
{
	WebDriver driver =new ChromeDriver();
	//declaration
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	
	//use
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	
	
	WebElement un = wait.until(ExpectedConditions.visibilityOf((WebElement) By.name("username")));
	//WebElement un = driver.findElement(By.name("username"));
	WebElement pass = driver.findElement(By.name("password"));
	WebElement btn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	un.sendKeys("Admin");
	pass.sendKeys("admin123");
	btn.click();
}
}
