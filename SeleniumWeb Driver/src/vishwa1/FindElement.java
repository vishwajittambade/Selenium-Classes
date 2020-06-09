package vishwa1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");
		
		WebDriver bo=new ChromeDriver();
		
		/*bo.get("http://apps.qaplanet.in/hrm/login.php");
		
        bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		
		bo.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
		bo.close();*/
		
		bo.get("https://www.scrum.org/professional-scrum-certifications/professional-scrum-master-assessments");
		bo.findElement(By.xpath("//a[contains(text(),'login')]")).click();
		bo.findElement(By.xpath("//input[@id='edit-name']")).sendKeys("vishwajit.tambade@gmail.com");
		bo.findElement(By.xpath("//input[@id='edit-pass']")).sendKeys("Narendra@999");
		bo.findElement(By.xpath("//input[@id='edit-submit--2']")).click();
		bo.findElement(By.xpath("//a[contains(text(),'logout')]")).click();
		
	
		
		
		
		
		
		
		
	}

}
