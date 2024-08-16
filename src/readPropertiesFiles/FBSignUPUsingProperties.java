package readPropertiesFiles;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dataproviders.Utility;

public class FBSignUPUsingProperties 
{
  @Test
  public void f() throws IOException, InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  String url = Utility.readDataFromPropertiesFile("url");
	  driver.get(url);
	  driver.findElement(By.name("firstname")).sendKeys(Utility.readDataFromPropertiesFile("firstName"));
	  driver.findElement(By.name("lastname")).sendKeys(Utility.readDataFromPropertiesFile("lastName"));
	  driver.findElement(By.name("mobNum")).sendKeys(Utility.readDataFromPropertiesFile("mobNum"));
	  Thread.sleep(2000);
	  driver.close();
	  
  }


	
}


