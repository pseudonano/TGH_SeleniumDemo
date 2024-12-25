package paraBankAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RequestLoan {
	private static final By REQUESTLOAN_LINK = By.cssSelector("a[href='requestloan.htm']");
	private static final By LOANAMOUNT_FIELD = By.cssSelector("#amount");
	private static final By DOWNPAYMENT_FIELD = By.cssSelector("#downPayment");
	private static final By FROMACCOUNTID_DROPDOWN = By.cssSelector("#fromAccountId");
	private static final By APPLY_BUTTON = By.cssSelector("input[value='Apply Now']");
	
	private static final By LOANRESTATUS_HEADER = By.cssSelector("#loanStatus");
	
	public static void runRequestLoan(WebDriver driver) {
		LoginLogout.loadPage(driver);
		LoginLogout.login(driver, "john", "demo");
		menuRequestLoan(driver);
		fillRequestLoanDetail(driver);
		Assert.assertEquals(driver.findElement(LOANRESTATUS_HEADER).getText(), "Success");
		LoginLogout.logout(driver);
		
	}
	
	public static void menuRequestLoan(WebDriver driver) {
		driver.findElement(REQUESTLOAN_LINK).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		try {
			Thread.sleep(Duration.ofSeconds(5));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void fillRequestLoanDetail(WebDriver driver) {
		driver.findElement(LOANAMOUNT_FIELD).sendKeys("1000");
		driver.findElement(DOWNPAYMENT_FIELD).sendKeys("1100");
		Select dropdown = new Select(driver.findElement(FROMACCOUNTID_DROPDOWN));
		dropdown.selectByIndex(0);
		driver.findElement(APPLY_BUTTON).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		try {
			Thread.sleep(Duration.ofSeconds(5));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	

}
