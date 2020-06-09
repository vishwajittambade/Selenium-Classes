package workingwithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGFramework {
	WebDriver bo;
	String Buildpath = "http://apps.qaplanet.in/hrm/login.php";

	@Test(enabled = true, priority = 1, groups = "Login")
	public void TestCase1() {

		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		String v = bo.getTitle();

		System.out.println(v);
		Assert.assertEquals(bo.getTitle(), "OrangeHRM");

	}

	@Test(enabled = true, priority = 2, groups = "Login")
	void TestCase2() {

		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qatesting");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		String massage = bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();

		System.out.println(massage);
		Assert.assertEquals(massage, "Invalid Login");
	}

	@Test(enabled = true, priority = 3, groups = "Login")
	void TestCase3() {
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qatesting");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		String massage = bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();

		System.out.println(massage);
		Assert.assertEquals(massage, "Invalid Login");
	}

	@Test(enabled = true, priority =4 , groups = "Login")
	void TestCase4() {
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("textid");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("planet1");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		String massage = bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();

		System.out.println(massage);
		Assert.assertEquals(massage, "Invalid Login");
	}
	@Test(enabled = true, priority =4 , groups = "Login")
	void TestCase5() {
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		// bo.switchTo().alert().accept();//

		String a = bo.switchTo().alert().getText();

		System.out.println(a);
		Assert.assertEquals(a, "User Name not given!");
	}

	@BeforeMethod
	void BuildExecution() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");

		bo = new ChromeDriver();

		bo.get(Buildpath);
	}

	void BuildClose() {
		bo.close();
	}

}
