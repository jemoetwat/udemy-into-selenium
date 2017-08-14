package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C://GeckoDriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com");
		
		// identify by cssSelector. If attribute value is unique then it is 
		// not necessary to provide the tagname
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("abc");
		driver.findElement(By.cssSelector("input[class='input r4 wide mb16 mt8 username']")).sendKeys("def");
		
		// shortcut to identify by id = #id
		driver.findElement(By.cssSelector("#username")).sendKeys("ghi");
		
		// shortcut to identify by class = .classname. Replace every space in 
		// classname with a dot (.)
		driver.findElement(By.cssSelector(".input.r4.wide.mb16.mt8.username")).sendKeys("jkl");
		
		
	}

}
