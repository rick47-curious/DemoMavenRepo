package com.mainbody;

import org.testng.Assert;


public class TestScenarios {

	
	
	public void introMessage() {
		System.out.println("This is an intro");
	}
	
	
	
	public void istTest() {
		Assert.assertEquals(7, 7);
		System.out.println("Test Case Executed");
	}
	
	
	
	public void secondTestCase() {
		System.out.println("Failed Test case");
		Assert.assertFalse(true);
	}
}
