package mouce_action;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouce_hoveraction 
{
	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		//declaration
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[@class='nav-item dropdown' and .//a[text()='Desktops']]"));
		WebElement iphone = driver.findElement(By.xpath("//img[@title='iPhone']"));
		Actions act=new Actions(driver);
		act.moveToElement(iphone).build().perform();
		
	
	}

}
