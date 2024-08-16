package chromeOption;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notifications {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		//option.addArguments("disable-notifications");
		//If we want to pass multiple arguments--> create an object of List
        ArrayList<String>al=new ArrayList<String>();
        al.add("disable-notifications");
		al.add("start-maximized");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.justdial.com/");
        Thread.sleep(1000);

	}

}
