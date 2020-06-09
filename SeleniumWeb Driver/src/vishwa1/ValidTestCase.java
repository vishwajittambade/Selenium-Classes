package vishwa1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// This is varified functionality of valid username and valid Password		
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");
		
		WebDriver bo=new ChromeDriver();
		
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
String  v=bo.getTitle();
		
		System.out.println(v);
		

		if (bo.getTitle().equals("OrangeHRM")) {
			
			System.out.println("Pass");
			
			}
		else { 
			System.out.println("Fail");
			
		}
		
		bo.close();  
		
		/* bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		bo.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
	String	a=bo.getTitle();
		
		System.out.println(a);
		
	  if (bo.getTitle().equals("OrangeHRM")) {
		  
		  System.out.println("Pass");
	  }
	  else {
		  System.out.println("Fail");
	  }

bo.close();*/
		
		
		
		
		
	}

}
