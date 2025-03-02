package testNg;

import org.testng.annotations.Test;

public class testngxml 
{
	@Test(priority=1)
	  public void login2()
	  {
		  System.out.println("LOgin 2application sucessfully");
	  }
		
		@Test(priority=2)
		  public void openapp2()
		  {
			  System.out.println("open 2application sucessfully");
		  }
		
		@Test(priority=-1)
		  public void closed2()
		  {
			  System.out.println("Closed 2application sucessfully");
		  }


}
