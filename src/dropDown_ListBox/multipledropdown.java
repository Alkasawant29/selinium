package dropDown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipledropdown {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
	WebElement	MultiSelectDropDown=driver.findElement(By.id("cars"));
		Select s=new Select(MultiSelectDropDown);
		
		//check if multiple selectable or not?
		System.out.println(s.isMultiple());
		
		s.selectByIndex(2);
		s.selectByValue("opel");
		s.selectByVisibleText("Opel");
		
		//s.deselectAll();
		s.selectByIndex(2);
		s.selectByValue("opel");
		s.selectByVisibleText("Opel");
	}

}
