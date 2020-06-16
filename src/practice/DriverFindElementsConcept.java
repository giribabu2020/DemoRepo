package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFindElementsConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//giribabu//Desktop//2020//softwaredownloads//chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		// find the number of links in a page
		  List<WebElement> linklist = driver.findElements(By.tagName("a"));
		  System.out.println("number of links"+linklist.size());
		// find the number of input tags
		  List<WebElement> inputlist = driver.findElements(By.tagName("button"));
		  System.out.println("number of input tags"+inputlist.size());
		  //print links using for loop
		  for(int i=0;i<linklist.size();i++)
			  System.out.println(linklist.get(i).getText());
		  
		
		Thread.sleep(10000);
		driver.quit();
	}

}
