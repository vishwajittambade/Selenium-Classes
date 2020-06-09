package passingValuefromConstructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	WebDriver bo;
	String url;

	void testcase1() {
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\Selenium\\\\\\\\Driver exe\\\\\\\\chromedriver.exe");
		bo = new ChromeDriver();

		bo.get(url);
	}

	public Login(String bpath) {
		url = bpath;
	}

	void testcase2() {
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\Selenium\\\\\\\\Driver exe\\\\\\\\chromedriver.exe");
		bo = new ChromeDriver();

		bo.get(url);
	}
	
}
