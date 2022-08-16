package extentreports;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import testNG.ExtentManager;

public class Registration extends ExtentManager{
	@BeforeMethod
	public void setup()
	{
		ext=ExtentManager.getReports();
		test=ext.createTest("Registration Test");
	}
	@Test
	public void RegistrationTest()
	{
		System.out.println("test222");
		test.log(Status.INFO, "opening browser");
		test.log(Status.INFO, "click on registration");
		test.log(Status.INFO,"providing all details");
		test.log(Status.INFO, "clicking on registration button");
		test.log(Status.INFO,"Registration test case has been passed");
	}
	@AfterMethod
	public void teardown()
	{
		ext.flush();
	}
	}
	


