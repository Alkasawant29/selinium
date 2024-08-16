package chromeOption;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v125.pwa.model.FileHandlerAccept;

public class ChromeoptionUse {

	public static void main(String[] args) throws IOException {
		ChromeOptions options=new ChromeOptions();
		//options.addArguments("start-maximized");
		//options.addArguments("Incognito");
		options.addArguments("headless");
		
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        driver.findElement(By.name("q")).sendKeys("Advika");
        
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destination=new File("C:\\selinium\\screenshot selinium\\advi.png");
        org.openqa.selenium.io.FileHandler.copy(source, destination);
        
        
	}

}
