package verficationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsNotEquals {
  @Test
  public void method()
  {
	 String a="Pune";
	 String b="Pune";
	 String c="Mumbai";
	 
	 //Assert.assertEquals(a,b,"value of a and b is not matching");
	 //Assert.assertEquals(a,b,"value of a and b is matching");
	  Assert.assertEquals(a,c,"value of a and c is matching");
  }
}
