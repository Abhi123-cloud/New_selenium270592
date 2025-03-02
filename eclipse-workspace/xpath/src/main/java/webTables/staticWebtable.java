package webTables;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticWebtable 
{
	
	public static void main(String[] args) 
	{
		
		WebDriver driver =new ChromeDriver();
		//declaration
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.get("https://testautomationpractice.blogspot.com/");
	List<WebElement> table = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		//Find total no of rows in table
		System.out.println("NO of rows"+table.size());
		
		//Find total no of columns in table
		List<WebElement> tabletd = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th"));
		System.out.println("NO of col" +tabletd.size());
		
		//To reaad data form specific column
		WebElement val = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]"));
		System.out.println(val.getText());
		
		//read all data of all rows and columns
		for (int i = 2; i < table.size(); i++) 
		{
			for (int j = 1; j <  tabletd.size(); j++) 
			{
				//repating 
			 String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
			 System.out.print(value + "\t");
			}
			System.out.println();
		}
		
		//fetch data base on special cretria
		//List<WebElement> table = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		int total=0;
		for (int i = 2; i < table.size(); i++)
		{		
			String prize = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[4]")).getText();
			total=total+Integer.parseInt(prize);
					

		}
		System.out.println("total prize:" + total);

		
	}
	
	

}
