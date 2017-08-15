package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		//driver.findElement(By.linkText("   RADIO BUTTON")).click();
		driver.findElement(By.xpath("//input[@value='Milk']")).click();
		
		// count number of radiobuttons in group using findElements (plural)
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		System.out.println(count);
		
		// click butter without using value
		driver.findElements(By.xpath("//input[@name='group1']")).get(1).click();
		
		for (int i = 0 ; i < count ; i++){
			String val = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			System.out.println(i + " " + val);
			if (val.equals("Cheese")){
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}
		
	}

}
