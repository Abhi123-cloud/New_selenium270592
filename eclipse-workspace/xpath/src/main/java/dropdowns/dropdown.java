package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown 
{
public static void main(String[] args) 
{
	
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	driver.get("https://practice.expandtesting.com/dropdown");
	driver.manage().window().maximize();
	WebElement val = driver.findElement(By.xpath("//select[@id='country']"));
	Select sel=new Select(val);
	//sel.selectByVisibleText("India");
	sel.deselectByIndex(5);
	
}
}
