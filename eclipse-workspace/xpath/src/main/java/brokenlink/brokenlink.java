package brokenlink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class brokenlink
{
public static void main(String[] args) throws IOException
{
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--incognito");
	WebDriver driver =new ChromeDriver(opt);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	//us
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	List<WebElement> allLink = driver.findElements(By.tagName("a"));
	System.out.println("Total no of ink:"+allLink.size());
	int noofbrokenlink=0;
	for(WebElement linkele:allLink)
	{
		String hrefvalue = linkele.getAttribute("href");
		
		if(hrefvalue==null || hrefvalue.isEmpty())
		{
			System.out.println("href value is empty or NUll so not possiable to check");
			continue;
		}
		//hit url to server
		
		URL linkurl=new URL(hrefvalue);//COnvert href value sting to url
		HttpURLConnection connurl = (HttpURLConnection) linkurl.openConnection();
		
		//open connection
		connurl.connect();//COnnect to server and hit url
		if(connurl.getResponseCode()>400)
		{
			System.out.println(hrefvalue+"Broken link");
			noofbrokenlink++;
		}
		
		else
		{
			System.out.println(hrefvalue+"Link is not Broken link");
		}
	}
	System.out.println("no of broken links"+noofbrokenlink);
}
}
