package hybrid_framework;

import org.openqa.selenium.By;

public class Locators_cls 
{
	
	public static By excel_locators(String proname,String provalue)
	{
		By obj=null;
		
		switch (proname) 
		{
		case "xpath":
			obj=By.xpath(provalue);
			
			break;
		case "css":
			obj=By.cssSelector(provalue);
			break;
		case "id":
			obj=By.id(provalue);
			break;
		case "name":
			obj=By.name(proname);
			break;

		default:
			break;
		}
		return obj;
	}

}
