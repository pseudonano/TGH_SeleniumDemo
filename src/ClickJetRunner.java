import java.time.Duration;

import org.openqa.selenium.WebDriver;

import seleniumClickJetDemo.SeleniumDynamicDropdown;
import seleniumClickJetDemo.SeleniumStaticDropdown;
import seleniumClickJetDemo.SeleniumUpdatedDropdown;


public class ClickJetRunner {

	public static void main(String[] args) {
		WebDriver driver = null;
		try {
			driver = DriverSelector.getDriver("chrome");
			
//			SeleniumStaticDropdown.runSeleniumStaticDropdown(driver);
//			SeleniumUpdatedDropdown.runSeleniumUpdateDropdown(driver);
			SeleniumDynamicDropdown.runSeleniumDynamicDropdown(driver);
			
		} finally {
			if (driver != null) {
				driver.quit();
			}
		}

	}

}
