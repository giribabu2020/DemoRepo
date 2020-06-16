package practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopupConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//giribabu//Desktop//2020//softwaredownloads//chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://www.popuptest.com");
		driver.findElement(By.linkText("Multi-PopUp Test")).click();
		Set <String>s = driver.getWindowHandles();
		Iterator<String> it = s.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		System.out.println("Child window title"+driver.getTitle());
		driver.close();
		driver.switchTo().window(parent);
		System.out.println("Parent window title"+driver.getTitle());
		
		
		
	
		

	}

}
