package vishwa1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");
		
		WebDriver bo=new ChromeDriver();
		
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.cssSelector("input.logintext")).sendKeys("qaplanet1");
		bo.findElement(By.cssSelector("input[name=txtPassword]")).sendKeys("lab1");*/
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\Driver exe\\\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.cssSelector("input.loginText")).sendKeys("qaplanet1");
		bo.findElement(By.cssSelector("input[name=txtPassword]")).sendKeys("lab1");
		
		
		
		 
		
		
		
		
	}

}
