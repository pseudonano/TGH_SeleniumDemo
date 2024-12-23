import java.util.UUID;

import org.openqa.selenium.WebDriver;


import paraBankAutomation.Register;


public class SelDemo{


	public static void main(String[] args) {
		WebDriver driver = null;
		try {
			driver = DriverSelector.getDriver("chrome");
//			SeleniumDemo.runDemo(driver);
//			LoginLogout.runParaBankAutomation(driver);
			Register.runRegister(driver);
		} finally {
			if (driver != null) {
				driver.quit();
			}
		}
		
	}

}
