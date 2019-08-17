package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class_C 
{
	@Test
	public void testC()
	{
		System.out.println("Test C");
	}
	
	@BeforeTest
	public void bfrtst()
	{
		System.out.println("before test");
	}
	
	@AfterClass
	public void aftrcls()
	{
		System.out.println("after class");
	}
	
	@AfterMethod
	public void aftrmthd()
	{
		System.out.println("after method");
	}
	
	

}
