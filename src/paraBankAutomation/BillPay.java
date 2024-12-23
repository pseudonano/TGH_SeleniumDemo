package paraBankAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BillPay {
	public static final By BILLPAY_LINK = By.xpath("//a[@href='billpay.htm']");
	public static final By PAYEENAME_FIELD = By.xpath("//input[@name='payee.name']");
	public static final By ADDRESS_FIELD = By.xpath("//input[@name='payee.address.street']");
	public static final By CITY_FIELD = By.xpath("//input[@name='payee.address.city']");
	public static final By STATE_FIELD = By.xpath("//input[@name='payee.address.state']");
	public static final By ZIPCODE_FIELD = By.xpath("//input[@name='payee.address.zipCode']");
	public static final By PHONENUMBER_FIELD = By.name("payee.phoneNumber");
	public static final By ACCOUNT_FIELD = By.xpath("//input[@name='payee.accountNumber']");
	public static final By VERIFYACCOUNT_FIELD = By.xpath("//input[@name='verifyAccount']");
	public static final By AMOUNT_FIELD = By.xpath("//input[@name='amount']");
	public static final By FROMACCOUNTID_DROPDOWN = By.xpath("//select[@name='fromAccountId']");
	public static final By SENDPAYMENT_BUTTON = By.xpath("//input[@value='Send Payment']");
	
	public static void runBillPay(WebDriver driver) {
		LoginLogout.loadPage(driver);
		LoginLogout.login(driver, "john", "demo");
		menuBillPay(driver);
		fillDataBillPay(driver, "demo");
		LoginLogout.logout(driver);
	}
	
	public static void menuBillPay(WebDriver driver) {
		driver.findElement(BILLPAY_LINK).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void fillDataBillPay(WebDriver driver, String val) {
		driver.findElement(PAYEENAME_FIELD).sendKeys(val);
		driver.findElement(ADDRESS_FIELD).sendKeys(val);
		driver.findElement(CITY_FIELD).sendKeys(val);
		driver.findElement(STATE_FIELD).sendKeys(val);
		driver.findElement(ZIPCODE_FIELD).sendKeys(val);
		driver.findElement(PHONENUMBER_FIELD).sendKeys(val);
		driver.findElement(ACCOUNT_FIELD).sendKeys("13344");
		driver.findElement(VERIFYACCOUNT_FIELD).sendKeys("13344");
		driver.findElement(AMOUNT_FIELD).sendKeys("1");
		Select dropdownFromAccountId = new Select(driver.findElement(FROMACCOUNTID_DROPDOWN));
		dropdownFromAccountId.selectByIndex(0);
		driver.findElement(SENDPAYMENT_BUTTON).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
			Thread.sleep(Duration.ofSeconds(10));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
