package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Eg5keyboard {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/r.php");
		Thread.sleep(1000);
		WebElement nameFeild = driver.findElement(By.name("firstname"));
        
        Actions act=new Actions(driver);
        
        //act.sendKeys(nameField, "Velocity").perform();
        act.keyDown(nameFeild,Keys.SHIFT).sendKeys("Advika").keyUp(Keys.SHIFT).build().perform();
        
	}

}