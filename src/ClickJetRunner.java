import java.time.Duration;

import org.openqa.selenium.WebDriver;

import seleniumClickJetDemo.SeleniumStaticDropdown;
import seleniumClickJetDemo.SeleniumUpdatedDropdown;


public class ClickJetRunner {

	public static void main(String[] args) {
		WebDriver driver = null;
		try {
			driver = DriverSelector.getDriver("chrome");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
//			SeleniumStaticDropdown.runSeleniumStaticDropdown(driver);
			SeleniumUpdatedDropdown.runSeleniumUpdateDropdown(driver);
			
			
		} finally {
			if (driver != null) {
				driver.quit();
			}
		}

	}

}
