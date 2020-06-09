package passingValuefromConstructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin {

	
	WebDriver bo;
	String url;

	void testcase501() {
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\Selenium\\\\\\\\Driver exe\\\\\\\\chromedriver.exe");
		bo = new ChromeDriver();

		bo.get(url);
	}

	public Admin(String bpath) {
		url = bpath;
	}
	
	
	
}
