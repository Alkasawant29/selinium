package readPropertiesFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData {

	public static void main(String[] args) throws IOException
	{
		
        FileInputStream myFile=new FileInputStream(System.getProperty("user.dir")+"//FBSignUP.properties");
        Properties prop=new Properties();
        prop.load(myFile);
        String value = prop.getProperty("lastName");
        System.out.println(value);
	}

}
