package hybrid_framework;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_connectiion 
{
	
	public static XSSFWorkbook wbook;
	public static XSSFSheet sht;
	public static String path="Testdata\\";
	
	public static void excel_connection(String filename,String sheetname)
	{
		try {
			FileInputStream fi=new FileInputStream(path+filename);
			wbook=new XSSFWorkbook(fi);
			sht=wbook.getSheet(sheetname);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		public static String exel_cell(int row,int col)
		{
			return Excel_connectiion.sht.getRow(row).getCell(col).getStringCellValue();
		}
	

}
