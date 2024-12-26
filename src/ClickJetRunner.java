import java.time.Duration;

import org.openqa.selenium.WebDriver;

import seleniumClickJetDemo.SeleniumStaticDropdown;


public class ClickJetRunner {

	public static void main(String[] args) {
		WebDriver driver = null;
		try {
			driver = DriverSelector.getDriver("chrome");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			SeleniumStaticDropdown.runSeleniumStaticDropdown(driver);
			
			
			
		} finally {
			if (driver != null) {
				driver.quit();
			}
		}

	}

}
