package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Before_class_and_after_class 
{
	
	@BeforeClass
	public void Before_class()
	{
		System.out.println("pre-condition");
		
	}
	
	@AfterClass
	public void After_class()
	{
		System.out.println("post-conditions");
	}
	
	@Test
	public void tc001()
	{
		Reporter.log("tc001 executed succesfully",true);
		
	}
	
	@Test
	public void tc002()
	{
		Reporter.log("tc002 executed succesfully",true);
	}
	
	@Test
	public void tc003()
	{
		Reporter.log("tc003 executed succesfully",true);
	}
}

