package dropdowns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Checking_dropdowns_ascending_order 
{

	public static void main(String[] args) 
	{
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.cleartrip.com");
	   driver.manage().window().maximize();
	   
	   //locating dropdown
	   Select dropdopwn=new Select(driver.findElement(By.id("Adults")));
	   List actuallist=new ArrayList();
	   
	   List<WebElement> ddnames=dropdopwn.getOptions();
	   
	   for (WebElement ele:ddnames) 
	   {
		String data=ele.getText();
		actuallist.add(data);
	}
	 
	   List temp=new ArrayList();
	   
	   temp.addAll(actuallist);
	   //Ascending
	   Collections.sort(temp);
	   Assert.assertTrue(actuallist.equals(temp)); 
	   
	   
	   
	}

}
