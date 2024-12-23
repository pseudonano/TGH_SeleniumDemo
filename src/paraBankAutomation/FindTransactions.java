package paraBankAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FindTransactions {
	public static final By FINDTRANSACTIONS_LINK = By.xpath("//a[normalize-space()='Find Transactions']");
	public static final By SELECTACCOUNT_DROPDOWN = By.xpath("//select[@id='accountId']");
	public static final By TRANSACTIONDATE_FIELD = By.xpath("//input[@id='transactionDate']");
	public static final By FINDBYDATE_BUTTON = By.xpath("//button[@id='findByDate']");
	
	public static void runFindTransactions(WebDriver driver) {
		LoginLogout.loadPage(driver);
		LoginLogout.login(driver, "john", "demo");
		menuFindTransactions(driver);
		byTransactionDate(driver,"12-23-2024");
		LoginLogout.logout(driver);
	}
	
	public static void menuFindTransactions(WebDriver driver) {
		driver.findElement(FINDTRANSACTIONS_LINK).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void byTransactionDate(WebDriver driver, String date) {
		Select dropdownSelectAccount = new Select(driver.findElement(SELECTACCOUNT_DROPDOWN));
		dropdownSelectAccount.selectByIndex(0);
		driver.findElement(TRANSACTIONDATE_FIELD).sendKeys(date);
		driver.findElement(FINDBYDATE_BUTTON).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
			Thread.sleep(Duration.ofSeconds(10));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
