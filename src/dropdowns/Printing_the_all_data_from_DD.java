package dropdowns;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Printing_the_all_data_from_DD {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//selecting dropdown
		WebElement dropdown=driver.findElement(By.id("day"));
		Select select=new Select(dropdown);
		
		List<WebElement> options=select.getOptions();
		
		for(WebElement basha : options)
		{
			System.out.println("DD options" +basha.getText());
		}
	}
}
