package practise_hybrid;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import hybrid_framework.Excel_connectiion;

public class Excel_repo 
{
	public static WebDriver driver;
		
		public static void excel_helper(String filename,String sheetname)
		{
		  Excel_connections.excel_connections(filename, sheetname);
		  String app_url=Excel_connections.excel_cell(1, 0);
		  
		  //application
		  driver=new ChromeDriver();
		  driver.get(app_url);
		  driver.manage().window().maximize();
		  
		}
		
		public static void excel_helper_1(String filename,String sheetname,String imagename)
		{
			Excel_connections.excel_connections(filename, sheetname);
			
			//how many rows are present in sheet
			int rc=Excel_connections.sht.getFirstRowNum();
			
			for (int i = 0; i < rc; i++) 
			{
				String proname=Excel_connections.excel_cell(i, 1);
				String provalue=Excel_connections.excel_cell(i, 2);
				String actions=Excel_connections.excel_cell(i, 3);
				String inputdata=Excel_connections.excel_cell(i, 4);
				
				switch (actions) {
				case "Textbox":
					WebElement ele=driver.findElement(Excel_locators.excel_locators(proname, provalue));
					
					break;
					
	            case "Button":
					WebElement ele_1=driver.findElement(Excel_locators.excel_locators(proname, provalue));
					break;
					
	            case "capturescreen":
	            	try {
	            		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	            		FileUtils.copyFile(src,new File("Screens\\"+imagename+".png"));
						
					} catch (Exception e) {
						// TODO: handle exception
					}
	            	break;
	            case "Dropdown":
	            	Select Dd=new Select(driver.findElement(Excel_locators.excel_locators(proname, provalue)));
                
				default:
					break;
				}
			}
			
		}

}
