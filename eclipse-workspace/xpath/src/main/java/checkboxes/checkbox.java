package checkboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkbox 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver =new ChromeDriver();
	//declaration
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	
	//use
	
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	//1 Clickin gon multipal check boxes with for lopp
	
	//List<WebElement> checkbox = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	
//	for (int i = 0; i < checkbox.size(); i++) 
//	{
//		checkbox.get(i).click();
//	}
//	//enhanced for loop
//	for(WebElement checkboxex:checkbox)
//	{
//		checkboxex.click();
//	}
//	
	//Select last 3 textboxes
	//total no of checkboxes-how many checkboxes want to select=starting index
	//7-3=4 <--starting index
	List<WebElement> checkbox = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	for (int i = 4; i < checkbox.size(); i++) 
	{
		checkbox.get(i).click();
	}
	
	//Select first 3 textboxes
	
	for (int i = 0; i < 3; i++) 
	{
		checkbox.get(i).click();
		
	}
	//Unselect checkbox if they are selected
	
	Thread.sleep(10000);
	for (int i = 0; i < checkbox.size(); i++) 
	{
		if(checkbox.get(i).isSelected())
		{
			checkbox.get(i).click();
			
		}
	}
}

                           






}
