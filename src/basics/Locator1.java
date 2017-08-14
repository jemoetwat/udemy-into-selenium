package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://GeckoDriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		//driver.findElement(By.xpath("//*[@id='gs_htif0']")).clear();
		//driver.findElement(By.xpath("//*[@id='gs_htif0']")).sendKeys("test");
		//driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[2]")).click();
		//driver.findElement(By.id("email")).sendKeys("b.pouw@ziggo.nl");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test");;
		driver.findElement(By.id("pass")).sendKeys("12345");
		//driver.findElement(By.linkText("Account vergeten?")).click();
		//driver.findElement(By.partialLinkText("Account ")).click();
		driver.findElement(By.xpath(".//div[@id='reg_form_box']/div[1]/div[1]/div[1]/div/div/input")).sendKeys("Bas");
		//driver.findElement(By.id("loginbutton")).click();
		//driver.findElement(By.xpath("//input[@data-testid='royal_login_button']")).click();
		
		//driver.quit();
		
	}

}
