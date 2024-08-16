package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsmethods {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Advi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id,'u_0_k_')]")).clear();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[contains(@id,'u_0_m_')]")).click();
		//Thread.sleep(1000);
		
	}

}
