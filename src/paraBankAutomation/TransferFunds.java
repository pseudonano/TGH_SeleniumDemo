package paraBankAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TransferFunds {
	
	public static final By TRANSFERFUNDS_LINK = By.xpath("//a[normalize-space()='Transfer Funds']");
	public static final By AMOUNT_FIELD = By.xpath("//input[@id='amount']");
	public static final By FROMACCOUNTID_DROPDOWN = By.xpath("//select[@id='fromAccountId']");
	public static final By TOACCOUNTID_DROPDOWN = By.xpath("//select[@id='toAccountId']");
	public static final By TRANSFER_BUTTON = By.xpath("//input[@value='Transfer']");
	
	public static void runTransferFunds(WebDriver driver) {
		LoginLogout.loadPage(driver);
		LoginLogout.login(driver, "john", "demo");
		OpenNewAccount.menuOpenNewAccount(driver);
		transferFunds(driver);
		LoginLogout.logout(driver);
	}
	
	public static void transferFunds(WebDriver driver) {
		driver.findElement(TRANSFERFUNDS_LINK).click();
		driver.findElement(AMOUNT_FIELD).sendKeys("1");
		Select dropdownFromAccountId = new Select(driver.findElement(FROMACCOUNTID_DROPDOWN));
		dropdownFromAccountId.selectByIndex(0);
		Select dropdownToAccountId = new Select(driver.findElement(TOACCOUNTID_DROPDOWN));
		dropdownToAccountId.selectByIndex(1);
		driver.findElement(TRANSFER_BUTTON).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
			Thread.sleep(Duration.ofSeconds(30));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
