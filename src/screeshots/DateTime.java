package screeshots;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DateTime {

	public static void main(String[] args) throws IOException 
	{
		
		String timestamp=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        System.out.println(timestamp);
        
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login");
        File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);                                                                                                                            
		File destination=new File("C:\\selinium\\screenshot selinium\\test"+timestamp+".png");
		FileHandler.copy(source, destination);
		
	}

}
