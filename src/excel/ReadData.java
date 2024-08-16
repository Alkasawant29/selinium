package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.batik.css.engine.value.StringValue;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myfile=new FileInputStream("C:\\selinium\\excel\\Book1.xlsx");
        Workbook myWorkbook=WorkbookFactory.create(myfile);
        Sheet mySheet=myWorkbook.getSheet("Sheet3");
        Row myRow=mySheet.getRow(0);
        Cell myCell=myRow.getCell(0);
        CellType dataType=myCell.getCellType();
       // System.out.println(dataType);
        String value=myCell.getStringCellValue();
        System.out.println(value);
	}

}
