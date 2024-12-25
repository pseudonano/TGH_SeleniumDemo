package paraBankAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UpdateContactInfo {
	private static final By UPDATECONTACTINFO_LINK = By.xpath("//a[normalize-space()='Update Contact Info']");
	private static final By FIRSTNAME_FIELD = By.xpath("//input[@id='customer.firstName']");
	private static final By LASTNAME_FIELD = By.xpath("//input[@id='customer.lastName']");
	private static final By ADDRESS_FIELD = By.xpath("//input[@id='customer.address.street']");
	private static final By CITY_FIELD = By.xpath("//input[@id='customer.address.city']");
	private static final By STATE_FIELD = By.xpath("//input[@id='customer.address.state']");
	private static final By ZIPCODE_FIELD = By.xpath("//input[@id='customer.address.zipCode']");
	private static final By PHONENUMBER_FIELD = By.xpath("//input[@id='customer.phoneNumber']");
	private static final By UPDATEPROFILE_BUTTON = By.cssSelector("input[value='Update Profile']");
	
	private static final By TITLEMENU_HEADER = By.xpath("//h1[normalize-space()='Update Profile']");
	private static final By PROFILEUPDATED_HEADER = By.cssSelector("div[id='updateProfileResult'] h1[class='title']");
	
	
	public static void runUpdateContactInfo(WebDriver driver) {
		LoginLogout.loadPage(driver);
		LoginLogout.login(driver, "s", "s");
//		Register.clickRegister(driver);
//		Register.fillInfo(driver,"andi","888");
//		Register.clickSubmit(driver);
		menuUpdateContactInfo(driver);
		fillUpdateContactInfo(driver);
		clickUpdateProfile(driver);

		LoginLogout.logout(driver);
	}
	
	public static void menuUpdateContactInfo(WebDriver driver) {
		driver.findElement(UPDATECONTACTINFO_LINK).click();
		Assert.assertEquals(driver.findElement(TITLEMENU_HEADER).getText(), "Update Profile");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void fillUpdateContactInfo(WebDriver driver) {
		fillHelper(driver,FIRSTNAME_FIELD,"updated ");
		fillHelper(driver,LASTNAME_FIELD, "updated ");
		fillHelper(driver,ADDRESS_FIELD, "updated ");
		fillHelper(driver,CITY_FIELD, "updated ");
		fillHelper(driver,STATE_FIELD, "updated ");
		fillHelper(driver,ZIPCODE_FIELD, "updated ");
		fillHelper(driver,PHONENUMBER_FIELD, "updated ");

		try {
			Thread.sleep(Duration.ofSeconds(10));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void clickUpdateProfile(WebDriver driver) {
		driver.findElement(UPDATEPROFILE_BUTTON).click();
		try {
			Thread.sleep(Duration.ofSeconds(15));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(driver.findElement(PROFILEUPDATED_HEADER).getText(), "Profile Updated");
	}
	
	public static void fillHelper(WebDriver driver, By field, String updatedVal) {
		driver.findElement(field).clear();
		driver.findElement(field).sendKeys(updatedVal);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	

}
