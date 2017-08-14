package basics;





import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://GeckoDriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.nu.nl");
		
		//find all links in the web page
		WebElement allLinkElements = driver.findElement(By.xpath("//a"));
		
		//give the total number of links found
		Dimension linkListCount = allLinkElements.getSize();
		
		//print the number of links found
		System.out.println("Total number of links found: " + linkListCount);
		
	}

}
