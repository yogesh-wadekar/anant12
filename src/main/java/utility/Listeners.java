package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends BaseClass implements ITestListener
{	
	//ITestresult bring the result of test & passes it in bellow methods as an arguments
	//ITestResult is Interface which helps method to identify whether the test is pass, fail or skipped.
	public void onTestSuccess(ITestResult result)
	{
		System.out.println(result.getName()+" Test Pass Successfully");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println(result.getName()+" Test Fail so Connect with Developer");
		try 
		{
			ScreenShot.snap(driver, result.getName());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}			
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println(result.getName()+" Test Skipped");
	}

}
