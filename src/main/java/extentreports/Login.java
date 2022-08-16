package extentreports;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import testNG.ExtentManager;

public class Login extends ExtentManager{
	@BeforeMethod
	public void setup()
	{
		System.out.println("test");
		ext=ExtentManager.getReports();
		System.out.println("test1");

		test=ext.createTest("Login Test");
	}
	@Test
	public void LoginTest()
	{
		test.log(Status.INFO, "opening browser");
		test.log(Status.INFO, "click on Login");
		test.log(Status.INFO,"providing all details");
		test.log(Status.INFO, "clicking on login button");
		test.log(Status.INFO,"Login test case has been passed");
	}
	@AfterMethod
	public void teardown()
	{
		ext.flush();
	}
}