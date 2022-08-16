package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      driver= new ChromeDriver();
      driver.manage().window().maximize();
      String demoqa="https://demoqa.com/frames";
      driver.get(demoqa);
      System.out.println(driver.findElement(By.id("framesWrapper")).getText());
      
      List<WebElement> iframes=driver.findElements(By.tagName("iframe"));
      System.out.println(iframes.size());
      for(int i=0;i<iframes.size();i++)
      {
    	  if(iframes.get(i).getAttribute("id").equals("frame1"))
    	  {
    		  driver.switchTo().frame(i);
      System.out.println(driver.findElement(By.id("sampleHeading")).getText());
      break;
    	  }
	}
      driver.switchTo().defaultContent();
	}
}
