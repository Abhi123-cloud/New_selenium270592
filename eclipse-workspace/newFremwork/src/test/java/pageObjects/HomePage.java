package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Basapage
{
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	
//	@FindBy(xpath="//span[text()='My Account']") WebElement my_account;
	@FindBy(xpath="//*[@id=\"loginPanel\"]/p[2]/a") WebElement register_link;
	
//	public void clickMyaccount()
//	{
//		my_account.click();
//	}
	
	public void clickRegister()
	{
		register_link.click();
	}
	

}
