package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parllelexecution {
	
	public static WebDriver driver;
	@Test
	public void tc1chrome()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("dssad@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("axdsftdsd");
		driver.findElement(By.name("login")).click();
		driver.quit();
	}
	@Test
	public void tc1edge()
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("dssad@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("axdsftdsd");
		driver.findElement(By.name("login")).click();
		driver.quit();
	}
	@Test
	public void tc1firefox()
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("dssad@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("axdsftdsd");
		driver.findElement(By.name("login")).click();
		driver.quit();
	}
}
