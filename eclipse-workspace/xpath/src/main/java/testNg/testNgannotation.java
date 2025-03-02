package testNg;

import org.testng.annotations.Test;

public class testNgannotation 
{
	@Test(priority=1,groups= {"Regression"})
  public void login()
  {
	  System.out.println("LOgin application sucessfully");
  }
	
	@Test(priority=2,groups= {"Regression"})
	  public void openapp()
	  {
		  System.out.println("open application sucessfully");
	  }
	
	@Test(priority=-1,groups= {"Regression"})
	  public void closed()
	  {
		  System.out.println("Closed application sucessfully");
	  }

}
