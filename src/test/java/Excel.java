import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class Excel {
	
	public static String read(int i, int j) throws IOException{
		
			FileInputStream file=new FileInputStream("TestData.xls");
			HSSFWorkbook book=new HSSFWorkbook(file);
			HSSFSheet sheet=book.getSheet("Sheet1");
			String value=sheet.getRow(i).getCell(j).getStringCellValue();
		
		    return value;
	}
}
