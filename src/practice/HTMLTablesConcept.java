package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class HTMLTablesConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//giribabu//Desktop//2020//softwaredownloads//chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		String city = driver.findElement(By.xpath("//table/tbody/tr/td[1]")).getText();
		System.out.println(city);
		List<WebElement> headerlist = driver.findElements(By.xpath("//table/tbody/tr/th"));
		System.out.println(headerlist.size());
		for(int i=0;i<headerlist.size();i++)
			System.out.println(headerlist.get(i).getText());
		String total=driver.findElement(By.xpath("//table/tfoot/tr")).getText();
		System.out.println(total);
		
		
	}

}
