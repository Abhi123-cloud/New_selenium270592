package testCases;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.restassured.internal.support.FileReader;

import org.apache.logging.log4j.LogManager;//log4j
import org.apache.logging.log4j.Logger;//log4j

public class BasaClass 
{
public WebDriver driver;
public Logger logger;//Create log varibale and import logger 
	public Properties p;
	
//Base class in parent class of all test case
@Parameters({"browser"})
@BeforeClass
void Setup(@Optional("chrome") String br )

{//Loading config.prperties file
	 
	//FileReader file =new FileReader("C:\\Users\\abhit\\eclipse-workspace\\newFremwork\\src\\main\\resource\\config.properties");
	Properties p = new Properties();
	//Adding log 4j code s
	logger=LogManager.getLogger(this.getClass());
	switch(br.toLowerCase())
	{
	case "chrome":driver=new ChromeDriver();break;
	case "edge":driver=new EdgeDriver();break;
	default :System.out.println("Invalid browser name.. ");return;
	}
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.manage().window().maximize();
}

@AfterClass
void tearDown() 
{
	driver.quit();
}
}
