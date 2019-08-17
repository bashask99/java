package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class_A 
{
	@Test
	public void testA()
	{
		System.out.println("Test A");
	}
	
	@BeforeMethod
	public void Method()
	{
		System.out.println("before method");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after suite");
	}
	
	@BeforeClass
	public void cls()
	{
		System.out.println("before class");
	}

}
