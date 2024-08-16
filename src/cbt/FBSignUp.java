package cbt;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FBSignUp 
{
	WebDriver driver;
	@Parameters("browserName")//chrome,firefox,edge
	@Test
  public void f(String bname) throws InterruptedException 
  {
	if(bname.equalsIgnoreCase("chrome"))
	{
		driver =new ChromeDriver();
	}
	else if(bname.equalsIgnoreCase("fireFox"))
	{
		driver=new FirefoxDriver();
	}
	else if(bname.equalsIgnoreCase("edge"))
	{
		driver=new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	driver.get("https://www.facebook.com/signup");
	driver.findElement(By.name("firstname")).sendKeys("velocity");
	driver.findElement(By.name("lastname")).sendKeys("Pune");
	driver.findElement(By.name("reg_email__")).sendKeys("75080066785");
	Thread.sleep(2000);
	driver.close();
	
	
	
	
	
	
	
  }
}
