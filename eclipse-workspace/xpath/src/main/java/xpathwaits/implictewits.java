package xpathwaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implictewits 
{
public static void main(String[] args) 
{
	WebDriver driver =new ChromeDriver();
	//
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	
	
	
	WebElement un = driver.findElement(By.name("username"));
	WebElement pass = driver.findElement(By.name("password"));
	WebElement btn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	un.sendKeys("Admin");
	pass.sendKeys("admin123");
	btn.click();
}
}
