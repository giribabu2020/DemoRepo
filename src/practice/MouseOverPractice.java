package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//giribabu//Desktop//2020//softwaredownloads//chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		/*driver.get("http://www.seleniumframework.com/Practiceform/");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("SELENIUM"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("selenium-java")).click();*/
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		Actions action1 = new Actions(driver);
		//action1.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']"))).
		//moveToElement(driver.findElement(By.xpath("//*[@id='droppable']"))).release().build().perform();
		//alternative way
		action1.dragAndDrop(driver.findElement(By.xpath("//*[@id='draggable']")), driver.findElement(By.xpath("//*[@id='droppable']"))).build().perform();
		
		

	}

}
