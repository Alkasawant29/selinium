package verficationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertDrawBack {
  @Test
  public void f() 
  {
	  String a="Pune";
	  String b="Mumbai";
	  
	  Assert.assertEquals(a,b,"a and b are equal,TC failed");
	  Assert.assertEquals(b,"b is null,TC is failed");
  }
}
