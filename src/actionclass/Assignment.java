package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
        Thread.sleep(1000);
        //1.
        WebElement src = driver.findElement(By.id("src"));
        src.sendKeys("nand");
        
        //2.
        Actions action =new Actions(driver);
        
        for(int i=1;i<=3;i++)
        {
        	Thread.sleep(1000);
        	action.sendKeys(Keys.ARROW_DOWN).perform();
        }
          action.sendKeys(Keys.ENTER).perform();
        //3.
        WebElement dest = driver.findElement(By.id("dest"));
        dest.sendKeys("war");
        for(int i=1;i<=3;i++)
        {
        	Thread.sleep(1000);
        	action.sendKeys(Keys.ARROW_DOWN).perform();
         }
          action.sendKeys(Keys.ENTER).perform();
        
        
        

	}

}
