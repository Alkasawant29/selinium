package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterClass {
  @BeforeClass
  public void beforeclass()
  {
	  Reporter.log("before class is running", true);
  }
  @Test
  public void f()
  {
	Reporter.log("test method is running", true);  
  }
  @Test
  public void f1()
  {
	  Reporter.log("test method 1 is running", true);  
  }
  @AfterClass
  public void afterclass()
  {
	  Reporter.log("after class is running", true);  
  }
  @BeforeMethod
  public void beforemethod()
  {
	  Reporter.log("before method is running", true);  
  }
  @AfterMethod
  public void aftermethod()
  {
	  Reporter.log("after method is running", true);  
  }
  
  
  
  
}
