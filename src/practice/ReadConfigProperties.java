package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigProperties {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C://Users//giribabu//eclipse-workspace//SeleniumPractice//src//practice//config.properties");
	    prop.load(fis);
	    System.out.println(prop.getProperty("url"));
	    System.out.println(prop.getProperty("browser"));
	    
		
		

	}

}
