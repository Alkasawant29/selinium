package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathattributestudy
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/signup");
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Advi");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Athawale");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("adviathawale21@gmail.com");
	    driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("advi@123");
		
		
	



	}

}
