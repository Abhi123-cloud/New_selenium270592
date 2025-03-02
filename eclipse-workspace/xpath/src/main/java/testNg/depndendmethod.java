package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class depndendmethod 
{
	@Test(priority=1)
	void openapp()
	{
		System.out.println("open app");
		Assert.assertTrue(false);
	}
	@Test(priority=2)
	void login()
	{
		System.out.println("open login");
		Assert.assertTrue(true);
	}

	@Test(priority=3,groups= {"Sanity"})
	void search()
	{
		System.out.println("open search");
		Assert.assertTrue(true);
	}
	
	@Test(priority=4,groups= {"Sanity","funcational"})
	void advsearch()
	{
		System.out.println("open adsearch");
		Assert.assertTrue(true);
	}
	
	@Test(priority=5,groups= {"Sanity","funcational"})
	void logout()
	{
		System.out.println("open logout");
		Assert.assertTrue(true);
	}
}
