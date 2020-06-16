package com.test;

import org.testng.annotations.Test;

public class InvocationcountFeature {
	
	@Test(invocationCount=5)
	public void sampleTest()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println("sum is::"+c );
	}

}
