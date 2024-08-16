package verficationUsingTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
  @Test
  public void myTest() 
  {
	  String a= "Pune";
	  String b="Mumbai";
	  
	  SoftAssert soft=new SoftAssert();
	  soft.assertEquals(a,b,"a,b are not equal,TC is failed");
	  soft.assertNull(a,"a is not null,TC failed");
	  soft.assertAll();
  }
  @Test
  public void Test()
  {
	  boolean x=true;
	  SoftAssert soft=new SoftAssert();
	  soft.assertFalse(x,"x is true ,TC failed");
	  soft.assertAll();
  }
  
}
