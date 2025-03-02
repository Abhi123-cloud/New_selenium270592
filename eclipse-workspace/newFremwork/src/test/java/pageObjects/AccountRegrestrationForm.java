package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegrestrationForm extends Basapage{

	public AccountRegrestrationForm(WebDriver driver) {
		super(driver);
		
	}
	
//	@FindBy(xpath="//input[@name='firstname']") WebElement first_name;
//	@FindBy(xpath="//input[@name='lastname']") WebElement last_Name;
//	@FindBy(xpath="//input[@name='email']") WebElement email;
//	@FindBy(xpath="//input[@name='password']") WebElement password;
//	@FindBy(xpath="//input[@name='agree']") WebElement checkBox;
//	@FindBy(xpath="//button[text()='Continue']") WebElement btn;
//	@FindBy(xpath="//*[@id=\"content\"]/h1") WebElement confirm_Msg;
	
	@FindBy(id="firstName") WebElement first_name;
	@FindBy(id="lastName") WebElement last_Name;
	@FindBy(id="place") WebElement place;
	@FindBy(id="nation") WebElement nation;
	@FindBy(id="password")WebElement pass;
	@FindBy(id="confirmPassword")WebElement confirmpass;
	@FindBy(xpath="//button[text()='Register']") WebElement contnue_btn;
	@FindBy(xpath="//p[text()='Registration successful!']") WebElement confirm_Msg;
	
	
	
	
	
	
	
	public void enterFirstname(String name)
	{
	first_name.sendKeys(name);
	}
	public void enterlastname(String lname)
	{
		last_Name.sendKeys(lname);
	
	}
	public void enterPlace(String placenm)
	{
		place.sendKeys(placenm);

	}
	public void enterNation(String nationnm)
	{
		nation.sendKeys(nationnm);
	}
	public void enterPass(String passe)
	{
		pass.sendKeys(passe);
	}
	
	public void enterCom_Pass(String Cpass)
	{
		confirmpass.sendKeys(Cpass);
	}
	public void clickSubmit()
	{
		contnue_btn.click();
	}
	
	
	public String getCOnfirmationmsg()
	{
		return confirm_Msg.getText();
	}
	

}
