package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosel {

	public static WebDriver driver1;
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		browser();
		
		//sumoftwonumbers();
		//sumofthreenumbers(10,20,30);
		//sumofthreenumbers(15,20,30);
		//testmethod("testing string");
		System.out.println("done");

	}
	public static void browser() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", 
	    		  "C:\\Users\\Shankar\\Desktop\\DHIVYA\\Testing\\Automation\\SeleniumDrivers\\chromedriver.exe");
		
		String  a="testing" ;
		System.out.println(a);
		driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("http://www.google.com/");
		Thread.sleep(3000);
		
		
				
	}
	
	public static int sumoftwonumbers()
	{
		int a=10;
		int b=20;
		
		int sum =a+b;
		
	System.out.println("sum of 2 numbers =" + sum);
	return sum;
	}
	
	public static int sumofthreenumbers(int a ,int b, int c)
	{
		//int a =20 ;
		//int b =10;
		//int c=100;
		int sum=a+b+c;
		System.out.println("sum of 3 numbers =" + sum);	
		
		
		testmethod("testtttttttttttttt");
		return sum;
	}
	
	public static String testmethod(String a)
	{
		
		System.out.println("String given is = "+a);
		return "printed value";
		
		
	}
	
}
