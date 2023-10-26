package testng;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Proj1_Basics2 {

	@org.testng.annotations.BeforeClass
	public void BeforeClass() {
		System.out.println("I will execute 1st in the class");
	}

	@org.testng.annotations.BeforeMethod
	public void BeforeMethod() {
		System.out.println("I will before every methods in Basics2");
	}

	@BeforeSuite
	public void FirstInSuite() {
		System.out.println("I will execute first in the suite");
	}

	@Test
	public void ThirdMethod() {
		System.out.println("Good");
	}

	@Test(groups = { "Smoke" })
	public void FourthMethod() {
		System.out.println("Better");
	}

}
