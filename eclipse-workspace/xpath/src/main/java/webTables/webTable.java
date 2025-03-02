package webTables;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webTable 
{
public static void main(String[] args)
{
	WebDriver driver =new ChromeDriver();
	//declaration
	//driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	driver.get("https://blazedemo.com");
	
	WebElement from = driver.findElement(By.xpath("//Select[@name='fromPort']"));
	WebElement to = driver.findElement(By.xpath("//Select[@name='toPort']"));
	WebElement submitbtn = driver.findElement(By.xpath("//input[@type='submit']"));
	
	Select fr=new Select(from);
	fr.selectByIndex(2);
	
	Select too=new Select(to);
	too.selectByIndex(2);
	submitbtn.click();
	

    List<WebElement> row = driver.findElements(By.xpath("//table[@class='table']//tr"));
    
    // Create an array to store the extracted values
    String[] valuesArray = new String[row.size() - 1]; // Adjust size based on row count (excluding header)
    int index = 0;

    for (int i = 1; i < row.size(); i++) { // Assuming first row is a header, so start from index 1
        List<WebElement> val = driver.findElements(By.xpath("//table[@class='table']//tr[" + i + "]//td[6]"));
        for (WebElement element : val) {
            valuesArray[index++] = element.getText(); // Add values to the array
            Arrays.sort(valuesArray);
           
            
        }
    }

  
}
		
		
	}
	
	


