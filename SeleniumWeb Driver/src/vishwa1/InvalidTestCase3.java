package vishwa1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidTestCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\Driver exe\\\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
	    //bo.switchTo().alert().accept();//
		
	String a =  bo.switchTo().alert().getText();
		
		System.out.println(a);		
		
		if (a.equals("User Name not given!")) {
			
			System.out.println("This Test Case is Pass");
		}
		
		else {
			
			System.out.println("This test case is Fail");
		}
		
		bo.switchTo().alert().dismiss();
		bo.close();
		
	}

}
