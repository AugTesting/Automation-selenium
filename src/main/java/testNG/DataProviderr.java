package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderr 
	{
	@Test(dataProvider="getthedata")
	public void retriveData(String email,String Contactno,String gender)
	{
		System.out.println("Email:"+email);
		System.out.println("ContactNO:"+Contactno);
		System.out.println("Gender:"+gender);
	}
	@DataProvider
	public Object[][] getthedata()
	{
	Object[][] data=new Object[2][3];
	data[0][0]="abc@gmail.com";
	data[0][1]="56467865";
	data[0][2]="male";
	
	data[1][0]="xyz@gmail.com";
	data[1][1]="53456546";
	data[1][2]="female";
	
	return data;
	
	}
}