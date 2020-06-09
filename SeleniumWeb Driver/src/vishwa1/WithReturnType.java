package vishwa1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");
		
		WebDriver bo=new ChromeDriver();
		
		bo.get("https://www.apple.com/");

	String	a=bo.getTitle();                 
	  String b=bo.getCurrentUrl();
	
	Navigation  c=bo.navigate();  
		
		c.refresh();
		c.to("https://www.redbus.in/");
		c.back();
		c.forward();
		
		
		
		
		
		
		
		
		
	}

}
