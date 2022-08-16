package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAutomation {

	public static WebDriver driver2;	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("beofre");
		openbrowser();
		System.out.println("done");
		
		
		//browser drivers 
		      
	}
	
	public static void openbrowser() throws InterruptedException
	
	{
		System.out.println("inside");
		System.setProperty("webdriver.chrome.driver", 
	    		  "C:\\Users\\Shankar\\Desktop\\DHIVYA\\Testing\\Automation\\SeleniumDrivers\\chromedriver.exe");
	      driver2 = new ChromeDriver();
	          driver2.manage().window().maximize();
		  
	      driver2.get("https://www.facebook.com/");			  			  
		  Thread.sleep(5000); 
		  driver2.quit();
	}
	
	
	
	
	
	
}