package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GooglefeatureTest {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C://Users//giribabu//Desktop//2020//softwaredownloads//chromedriver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	@Test(priority=1, groups="smoke")
	public void getPageTitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Googlee","title not matched");
		
	}
	@Test(priority=3,groups="smoke")
	public void checkLogo()
	{
	boolean b=	driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
	System.out.println(b);
	}
	
	@Test(priority=2,groups="smoke")
	public void checkMailLink()
	{
	boolean b1=	driver.findElement(By.linkText("Gmmail")).isDisplayed();
	System.out.println(b1);
	}
	@Test(priority=1,groups="regression")
	public void test4() {
		System.out.println(" test 4");
	}
	
	@Test(priority=2,groups="regression")
	public void test5() {
		System.out.println(" test 5");
	}
	@Test(priority=3,groups="regression")
	public void test6() {
		System.out.println(" test 6");
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
