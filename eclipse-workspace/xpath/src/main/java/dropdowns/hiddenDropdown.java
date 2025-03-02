package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hiddenDropdown 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver =new ChromeDriver();
	//declaration
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	driver.manage().window().maximize();
	
	
	WebElement un = driver.findElement(By.xpath("//input[@name='username']"));
	WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
	WebElement btn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	un.sendKeys("Admin");
	pass.sendKeys("admin123");
	btn.click();
}
	
}

