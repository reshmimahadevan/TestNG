package testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Proj1_Basics3 {

	@BeforeTest
	public void FirstExecution() {
		System.out.println("I will execute first in the test");
	}

	@AfterSuite
	public void FirstInSuite() {
		System.out.println("I will execute last in suite");
	}

	@org.testng.annotations.AfterMethod
	public void AfterMethod() {
		System.out.println("I will after every methods in Basics3");
	}

	@org.testng.annotations.AfterClass
	public void BeforeClass() {
		System.out.println("I will execute  last in the class");
	}
   
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod() {
		System.out.println("I will before every methods in Basics3");
	}

	@Test(groups = { "Smoke" })
	public void FifthMethod() {
		System.out.println("Best");
	}
	
	
	@Test(dataProvider="getData")
	public void SeventhMethod(String username,String pwd,String captcha) {
		System.out.println("Best");
		System.out.println(username);
		System.out.println(pwd);
		System.out.println(captcha);
	}

	@Parameters({ "URL", "UserID" })
	@Test
	public void SixthMethod(String url, String id) {
		System.out.println("Nice");
		System.out.println(url);
		System.out.println(id);
	}

	//Data drivern framework
	@DataProvider
	public Object[][] getData() {
		// i stands for number of times testcase should run
		// j stands for no of parametrs it should send for one go
		Object[][] data = new Object[3][3];
		data[0][0] = "1abcd";
		data[0][1] = "1xyz";
		data[0][2] = "1dsaf";

		data[1][0] = "2abcd";
		data[1][1] = "2xyz";
		data[1][2] = "2dsaf";

		data[2][0] = "3abcd";
		data[2][1] = "3xyz";
		data[2][2] = "3dsaf";

		return data;

	}

}
