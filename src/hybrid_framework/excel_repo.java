package hybrid_framework;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class excel_repo 
{
	
	public static WebDriver driver;
	
	public static void excel_helper(String filename,String sheetname)
	{
		Excel_connectiion.excel_connection(filename, sheetname);
		String app_url=Excel_connectiion.exel_cell(1,0);
		//application
		driver=new ChromeDriver();
		driver.get(app_url);
		driver.manage().window().maximize();
	}
	public static void excel_helper1(String filename,String sheetname,String imagename)
	{
		Excel_connectiion.excel_connection(filename, sheetname);
		
		//how many rows are present in current excel
		int rc=Excel_connectiion.sht.getLastRowNum();
		
		//loops
		for (int i = 0; i < rc; i++) 
		{
			String proname=Excel_connectiion.exel_cell(i, 1);
			String provalue=Excel_connectiion.exel_cell(i, 2);
			String actions=Excel_connectiion.exel_cell(i, 3);
			String inputdata=Excel_connectiion.exel_cell(i,4);
			
			switch (actions) {
			case "Textbox":
			WebElement ele=driver.findElement(Locators_cls.excel_locators(proname, provalue));
				
				break;
			case "Button":
				WebElement ele1=driver.findElement(Locators_cls.excel_locators(proname, provalue));
				break;
			case "Capturescreen":
				try {
					File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(src, new File("Screens\\"+imagename+".png"));
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				break;
			case "Dropdown":
				Select drop=new Select(driver.findElement(Locators_cls.excel_locators(proname, provalue)));
				
				break;

			default:
				break;
			}
			
			
			
			
			
			
		}		
		
		
		
		
		
		
	}
}
