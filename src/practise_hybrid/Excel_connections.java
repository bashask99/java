package practise_hybrid;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_connections 
{
	
	public static XSSFWorkbook wbook;
	public static XSSFSheet sht;
	public static String path="Testdata\\";
	
	public static void excel_connections(String filename,String sheetname)
	{
		try {
			FileInputStream fi=new FileInputStream(path+filename);
			wbook=new XSSFWorkbook();
			sht=wbook.getSheet(sheetname);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		public static String excel_cell(int row,int cell)
		{
			return Excel_connections.sht.getRow(row).getCell(cell).getStringCellValue();
		}
	

}
