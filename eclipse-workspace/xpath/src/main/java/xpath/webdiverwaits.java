package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdiverwaits 
{
	public static void main(String[] args) throws InterruptedException 
	{
	//Emaple of wait thered .sleep commadn
		//Common exception link No such element exception -Syncrozation problem
		//And element not found exception get-When locator is incorrect
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(10000);//will paus eexection for smometime
		
		WebElement un = driver.findElement(By.name("username"));
		WebElement pass = driver.findElement(By.name("password"));
		WebElement btn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		un.sendKeys("Admin");
		pass.sendKeys("admin123");
}

}
