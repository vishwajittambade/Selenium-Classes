package vishwa1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");
		
		WebDriver bo=new ChromeDriver();
		
		/* bo.get("https://www.facebook.com/");
		bo.getCurrentUrl();
		System.out.println(bo.getCurrentUrl());
		/*bo.getPageSource();
		System.out.println(bo.getPageSource()); */
		/*bo.getTitle();
		System.out.println(bo.getTitle());
		
		bo.navigate().to("https://www.redbus.in/");
		bo.navigate().back();
		bo.navigate().forward();
		bo.navigate().refresh();
		bo.close();*/
		
		bo.get("https://www.facebook.com/");
		bo.getCurrentUrl();
		System.out.println(bo.getCurrentUrl());
		/*bo.getPageSource();
		System.out.println(bo.getPageSource());*/
		bo.getTitle();
		System.out.println(bo.getTitle());
	
		bo.navigate().to("https://www.redbus.in/");
		bo.navigate().back();
		bo.navigate().forward();
		bo.navigate().refresh();
		bo.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
