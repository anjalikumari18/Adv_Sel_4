package MavenTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParameterPassingTest
{

	@Test (groups = "RT")
	public void SendingParametersTest() {
		Reporter.log("This is for command line input",true);
		String URL=System.getProperty("url");
		String USERNAME = System.getProperty("user");
		String PASSWORD = System.getProperty("pass");
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
	}
	
	
	
}
