package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class Sel1 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println(System.getProperty("user.dir"));
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shankar\\eclipse-workspace\\Automation-selenium\\resources\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		String fb="https://www.facebook.com";
		String demoqa="https://demoqa.com/elements";
		
		driver.manage().window().maximize();
		
		
	//	driver.get(fb);
		//driver.get("https://demoqa.com/elements");
		//driver.findElement(By.id("userName")).sendKeys("aabbccdd");
		//driver.findElement(By.name("email")).sendKeys("aqwer@gmail.com");
		
		driver.get(demoqa);
		WebElement txtbox=driver.findElement(By.className("text"));
		txtbox.click();
		
		WebElement fullname=driver.findElement(By.id("userName"));
		fullname.sendKeys("Selenium");
		
		WebElement username=driver.findElement(By.id("userEmail"));
		username.sendKeys("asdfg@gmail.com");
		
		WebElement cuaddress=driver.findElement(By.id("currentAddress"));
	    cuaddress.sendKeys("142 street,asxdfdf,jhdfjihdiu,pin:465465");
		
		
		WebElement peraddress=driver.findElement(By.id("permanentAddress"));
	    peraddress.sendKeys("142 street,asxdfdf,jhdfjihdiu,pin:465465");
	    
	    WebElement submi=driver.findElement(By.id("submit"));
	    submi.click();
		
		WebElement table=driver.findElement(By.className("text"));
		table.click();
		
		//Thread.sleep(5000);
		//driver.quit();
		
		
	//	driver.findElement(By.xpath("//*[@id=\"item-1\"]/span")).click();
		
		WebElement radio=driver.findElement(By.id("item-2"));
	    radio.click();
		
		WebElement webtables=driver.findElement(By.id("item-3"));
		webtables.click();
		
		WebElement buttons=driver.findElement(By.id("item-4"));
		buttons.click();
		
		WebElement link=driver.findElement(By.id("item-5"));
		link.click();
		
		WebElement brlinks=driver.findElement(By.id("item-6"));
		brlinks.click();
		
		driver.findElement(By.xpath("//*[@id='item-0']")).click();
	
		
		WebElement newacc=driver.findElement(By.id("u_0_2_ql"));
		newacc.click();
		
		driver.findElement(By.xpath("//*[@id='u_0_2_ql']")).click();
    	driver.findElement(By.cssSelector("#email")).sendKeys("assdsf");
		driver.findElement(By.cssSelector("#pass")).sendKeys("assdsf");
	}

}
