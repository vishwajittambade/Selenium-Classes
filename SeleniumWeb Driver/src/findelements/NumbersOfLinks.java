package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumbersOfLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\Selenium\\\\\\\\Driver exe\\\\\\\\chromedriver.exe");
		WebDriver bo = new ChromeDriver();
		bo.get("https://www.redbus.in/");

		bo.findElement(By.tagName("a"));
		bo.findElements(By.tagName("a"));

		List<WebElement> a = bo.findElements(By.tagName("a"));

		System.out.println(a.size());

		int t=a.size();
				for(int i=0; i<=t; i++) {
			
			System.out.println(a.get(i).getText());
			
			
		
			
		}
	
		
		
		
	}

}
