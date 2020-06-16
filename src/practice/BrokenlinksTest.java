package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;


public class BrokenlinksTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver","C://Users//giribabu//Desktop//2020//softwaredownloads//chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		List<WebElement> linksinpage = driver.findElements(By.tagName("a"));
		System.out.println("number of links in page::"+linksinpage.size());
		List<WebElement> Imgsinpage = driver.findElements(By.tagName("img"));
		System.out.println("number of images in page::"+Imgsinpage.size());
		linksinpage.addAll(Imgsinpage);
		List<WebElement> alist = new ArrayList<WebElement>();
		for(int i=0;i<linksinpage.size();i++)
			if(linksinpage.get(i).getAttribute("href")!=null)
				alist.add(linksinpage.get(i));
		
		System.out.println("total links::"+linksinpage.size()+"active links::"+alist.size());
		for(int i=0;i<alist.size();i++)
		{
		HttpURLConnection connection = (HttpURLConnection) new URL(alist.get(i).getAttribute("href")).openConnection();
		connection.connect();
		String response = connection.getResponseMessage();
		connection.disconnect();
		System.out.println(alist.get(i).getAttribute("href")+"---->"+response);
		
		}
		
		
		
		
	}

}
