package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      driver= new ChromeDriver();
      driver.manage().window().maximize();
      String demoqa="https://demoqa.com/alerts";
      driver.get(demoqa);
  /*    
      WebElement firstalert=driver.findElement(By.id("alertButton"));
      firstalert.click();
      Alert alert1=driver.switchTo().alert();
      Thread.sleep(2000);
      alert1.accept();
      
      WebElement alert2=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
      alert2.click();
      
     WebDriverWait wait=new WebDriverWait(driver, 7);
     wait.until(ExpectedConditions.alertIsPresent());
     Thread.sleep(2000);
     Alert alert22=driver.switchTo().alert();
     alert22.accept();
     
     WebElement cbutton=driver.findElement(By.id("confirmButton"));
     cbutton.click();
     
     WebDriverWait wait1=new WebDriverWait(driver, 5);
     wait1.until(ExpectedConditions.alertIsPresent());
     Thread.sleep(2000);
     Alert cbutton1=driver.switchTo().alert();
     cbutton1.accept();
    */ 
     WebElement pbutton=driver.findElement(By.id("promtButton"));
     pbutton.click();
     WebDriverWait wait2=new WebDriverWait(driver, 4);
     wait2.until(ExpectedConditions.alertIsPresent());
    // Thread.sleep(2000);
     System.out.println(driver.switchTo().alert().getText());
     //pbutton1.sendKeys("demo");
 //    pbutton1.dismiss();
     
     Robot robot=new Robot();
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection("SEA"), null);
     
     robot.keyPress(KeyEvent.VK_CONTROL);
     robot.keyPress(KeyEvent.VK_V);
     robot.keyPress(KeyEvent.VK_V);
     robot.keyRelease(KeyEvent.VK_CONTROL);
     
     robot.keyPress(KeyEvent.VK_TAB);
     robot.keyRelease(KeyEvent.VK_TAB);
     
     robot.keyPress(KeyEvent.VK_ENTER);
     robot.keyRelease(KeyEvent.VK_ENTER);
     
     Thread.sleep(5000);
	}

}
