package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Method_dependencies 
{
	
	@BeforeClass
	public void setup_browser()
	{
		System.out.println("set all desired capabilities");
	}
	
	@Test(priority=0)
	public void Browser_launch()
	{
		Assert.assertTrue(true);
		Reporter.log("browser launch succwsfully");
	}
	
	@Test(priority=1,dependsOnMethods={"Browser_launch"})
	public void App_launch()
	{
		Assert.assertEquals("sign_in", "sign_in");
		Reporter.log("Load application succesfully");
	}
	
	@Test(priority=2,dependsOnMethods={"App_launch"})
	public void user_login()
	{
		Assert.assertEquals("email", "email");
		Reporter.log("user login succesfully");
	}

}
