package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel4 {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shankar\\eclipse-workspace\\Automation-selenium\\resources\\ChromeDriver.exe");
		driver= new ChromeDriver();
		String demoqa="https://demoqa.com/browser-windows";
		driver.manage().window().maximize();
		driver.get(demoqa);
		
	//	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	/*    WebElement bwindow=driver.findElement(By.xpath("//*[@id='item-0']/span"));
	    bwindow.click();
	
	    WebElement bw=driver.findElement(By.partialLinkText("Browser Windows"));
	    bw.click();
	*/
	    WebElement nw=driver.findElement(By.xpath("//button[@id='windowButton']"));
	    nw.click();
	    String mainwindow=driver.getWindowHandle();
	    Set<String> allwindows=driver.getWindowHandles();
	    Iterator<String> itr=allwindows.iterator();
	    while(itr.hasNext())
	    		{
	    	String childwndows=itr.next();
	    	if(!mainwindow.equals(childwndows)) 
	    	{
	    		driver.switchTo().window(childwndows);
	    		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
	    	}
	    	}
	    	Thread.sleep(2000);	
	       
	    driver.findElement(By.id("messageWindowButton")).click();
	    
			}
			
		}
	   
	

