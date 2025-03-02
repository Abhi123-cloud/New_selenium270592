package testNg;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testNgAnnoteteion 
{

	
		@Test(priority=3)
		public void login()
		{
			System.out.println("login appication");
			System.out.println("login appication");
			Assert.assertEquals(1, 2);
			System.out.println("login appication");
			System.out.println("login appication");
		}
		@Test
		public void search()
		{
			SoftAssert as=new SoftAssert();
			System.out.println("login appication");
			System.out.println("login appication");
			as.assertEquals(1, 2);
			System.out.println("login appication");
			System.out.println("login appication");
			as.assertAll();
		}
		@Test(groups="funcational")
		public void advSearch()
		{
			System.out.println("Validate advance serch");
		}
		@AfterTest
		public void logout()
		{
			System.out.println("Validate Application logout");
		}
		
		
		
		
		
	
}
