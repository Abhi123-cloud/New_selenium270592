package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicxpath 
{

	public static void main(String[] args) 
	{

		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement un = driver.findElement(By.name("username"));
		WebElement pass = driver.findElement(By.name("password"));
		WebElement btn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		un.sendKeys("Admin");
		pass.sendKeys("Admin123");
		btn.click();
		 
//		driver.findElement(By.xpath("//input[@placeholder='username']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin123");
//		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		//tagname[@att='Value' or @att='Value']
		//tagname[Contains[@id,'St']
		//tagname[STart-with[@id,'St']
		
	}
}
