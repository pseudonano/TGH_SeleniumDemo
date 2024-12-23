package paraBankAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenNewAccount {
	private static final By OPENNEWACCOUNT_LINK = By.xpath("//a[normalize-space()='Open New Account']");
	private static final By ACCOUNTTYPE_DROPDOWN = By.xpath("//select[@id='type']");
	private static final By FROMACCOUNTID_DROPDOWN = By.xpath("//select[@id='fromAccountId']");
	private static final By OPENNEWACCOUNT_BUTTON = By.xpath("//input[@value='Open New Account']");
	
	public static void runOpenNewAccount(WebDriver driver) {
		LoginLogout.loadPage(driver);
		LoginLogout.login(driver, "john", "demo");
		menuOpenNewAccount(driver);
		LoginLogout.logout(driver);
		
	}

	public static void menuOpenNewAccount(WebDriver driver) {
		driver.findElement(OPENNEWACCOUNT_LINK).click();
		Select dropdownAccountType = new Select(driver.findElement(ACCOUNTTYPE_DROPDOWN));
		dropdownAccountType.selectByIndex(1);
		Select dropdownFromAccountId = new Select(driver.findElement(FROMACCOUNTID_DROPDOWN));
		dropdownFromAccountId.selectByIndex(0);
		driver.findElement(OPENNEWACCOUNT_BUTTON).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
			Thread.sleep(Duration.ofSeconds(30));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
