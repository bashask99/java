package hybrid_framework;

import org.testng.annotations.Test;

public class TESTABLE 
{
	
	@Test(priority=0)
	public void application()
	{
		excel_repo.excel_helper(filename, sheetname);
	}
	
	@Test(priority=1)
	public void Admin_login()
	{
		excel_repo.excel_helper1(filename, sheetname, imagename);
	}

}
