package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// How to handle https://username:password@URL
		// username: admin
		// password: admin
		// url:https://the-internet.herokuapp.com/basic_auth
		
		String username="admin";
		String password="admin";
		Thread.sleep(1000);
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("http://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		System.out.println(driver.findElement(By.tagName("p")).getText());
		

	}

}