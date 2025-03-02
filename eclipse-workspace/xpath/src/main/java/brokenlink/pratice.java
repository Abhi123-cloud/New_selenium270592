package brokenlink;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pratice 
{
	public static void main(String[] args) throws IOException 
	{
		

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println("Total no of link "+link.size());
		for(WebElement allink:link)
		{
			String lval = allink.getAttribute("href");
			if(lval==null || lval.isEmpty())
			{
				System.out.println("Not able to find broken link");
			}
			
			URL linkurl = new URL(lval);
		HttpURLConnection httpcon = (HttpURLConnection) linkurl.openConnection();
		httpcon.connect();
		
		if(httpcon.getResponseCode()>400)
		{
			System.out.println("LInk is not broken"+linkurl);
		}
		else
		{
			System.out.println("LInk is broken"+linkurl);
		}
		
		}
		
	    

	}
}
