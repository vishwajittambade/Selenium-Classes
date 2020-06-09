package workingwithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void TestCase1() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");

		WebDriver bo = new ChromeDriver();

		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		String v = bo.getTitle();

		System.out.println(v);
		Assert.assertEquals(bo.getTitle(), "OrangeHRM");

		/*
		 * if (bo.getTitle().equals("OrangeHRM")) {
		 * 
		 * System.out.println("Pass");
		 * 
		 * } else { System.out.println("Fail");
		 * 
		 * }
		 */

		bo.close();

	}

	@Test
	void TestCase2() {

		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\Selenium\\\\\\\\Driver exe\\\\\\\\chromedriver.exe");
		WebDriver bo = new ChromeDriver();

		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qatesting");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		String massage = bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();

		System.out.println(massage);
		Assert.assertEquals(massage, "Invalid Login");
		bo.close();

	}

	@Test
	void TestCase3() {
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\Selenium\\\\\\\\Driver exe\\\\\\\\chromedriver.exe");
		WebDriver bo = new ChromeDriver();

		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qatesting");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		String massage = bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();

		System.out.println(massage);
		Assert.assertEquals(massage, "Invalid Login");

		bo.close();
	}

	@Test
	void TestCase4() {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\Driver exe\\\\chromedriver.exe");
		WebDriver bo = new ChromeDriver();

		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("textid");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("planet1");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		String massage = bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();

		System.out.println(massage);
Assert.assertEquals(massage, "Invalid Login");

		bo.close();
	}
	
	@Test
	void TestCase5() {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\Driver exe\\\\chromedriver.exe");
		WebDriver bo = new ChromeDriver();

		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		// bo.switchTo().alert().accept();//

		String a = bo.switchTo().alert().getText();

		System.out.println(a);
		Assert.assertEquals(a, "User Name not given!");

		bo.switchTo().alert().dismiss();
	}
}
