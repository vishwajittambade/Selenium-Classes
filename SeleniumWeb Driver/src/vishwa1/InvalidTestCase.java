package vishwa1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// This Verified Functionality of login button with valid UserId and Invalid Password
	System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\Driver exe\\\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		
		bo.get("http://apps.qaplanet.in/hrm/login.php");	
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("aaa");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
String massage = bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();
	  
		System.out.println(massage);
	if (massage.equals("Invalid Login")) {
		System.out.println("Test Case is Pass");
	}
	else {
		System.out.println("Test Case is Fail");
	}
		bo.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
