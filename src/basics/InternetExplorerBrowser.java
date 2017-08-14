package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C://IEDriver/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.nu.nl");
		
		driver.close();
	}

}
