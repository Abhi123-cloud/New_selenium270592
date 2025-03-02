package aleartsPop;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handelingalerts 
{
public static void main(String[] args) throws InterruptedException 
{

	WebDriver driver =new ChromeDriver();
	//declaration
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	
	//use
	
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().window().maximize();
	
	//1-Normal alert
	driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
	Thread.sleep(1000);
	Alert myalert = driver.switchTo().alert();
	
	String text = myalert.getText();
	System.out.println(text);
	myalert.accept();
	
	WebElement acttext = driver.findElement(By.xpath("//p[@id='result']"));
	String actv = acttext.getText();
	String exptext = "You successfully clicked an 1alert";
	
	if(actv.equals(exptext))
	{
		System.out.println("Test case is passed");
	}
	else
	{
		System.out.println("Test case is not  passed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
