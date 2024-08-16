package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closemethod {

	public static void main(String[] args) throws InterruptedException 
	{
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    Thread.sleep(2000);
	    driver.close();

	}

}
