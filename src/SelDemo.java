import org.openqa.selenium.WebDriver;

import paraBankAutomation.BillPay;
import paraBankAutomation.OpenNewAccount;
import paraBankAutomation.Register;
import paraBankAutomation.TransferFunds;


public class SelDemo{


	public static void main(String[] args) {
		WebDriver driver = null;
		try {
			driver = DriverSelector.getDriver("chrome");
//			SeleniumDemo.runDemo(driver);
//			LoginLogout.runParaBankAutomation(driver);
//			Register.runRegister(driver);
//			OpenNewAccount.runOpenNewAccount(driver);
//			TransferFunds.runTransferFunds(driver);
			BillPay.runBillPay(driver);
		} finally {
			if (driver != null) {
				driver.quit();
			}
		}
		
	}

}
