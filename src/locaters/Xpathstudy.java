package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathstudy {

	public static void main(String[] args) throws InterruptedException 
	{
      WebDriver driver=new ChromeDriver();
      driver.get("https://auth.discoveryplus.in/login?flow=OTP login");
      Thread.sleep(2000);
      //Xpath
      //driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9657553933");
      //name
      driver.findElement(By.name("mobileNumber")).sendKeys("8698853283");
      //id
      // WebElement mobileNumberFeild =driver.findElement(By.id("mobileNumber"));
      

	}

}
