package com.test;

import org.testng.annotations.Test;

public class TestNGfeatures {

	@Test
	public void loginTest() {
		System.out.println(" login page test");
		int i=5/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homepageTest() {
		System.out.println(" home page test ");
	}
	
}
