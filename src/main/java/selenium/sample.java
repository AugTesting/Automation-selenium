package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class sample {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shankar\\eclipse-workspace\\Automation-selenium\\resources\\chromedriver.exe" );
	WebDriverManager.chromedriver().setup();
    driver= new ChromeDriver();
	
    String fb="https://www.facebook.com";
    driver.manage().window().maximize();
    driver.get(fb);
    
  /* System.out.println(fname.getAttribute("data-type"));
    System.out.println(fname.getCssValue("font-family"));
    System.out.println(fname.getAttribute("name"));
    System.out.println(fname.getCssValue("background"));
    System.out.println(fname.getTagName());
   */
    
    WebElement createnewacc=driver.findElement(By.linkText("Create new account")); 
	createnewacc.click();
    
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    WebElement fname=driver.findElement(By.xpath("//input[@name='firstname']"));
	fname.sendKeys("face");
	
	WebElement lname =driver.findElement(By.name("lastname"));
	lname.sendKeys("book");
	
	WebElement mailorphno=driver.findElement(By.xpath("//input[@name='reg_email__']"));
	mailorphno.sendKeys("facebook@gmail.com");
	if(mailorphno.isDisplayed()==true)
	{
		WebElement reenter=driver.findElement(By.name("reg_email_confirmation__"));
		reenter.sendKeys("facebook@gmail.com");
		
		WebElement newpassword=driver.findElement(By.xpath("//input[@id='password_step_input']"));
		newpassword.sendKeys("facebook");
	}
	
	WebElement month_mon=driver.findElement(By.cssSelector("#month"));
	Select mon=new Select(month_mon);
//	mon.selectByValue("6");
	mon.selectByIndex(0);
	
	WebElement date_d=driver.findElement(By.id("day"));
	Select date=new Select(date_d);
	date.selectByValue("13");
	
	WebElement year_yr=driver.findElement(By.name("birthday_year"));
	Select year=new Select(year_yr);
	year.selectByVisibleText("1993");
	
  //  List<WebElement> gender=driver.findElements(By.className("_58mt"));
    List<WebElement> gender=driver.findElements(By.name("sex"));
    for(int i=0;i<gender.size();i++)
    {
    	System.out.println("gender["+i+"] "+gender.get(i).getText());
    	String gender_value=gender.get(i).getAttribute("value");
    	if(gender_value.equals("-1"))
    	{
    		gender.get(i).click();
    		WebElement elmt=driver.findElement(By.name("preferred_pronoun"));
    		if(elmt.isDisplayed()==true)
            {
            	Select pronoun=new Select(elmt);
            	pronoun.selectByValue("6");
            	WebElement gen=driver.findElement(By.xpath("//input[@name='custom_gender']"));
            	gen.sendKeys("Male");
            }	
    		driver.findElement(By.name("websubmit")).click();
    	//	System.out.println("clicked signup");
    	}
    }

	
    
    
		
	}



}
