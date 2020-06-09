package Framework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login2 {

	String buildpath= "http://apps.qaplanet.in/hrm/login.php";
	WebDriver bo;
	void testcase1() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");

		 bo = new ChromeDriver();

		bo.get(buildpath);
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		String v = bo.getTitle();

		System.out.println(v);

		if (bo.getTitle().equals("OrangeHRM")) {

			System.out.println("Pass");

		} else {
			System.out.println("Fail");

		}

		bo.close();
		
	}
	
	void Testcase2() {
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\Selenium\\\\\\\\Driver exe\\\\\\\\chromedriver.exe");
		bo = new ChromeDriver();

		bo.get(buildpath);
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qatesting");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		String massage = bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();

		System.out.println(massage);

		if (massage.equals("Invalid Login")) {
			System.out.println("This Case Test is Pass");
		} else {
			System.out.println("This Test Case is Fail");
		}

		bo.close();
	}
	
	void TestCase3() {
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\Selenium\\\\\\\\Driver exe\\\\\\\\chromedriver.exe");
		bo = new ChromeDriver();

		bo.get(buildpath);
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qatesting");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		String massage = bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();

		System.out.println(massage);

		if (massage.equals("Invalid Login")) {
			System.out.println("This Case Test is Pass");
		} else {
			System.out.println("This Test Case is Fail");
		}

		bo.close();
	}
	
	void TestCase4() {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\Driver exe\\\\chromedriver.exe");
		bo = new ChromeDriver();

		bo.get(buildpath);
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("textid");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("planet1");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		String massage = bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();

		System.out.println(massage);

		if (massage.equals("Invalid Login")) {
			System.out.println("This Test Case is Pass");

		} else {
			System.out.println("This Test Case is Fail");
		}

		bo.close();
	}
	
      void TestCase5() {
    	  System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\Driver exe\\\\chromedriver.exe");
  		bo = new ChromeDriver();

  		bo.get(buildpath);
  		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("");
  		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("");
  		bo.findElement(By.xpath("//input[@name='Submit']")).click();
  		// bo.switchTo().alert().accept();//

  		String a = bo.switchTo().alert().getText();

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
