package testNG;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	public static ExtentReports ext;
	public static ExtentSparkReporter sprk;
	public static ExtentTest test;
	
	public static ExtentReports getReports()
	{
		try {
		if(ext==null)
		{
		ext =new ExtentReports();
		System.out.println(System.getProperty("user.dir")+"\\extReports\\extent.html");
		sprk=new ExtentSparkReporter(System.getProperty("user.dir")+"\\extReports\\extent.html");
		System.out.println(System.getProperty("user.dir"));
		sprk.config().setTheme(Theme.DARK);
		sprk.config().setDocumentTitle("This is my extent report");
		sprk.config().setReportName("Extent Report");
		sprk.config().setEncoding("utf-8");
		ext.attachReporter(sprk);
			
		}
		
		return ext;
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			return null;
		}
	}
	

}
