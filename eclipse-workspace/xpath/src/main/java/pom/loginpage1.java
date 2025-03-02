package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage1 

{
	WebDriver driver;
	public loginpage1 (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//*[name='username']") WebElement username_txt;
	@FindBy(xpath="//*[name='password']") WebElement pass_txt;
	@FindBy(xpath="//button[@type='submit']") WebElement sub_btn;
	
	
	public void setuserName(String un)
	{
		username_txt.sendKeys(un);
	}
	public void setuserpass(String pass)
	{
		pass_txt.sendKeys(pass);
	}
	public void setuserName()
	{
		sub_btn.click();
	}
		
	}
	

