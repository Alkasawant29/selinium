package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InvocationCountTest {
  @Test(invocationCount=4)
  public void myTest()
  {
	  Reporter.log("mytest is running", true);  
  }
  @AfterMethod
  public void aftermethod()
  {
	  System.out.println("after method is running");
  }
}
