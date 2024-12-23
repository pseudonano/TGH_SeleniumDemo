import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import paraBankAutomation.ParaBankAutomation;
import seleniumDemo.SeleniumDemo;

public class SelDemo{

	public static void main(String[] args) {
		WebDriver driver = null;
		try {
			driver = DriverSelector.getDriver("edge");
//			SeleniumDemo.runDemo(driver);
			ParaBankAutomation.runParaBankAutomation(driver);
		} finally {
			if (driver != null) {
				driver.quit();
			}
		}
		
	}

}
