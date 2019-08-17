package extentreports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class EXtent_reports_for_Gmail {

	public static void main(String[] args) 
	{
		String filepath="C:\\Users\\SHAMSHEER BASHA\\Desktop\\New Workspace\\practise selenium\\Extent_Reports\\Gmail.html";
		
		//create object for xtent reports
		ExtentReports reports=new ExtentReports(filepath,true);
		
		ExtentTest test=reports.startTest("Login_valid","Login_with valid email");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "browser launches succesully");
		
		//type tesxt in editbox
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("shamsheerbasha75");
		test.log(LogStatus.INFO, "email entered succesfully");
		
		reports.endTest(test);
		reports.flush();
		
		

	}

}
