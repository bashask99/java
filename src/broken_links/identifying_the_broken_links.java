package broken_links;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Verify;

public class identifying_the_broken_links {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total Links Are "+links.size());
		
		for (int i = 0; i < links.size(); i++) 
		{
		   WebElement element=links.get(i);
		  String url=element.getAttribute("href");
		  verifylinksActive(url);  
		   
		}
	}
	public static void verifylinksActive(String linkurl)
	{
		try 
		{
			URL url=new URL(linkurl);
			HttpURLConnection httpconection=(HttpURLConnection)url.openConnection();
			httpconection.setConnectTimeout(3000);
			httpconection.connect();
			
			if (httpconection.getResponseCode()==200) 
			{
				System.out.println(linkurl+" - "+httpconection.getResponseMessage());
				
			}
			if (httpconection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) 
			{
				System.out.println(linkurl+" - "+httpconection.getResponseMessage());
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

