package listfeild;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListFeildPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\Selenium\\\\\\\\Driver exe\\\\\\\\chromedriver.exe");
		WebDriver bo = new ChromeDriver();
		bo.get("https://chandanachaitanya.github.io/selenium-practice-site/");

    
		
		Select listfeild=new Select(bo.findElement(By.xpath("//select[@id='programming-languages']")));
		
//		listfeild.selectByIndex(5); 
		
//		listfeild.selectByVisibleText("C#");
		
	    
		listfeild.selectByValue("C#");
		
		
		
		
	}

}
