package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void f1()
	{
		System.out.println("This is Test1");
	}
	@Test
	public void f2()
	{
		System.out.println("This is Test2");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("This is before method");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("This is after method");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("This is before class");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("This is after class");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("This is before test");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("This is after test");
	}
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("This is before suite");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("This is after suite");
	}
}
