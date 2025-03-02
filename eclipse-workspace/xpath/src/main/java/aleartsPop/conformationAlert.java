package aleartsPop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class conformationAlert
{
public static void main(String[] args)
{
	WebDriver driver =new ChromeDriver();
	//declaration
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	
	//use
	
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	driver.switchTo().alert().dismiss();
	
	
}
}
