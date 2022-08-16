package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action1 {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      driver= new ChromeDriver();
      driver.manage().window().maximize();
  /*    String fk="https://www.flipkart.com/";
      driver.get(fk);
     // Thread.sleep(10000);
      WebElement login=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
      Thread.sleep(2000);
      login.click();
      
      WebElement electronics=driver.findElement(By.className("CXW8mj"));
      Actions action=new Actions(driver);
      action.moveToElement(electronics).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).click().build().perform();
   */
      
   driver.get("http://omayo.blogspot.com/");
 /*  WebElement element1=driver.findElement(By.id("blogsmenu"));
   WebElement element2=driver.findElement(By.xpath("//li[@class='has-sub']/ul/li[3]/a/span"));
   Actions action=new Actions(driver);
   action.moveToElement(element1).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).click(element2).build().perform();
 */
   WebElement search=driver.findElement(By.xpath("//*[@id='BlogSearch1_form']/form/table/tbody/tr/td[1]/input"));
 //  Actions action=new Actions(driver);
  // action.moveToElement(search).sendKeys("aqwe").build().perform();
   search.sendKeys("dhghg");
   Thread.sleep(9000);
   driver.quit();
      
      
}
}