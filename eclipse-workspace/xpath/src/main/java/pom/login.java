package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login 
{
	WebDriver driver;
	//constractor-it will ineticate driver
	 public login(WebDriver driver)
	{
		this.driver=driver;
	}

	//locators
	By userName=By.name("username");
	By userpass=By.name("password");
	By btn=By.xpath("//button[@type='submit']");
	

	
	//Action methods
	public void setuserName(String un)
	{
		driver.findElement(userName).sendKeys(un);
	}
	public void setuserPass(String pass)
	{
		driver.findElement(userpass).sendKeys(pass);
	}
	public void clickLOginBtn()
	{
		driver.findElement(btn).click();
	}
	

}
