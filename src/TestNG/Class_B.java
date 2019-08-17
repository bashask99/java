package TestNG;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Class_B 
{
	@Test
	public void test()
	{
		System.out.println("@Test B");
	}
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before suite");
	}
	
	@AfterTest
	public void aftertst()
	{
		System.out.println("after test");
	}


}
