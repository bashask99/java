package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_ 
{
	public static WebDriver driver;
	
	@Parameters({"app_url"})
	@Test(priority=0)
	public void browser_launch(String url)
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	@Parameters({"fstnm","lstnm","IP_FN","IP_LN"})
	@Test(priority=1)
	public void Data(String fname,String Lname,String FN,String LN)
	{
		driver.findElement(By.xpath(fname)).sendKeys(FN);
		driver.findElement(By.xpath(Lname)).sendKeys(LN);
	}

}
