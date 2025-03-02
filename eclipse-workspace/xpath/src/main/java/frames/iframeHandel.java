package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class iframeHandel 
{
public static void main(String[] args) 
{
	
	WebDriver driver =new ChromeDriver();
	//declaration
	WebDriverWait wait =new WebDriverWait(driver,Duration.ofNanos(1000));
	driver.get("https://ui.vision/demo/webtest/frames/");
	driver.manage().window().maximize();
	//Fream 1
	WebElement frem1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	driver.switchTo().frame(frem1 );
	driver.findElement(By.xpath("//input[@type='text' and @name='mytext1']")).sendKeys("Hi");
	driver.switchTo().defaultContent();//to switch back focus to main page
	
	//frem 2
	WebElement frem2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	driver.switchTo().frame(frem2);
	driver.findElement(By.xpath("//input[@type='text' and @name='mytext2']")).sendKeys("welcome2");
	driver.switchTo().defaultContent();
	
	//inner ifrem
	
	WebElement frem3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	driver.switchTo().frame(frem3);
	driver.findElement(By.xpath("//input[@type='text' and @name='mytext3']")).sendKeys("Inner welcome2");
	//driver.switchTo().defaultContent();
	driver.switchTo().frame(0);
	 WebElement btn = driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[3]"));
	//driver.findElement(By.xpath("//input[@class='Hvn9fb zHQkBf']")).sendKeys("Hello inner frem");
	//driver.findElement(By.xpath("(//span[@dir='auto'])[5]")).click();
	
	//javascript exccuter
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", btn);
	
	
}
}
