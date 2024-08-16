package coverFoxUsingPOMandExcel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import dataproviders.Utility;

public class MainResult 
{

	public static void main(String[] args) throws InterruptedException 
	{
	 ChromeOptions opt =new ChromeOptions();
	 opt.addArguments("--disable-notifications");
	
	WebDriver driver=new ChromeDriver(opt);
	driver.get("https://www.coverfox.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	
	//create object of homepage
	CoverFoxHomePage homePage=new CoverFoxHomePage(driver);
	homePage.clickOnGenderButton();
	
	CoverFoxhealthPlanPage healthPlanPage = new CoverFoxhealthPlanPage(driver);
	healthPlanPage.clickOnNextButton();
	
	CoverFoxMemberDetailsPage memberDetailsPage=new CoverFoxMemberDetailsPage(driver);
	memberDetailsPage.handleAgeDropDown("age");
	memberDetailsPage.clickOnNextButton();
	
	CoverFoxAdressDetailsPage addressDetailsPage=new CoverFoxAdressDetailsPage(driver);
	addressDetailsPage.enterPincode("pincodeValue");
	addressDetailsPage.enterMobileNumber("mobileNumber");
	addressDetailsPage.clickONNextButton();
	
	CoverFoxResultPage resultPage=new CoverFoxResultPage(driver);
	resultPage.resultOutput();
	
	Thread.sleep(2000);
	driver.close();
	
}
}