package TestNG;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Method_ignorence 
{
	public static WebDriver driver;
	
	@BeforeClass
	public void App_launch()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void fiil_detials()
	{
		WebElement fstnm=driver.findElement(By.xpath("//input[@id='u_0_l']"));
		fstnm.clear();
		fstnm.sendKeys("bashaaaa");
		
	}
	@AfterClass
	public void screen_capture()
	{
		try {
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("Screens\\"+" "+".png"));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	

}
