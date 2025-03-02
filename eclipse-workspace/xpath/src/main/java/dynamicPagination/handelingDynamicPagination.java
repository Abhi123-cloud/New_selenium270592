package dynamicPagination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handelingDynamicPagination {

	public static void main(String[] args) 
	
	{
	
		WebDriver driver =new ChromeDriver();
		//declaration
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		
		

	}

}
