package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      driver= new ChromeDriver();
      driver.manage().window().maximize();
      String demoqa="https://demoqa.com/droppable";
      driver.get(demoqa);
      WebElement srcelement=driver.findElement(By.id("draggable"));
      WebElement deselement=driver.findElement(By.xpath("//*[@id='droppable']"));
      Actions action=new Actions(driver);
      action.dragAndDrop(srcelement, deselement).perform();
      Thread.sleep(5000);
      driver.quit();

}
}