package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityTest {
  @Test(priority=-4)
  public void d()
  {
	  Reporter.log("D method is running", true);
  }
  @Test(priority=1)
  public void b()
  {
	  Reporter.log("B method is running", true);  
  }
  @Test(priority=-2)
  public void a()
  {
	  Reporter.log("a method is running", true);  
  }
  @Test(priority=-1)
  public void c()
  {
	  Reporter.log("C method is running", true);  
  }
  
}
