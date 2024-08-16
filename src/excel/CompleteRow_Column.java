package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CompleteRow_Column {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myfile=new FileInputStream("");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		//read complete row
		for(i=0;i<=2;i++)
		{
			mySheet.getRow(0).getCell(i);
		}
		

	}

}
