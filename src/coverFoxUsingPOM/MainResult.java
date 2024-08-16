package coverFoxUsingPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MainResult 
{
	public static void main(String[] args) 
	{
	 ChromeOptions opt =new ChromeOptions();
	 opt.addArguments("--disable-notifications");
	
	WebDriver driver=new ChromeDriver(opt);
	driver.get("https://www.coverfox.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	
	CoverFoxHomePage homePage=new CoverFoxHomePage(driver);
	homePage.clickOnGenderButton();
	
	CoverFoxhealthPlanPage healthPlanPage = new CoverFoxhealthPlanPage(driver);
	healthPlanPage.clickOnNextButton();
	
	CoverFoxMemberDetailsPage memberDetailsPage=new CoverFoxMemberDetailsPage(driver);
	memberDetailsPage.handleAgeDropDown("26");
	memberDetailsPage.clickOnNextButton();
	
	CoverFoxADressDetailsPage addressDetailsPage=new CoverFoxADressDetailsPage(driver);
	addressDetailsPage.enterPincode();
	addressDetailsPage.enterMobileNumber();
	addressDetailsPage.clickONNextButton();
	
	CoverFoxResultPage resultPage=new CoverFoxResultPage(driver);
	resultPage.resultOutput();
	
	
	

}
}