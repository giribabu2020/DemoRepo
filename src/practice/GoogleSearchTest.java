package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//giribabu//Desktop//2020//softwaredownloads//chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://google.co.in");
		driver.findElement(By.name("q")).sendKeys("testing");
		//List<WebElement> res= driver.findElements(By.xpath("//li[@role='presentation']/div[@class,'sbl1']"));
		//for(int i=0;i<res.size();i++)
		//{
		//System.out.println(res.get(i).getText());
		//res.get(i).click();
		
		//}
		driver.findElement(By.xpath("*//div[@class='sbl1']")).click();
			
		Thread.sleep(5000);
		
	}

}
