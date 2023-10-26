package testng;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Proj1_Basics1 {

	@Parameters({ "URL" })
	@Test(timeOut = 3000)
	public void FirstMethod(String urllink) {
		System.out.println("Hi");
		System.out.println(urllink);
	}

	@Test(groups = { "Smoke" })
	public void SecondMethod1() {
		System.out.println("Bye1");
		
	}

	@Test
	public void RegexMethod() {
		System.out.println("Bye2");

	}

	@Test
	public void RegexMethod1() {
		System.out.println("Bye3");
		
	}

	@AfterTest
	public void LastExecution() {
		System.out.println("I will execute last in the test");
	}

	@Test(dependsOnMethods = { "SecondMethod1" })
	public void SecondMethod2() {
		System.out.println("Bye4");
		Assert.assertTrue(false);
	}

}
