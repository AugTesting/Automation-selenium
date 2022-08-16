package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel2 {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shankar\\eclipse-workspace\\Automation-selenium\\resources\\chromedriver.exe");
		
		driver=new ChromeDriver();
		String demoqa="https://demoqa.com/";
		String fb="https://www.facebook.com/";
		
		driver.manage().window().maximize();
		
		driver.get(demoqa);
		driver.get(fb);
		
	/*	driver.findElement(By.className("card-up")).click();
		
		driver.findElement(By.id("item-2")).click();
		
		driver.findElement(By.xpath("//label[@class=\"custom-control-label\"]")).click();
		
		WebElement webtables=driver.findElement(By.id("item-3"));
		webtables.click();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[1]/div[1]")).click();
       
       System.out.println(driver.getCurrentUrl());
       System.out.println(driver.getTitle());
	   
	   
	   String expectedtitle="ToolsQA";
	   String actualtitle=driver.getTitle();
	   if(expectedtitle.equals(actualtitle))
	   {
		   System.out.println("The titles are same");
	   }   else
		   { System.out.println(("The titles are not same"));
	   }
		
	  */ 
	   driver.navigate().to(demoqa);
	   System.out.println("navigating to :"+demoqa);
	 
	   Thread.sleep(2000); 
	   
	   driver.navigate().back();
	   System.out.println("navigating to fb:"+fb);
	   
	  Thread.sleep(2000); 
	  
	   driver.navigate().forward();
	   System.out.println("navigating forward:"+demoqa);
	   
	   Thread.sleep(2000); 
	   
	   driver.navigate().refresh();
	   System.out.println("refreshing");
	   

	   driver.close();
		
		
		

	}

}
