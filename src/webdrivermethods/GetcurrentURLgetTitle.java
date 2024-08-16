package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetcurrentURLgetTitle {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		Thread.sleep(1000);
		
		 String currentUrl =driver.getCurrentUrl();
		 System.out.println(currentUrl);
		     
	    String myTitle=driver.getTitle();
        System.out.println(myTitle);
        
     
	}

}
