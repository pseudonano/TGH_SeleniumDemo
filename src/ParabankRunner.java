import java.time.Duration;

import org.openqa.selenium.WebDriver;

import paraBankAutomation.BillPay;
import paraBankAutomation.FindTransactions;
import paraBankAutomation.LoginLogout;
import paraBankAutomation.OpenNewAccount;
import paraBankAutomation.Register;
import paraBankAutomation.TransferFunds;
import paraBankAutomation.UpdateContactInfo;


public class ParabankRunner{


	public static void main(String[] args) {
		WebDriver driver = null;
		try {
			driver = DriverSelector.getDriver("chrome");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
//			SeleniumDemo.runDemo(driver);
			LoginLogout.runParaBankAutomation(driver);
//			Register.runRegister(driver);
//			OpenNewAccount.runOpenNewAccount(driver);
//			TransferFunds.runTransferFunds(driver);
//			BillPay.runBillPay(driver);
//			FindTransactions.runFindTransactions(driver);
//			UpdateContactInfo.runUpdateContactInfo(driver);
		} finally {
			if (driver != null) {
				driver.quit();
			}
		}
		
	}

}
