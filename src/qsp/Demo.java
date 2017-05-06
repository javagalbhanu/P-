package qsp;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {
	@Parameters({"city","area"})
	@Test
	public void testA(String city,String area){
		Reporter.log(city+area,true);
	}
}
