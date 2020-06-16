package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class WebDriverBasics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//giribabu//Desktop//2020//softwaredownloads//chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.name("firstname")).sendKeys("Giri");
		driver.findElement(By.name("lastname")).sendKeys("Babu");
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.xpath("//input[@value='7']")).click();
		driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
        // upload file using browse button 
		driver.findElement(By.name("photo")).sendKeys("C:\\Users\\giribabu\\Desktop\\codepractice.txt");
		
		Select select = new Select(driver.findElement(By.name("continents")));
		select.selectByVisibleText("Asia");
		Select select1 = new Select(driver.findElement(By.name("selenium_commands")));
		select1.selectByVisibleText("Wait Commands");
		select1.selectByVisibleText("Navigation Commands");
		Thread.sleep(5000);
		
		
		
		driver.quit();

	}

}