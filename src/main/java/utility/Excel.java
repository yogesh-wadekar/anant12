package utility;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String getExcelData(String credential, int r, int c) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\kiteZerodha\\src\\test\\resources\\yogesh.xlsx");
		String s=WorkbookFactory.create(file).getSheet(credential).getRow(r).getCell(c).getStringCellValue();
		return s;
		
	}

}
