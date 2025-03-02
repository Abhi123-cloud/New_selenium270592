package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class boostraopdropdown 
{
	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='HTML, CSS']")).click();
		//driver.findElement(By.xpath("//input[contains(@value,'Java')]")).click();
		
		List<WebElement> wb = driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//label"));
		
		for(WebElement opt:wb)
		{
			String op = opt.getText();
			
			if(op.equals("Java") || op.equals("Python") || op.equals("Oracle"))
			{
                 opt.click();
			}
		}

	}

}
