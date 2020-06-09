package vishwa1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\Driver exe\\\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();*/
		
		// Practice on 05/18/2020
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");
		
		WebDriver bo=new ChromeDriver();
		
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		bo.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
	String	v=bo.getTitle();
	System.out.println(v);
		
	if (bo.getTitle().equals("OrangeHRRM"))	{
		System.out.println("Test case is Pass");
		
	}
	else {
		System.out.println("Test case is Fail");
	}
	
	bo.close();
	
	

	}

}
