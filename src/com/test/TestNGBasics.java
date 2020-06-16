package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	@BeforeSuite
	public void setUP()
	{
		System.out.println("set up system properties for google chrome");
	}
@BeforeClass
public void launchBrowser()
{
	System.out.println("launch browser");
}

@BeforeMethod
public void entertURL()
{
	System.out.println("enter url");	
}

@BeforeTest
public void login()
{
	System.out.println("login ");

}

@Test
public void googleTitleTest()
{
	System.out.println("Google title test");
}
@Test
public void googlesearchTest()
{
	System.out.println("Google search test");
}
@AfterTest
public void deleteCookies()
{
	System.out.println("delete all cookies");
}

@AfterMethod
public void logoutfromapp()
{
	System.out.println("logout from app");
	
}

@AfterClass
public void closeBrowser()
{
System.out.println("close browser");
}
@AfterSuite
public void generateReport()
{
System.out.println("generate report");	
}





}
