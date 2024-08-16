package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		Thread.sleep(2000);
		WebElement mobilenumberfeild=driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		mobilenumberfeild.sendKeys("8888888888");
		
		WebElement GetOtpButton=driver.findElement(By.xpath("//button[text()='Get OTP']"));
		GetOtpButton.isEnabled();
		
		GetOtpButton.click();

	}

}
