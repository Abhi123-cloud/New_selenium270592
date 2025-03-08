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
	
	@FindBy(id="customer.firstName") WebElement first_name;
	@FindBy(id="customer.lastName") WebElement last_Name;
	@FindBy(id="customer.address.street") WebElement Address;
	@FindBy(id="customer.address.city") WebElement city;
	@FindBy(id="customer.address.state") WebElement state;
	@FindBy(id="customer.address.zipCode")WebElement ZipCode;
	@FindBy(id="customer.phoneNumber")WebElement phoneNumber;
	@FindBy(id="customer.ssn")WebElement ssn;
	@FindBy(id="customer.username")WebElement userName;
	@FindBy(id="customer.password")WebElement passWord;
	@FindBy(id="repeatedPassword")WebElement cPassword;
	@FindBy(xpath="//input[@type='submit'  and @value='Register']") WebElement registerBtn;
	@FindBy(xpath="//h1[@class='title']")WebElement conFirmMsg;
	
	
	
	
	
	
	
	public void enterFirstname(String name)
	{
	first_name.sendKeys(name);
	}
	public void enterlastname(String lname)
	{
		last_Name.sendKeys(lname);
	
	}
	public void enterAddress(String Addr)
	{
		Address.sendKeys(Addr);

	}
	public void enterCity(String cit)
	{
		city.sendKeys(cit);
	}
	public void enterStat(String stat)
	{
		state.sendKeys(stat);
	}
	public void enterZIp(String Zip)
	{
		ZipCode.sendKeys(Zip);
	}
	public void enterPNo(String phoneN)
	{
		phoneNumber.sendKeys(phoneN);
	}
	public void enterSn(String Sn)
	{
		ssn.sendKeys(Sn);
	}
	public void enteruserName(String Un)
	{
		userName.sendKeys(Un);
	}
	public void enterPass(String pass)
	{
		passWord.sendKeys(pass);
	}
	
	public void enterCom_Pass(String Cpass)
	{
		cPassword.sendKeys(Cpass);
	}
	public void clickSubmit()
	{
		registerBtn.click();
	}
	
	
	public String getCOnfirmationmsg()
{
		return conFirmMsg.getText();
	}
	

}
