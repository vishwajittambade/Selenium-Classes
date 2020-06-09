package vishwa1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");
		
		WebDriver bo=new ChromeDriver();
		
		bo.get("https://www.apple.com/");
		System.out.println("This is my First Program");
		bo.getCurrentUrl();
		System.out.println(bo.getCurrentUrl());
		bo.getTitle();
		System.out.println(bo.getTitle());
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
