package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestediframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
	    Thread.sleep(1000);
	    driver.switchTo().frame("frame1");
	    String myParentText =driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
	    System.out.println("myparenttext");
	    Thread.sleep(2000);
	    //need to switch nested frame
	    
	    driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
	    String mychildtext = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
	    System.out.println("mychildtext");
	    //finding element from main page
	    //need to switch focus from child to main page
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//h1[text()='Nested Frames']")).getText();
	    System.out.println("mytextpage");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	}

}