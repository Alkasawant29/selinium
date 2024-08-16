package coverFoxUsingPOMandExcel;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dataproviders.Utility;
import dev.failsafe.internal.util.Assert;

public class CoverFoxTC1
{
	WebDriver driver;
	CoverFoxHomePage homePage;
	CoverFoxhealthPlanPage healthPlanPage;
	CoverFoxAdressDetailsPage addressDetailsPage;
	CoverFoxMemberDetailsPage memberDetailsPage;
	CoverFoxResultPage resultPage;
	String filePath;
	
	@BeforeTest
	public void launchBrowser()
	{
	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("--disable-notifications");
	driver= new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.get("https://www.coverfox.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	homePage= new CoverFoxHomePage(driver);
	healthPlanPage= new CoverFoxhealthPlanPage(driver);
	addressDetailsPage= new CoverFoxAdressDetailsPage(driver);
	memberDetailsPage= new CoverFoxMemberDetailsPage(driver);
	resultPage= new CoverFoxResultPage(driver);
	filePath = "C:\\Users\\LENOVO\\Documents\\Excelsheet\\Book2.xlsx";
	}

	@BeforeClass
	public void preConditions() throws EncryptedDocumentException, IOException, InterruptedException 
	{
	homePage.clickOnGenderButton();
	Thread.sleep(1000);
	healthPlanPage.clickOnNextButton();
	Thread.sleep(1000);
	memberDetailsPage.handleAgeDropDown(commonMethods.Utility.readDataFromExcel(filePath,"Sheet5", 0, 0));

	memberDetailsPage.clickOnNextButton();
	Thread.sleep(1000);
	
	addressDetailsPage.enterPincode(commonMethods.Utility.readDataFromExcel(filePath,"Sheet5", 0, 1));
	addressDetailsPage.enterMobileNumber(commonMethods.Utility.readDataFromExcel(filePath,"Sheet5", 0, 2));

	addressDetailsPage.clickONNextButton();
	}

	@Test
	public void validateBanners() throws InterruptedException {
	Thread.sleep(4000);
	int bannerPlanNumbers = resultPage.getPlanNumersFromBanners();//actual
	int StringplanNumbers = resultPage.getPlanNumersFromString();//expected
	org.testng.Assert.assertEquals(StringplanNumbers, bannerPlanNumbers,"Plans on banners not matching with results, TC failed");

	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
    }
}
