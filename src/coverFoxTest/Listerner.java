package coverFoxTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import coverFoxBase.Base;
import coverFoxUsingPOMandExcel.CoverFoxAdressDetailsPage;
import coverFoxUsingPOMandExcel.CoverFoxHomePage;
import coverFoxUsingPOMandExcel.CoverFoxMemberDetailsPage;
import coverFoxUsingPOMandExcel.CoverFoxResultPage;
import coverFoxUsingPOMandExcel.CoverFoxhealthPlanPage;
import coverFoxUtility.Utility;

@Listeners(coverFoxUtility.Listener.class)
public class Listerner extends Base 
{
	CoverFoxHomePage homePage;
	CoverFoxhealthPlanPage healthPlan;
	CoverFoxAdressDetailsPage addressPage;
	CoverFoxMemberDetailsPage memberePage;
	CoverFoxResultPage resultPage;
	String Filepath;

	@BeforeTest
	public void launchBrowser()
	{
		openBrowser();
		homePage = new CoverFoxHomePage(driver);
		healthPlan = new CoverFoxhealthPlanPage(driver);
		addressPage = new CoverFoxAdressDetailsPage(driver);
		memberePage= new CoverFoxMemberDetailsPage(driver);
		resultPage = new CoverFoxResultPage(driver);
		Filepath = "d:\\excel\\Stringdata.xlsx";
	}
	@BeforeClass
	public void preconditions() throws InterruptedException, IOException 
	{
		
		      // Home-Page
				Thread.sleep(1000);
				homePage=new CoverFoxHomePage(driver);
				homePage.clickOnGenderButton();

				// Health-Plan Page
				Thread.sleep(2000);
				healthPlan=new CoverFoxhealthPlanPage(driver);
				healthPlan.clickOnNextButton();

				// Member-details Page
				
	Thread.sleep(2000);
				memberePage =new CoverFoxMemberDetailsPage(driver);
		        
		        memberePage.handleAgeDropDown(Utility.readDataFromPropertiesFile("age"));
				memberePage.clickOnNextButton();;

				Thread.sleep(2000);

				// Address-Details Page
				addressPage=new CoverFoxAdressDetailsPage(driver);
				addressPage.enterPincode(Utility.readDataFromPropertiesFile("pincode"));
				addressPage.enterMobileNumber(Utility.readDataFromPropertiesFile("mobno"));
				addressPage.clickONNextButton();
	Thread.sleep(2000);
	}
	@Test
	public void validationBanners() throws InterruptedException
	{
		Thread.sleep(4000);
		Assert.fail();
		int bannerPlanNumber= resultPage.getPlanNumersFromBanners();
		int StringPlanNumbers = resultPage.getPlanNumersFromString();
		Assert.assertEquals(StringPlanNumbers,bannerPlanNumber,"Plan on banners not matching with result,TC failed");
		
	}
	@Test
	public void ChecksortPlan() throws InterruptedException 
	{
		Thread.sleep(4000);
//		Assert.fail();
		
	Assert.assertEquals(resultPage.is_displaySortPlan(),"Sort plan Dropdown is not display,TC is fail");
		
	}
	@AfterClass
	public void CloseBrowser()
	{
		driver.close();	
	}	
		
	}


