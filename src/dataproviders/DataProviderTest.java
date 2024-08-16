package dataproviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
  @DataProvider(name ="teacher")
  public String[][] myData()
  {
	  String data[][]= {{"Balaji","Sawant","7058999860"},{"Kranti","Sawant","8690053282"},{"prem","Lokhande","9675483933"}};
	  return data;
  }
  
  @DataProvider(name="Student")
  public String[][]myData1()
  {
	String data[][]= {{"Alka","Athawale","7058006860"},{"Ashish","Athawale","8698753283"},{"Advika","Athawale","9675773933"}};
	return data;
  }
}
