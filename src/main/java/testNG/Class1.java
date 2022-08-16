package testNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class1 {
	
	
	@Test
	
	public void openbrowser()
	{
		System.out.println("opening browser");
	}
	
	
	@Test
	public void login()
	{
		System.out.println("login to Aut");
		Assert.fail("fail intenionally");
	}

}
