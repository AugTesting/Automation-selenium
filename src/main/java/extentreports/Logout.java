package extentreports;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import testNG.ExtentManager;

public class Logout extends ExtentManager{
	@BeforeMethod
	public void setup()
	{
		ext=ExtentManager.getReports();
		test=ext.createTest("Logout Test");
	}
	@Test
	public void LogoutTest()
	{
		System.out.println("test222");
		test.log(Status.INFO, "opening browser");
		test.log(Status.INFO, "click on logout");
		test.log(Status.INFO, "clicking on logout button");
		test.log(Status.INFO,"Logout test case has been passed");
	}
	@AfterMethod
	public void teardown()
	{
		ext.flush();
	}
}