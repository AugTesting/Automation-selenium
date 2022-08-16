package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class depons {
	
	public static WebDriver driver;
	
	@BeforeTest
	public static void begin()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	@Test(priority = 1)
	public static void loadingpage()
	{
		String actual=driver.getTitle();
		String expected="Facebook - log in or sign up";
		if(actual.equalsIgnoreCase(expected))
		
			System.out.println("the title is  :  "+actual+ "Test case passed");
		
			else
				System.out.println("the title is" +actual+"test case failed");
		}

		@Test(priority = 2)
		public void clickoncreate() {
			
		driver.findElement(By.linkText("Create new account")).click();
	//	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
		
		@Test(priority=3,dependsOnMethods = "loadingpage")
		public void loginpage()
		{
			driver.findElement(By.name("firstname")).sendKeys("awdewd");
		}
		
		@AfterTest
		public void end()
		{
			driver.quit();
		}
		
			
	}
	


