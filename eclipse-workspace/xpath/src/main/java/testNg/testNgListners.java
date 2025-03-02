package testNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class testNgListners implements ITestListener
{
//To perform some action base on particular exection status of test case
//EX-test got pass-then update result in resport
	//Ex-test faile-Export tet result and screen
	
	  public void onTestStart(ITestContext context) {
	        System.out.println("Test started: " );
	    }

	    public void onTestSuccess(ITestResult result) {
	        System.out.println("Test passed: " );
	    }

	    public void onTestFailure(ITestResult result) {
	        System.out.println("Test failed: ");
	    }

	    public void onTestSkipped(ITestResult result) {
	        System.out.println("Test skipped: ");
	    }

	   

	    public void onStart(ITestContext context) {
	        System.out.println("Test suite started: " );
	    }

	    public void onFinish(ITestContext context) {
	        System.out.println("Test suite finished:" );
	

	
	
}
}