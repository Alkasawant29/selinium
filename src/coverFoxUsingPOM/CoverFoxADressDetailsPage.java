package coverFoxUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxADressDetailsPage 
{
	@FindBy(className="mp-input-text")private WebElement pincodebar;
	@FindBy(id="want-expert")private WebElement mobNumberField;
	@FindBy(className="next-btn")private WebElement next_button;
	
    public CoverFoxADressDetailsPage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    public void enterPincode()
    {
    	pincodebar.sendKeys("431602");
    }
    
    public void enterMobileNumber()
    {
    	mobNumberField.sendKeys("7058666860");
    }
    
    public void clickONNextButton()
    {
    	next_button.click();
    }
    
    
    
    
    
}
