package com.testDriver;



import org.testng.annotations.*;

import com.mainbody.TestScenarios;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class TestDriver {
	TestScenarios obj;
	
	@BeforeMethod
	public void LoadingInitializer() {
		obj  = new TestScenarios();
	}
	
	@Test(priority=1,description = "Intro")
	@Severity(SeverityLevel.NORMAL)
	@Description("Intro method")
	@Story("TO check the Intro")
	public void introTest() {
	obj.introMessage();
	}
	
	@Test(priority =2 ,description = "First Testcase")
	@Severity(SeverityLevel.BLOCKER)
	@Description("First TestCase Containing Assertion")
	@Story("Checking the First Test case")
	public void testCase1() {
		obj.istTest();
	}
	
	@Test(priority = 3 , description = "Second Testcase")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Second Test case containinng Assertion")
	@Story("Checking the Second Testcase")
	public void testCase2() {
		obj.secondTestCase();
	}
}
