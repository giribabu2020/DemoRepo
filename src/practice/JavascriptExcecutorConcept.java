package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class JavascriptExcecutorConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//giribabu//Desktop//2020//softwaredownloads//chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("https://freecrm.co.in/");
			System.out.println("before login title of page "+driver.getTitle());
			driver.findElement(By.xpath("//span[text()='Log In']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("giri1209@gmail.com");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Transform@2020");
			driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
			System.out.println("After login title of page "+driver.getTitle());
			JavascriptExecutor js = (JavascriptExecutor)driver;
			//js.executeScript("alert('alert text')");
			js.executeScript("history.go(0)");
			String title = js.executeScript("return document.title;").toString();
			System.out.println("page title::"+title);
			js.executeScript("window.scrollBy(0, 550)");
	
			Thread.sleep(4000);
	}

}
