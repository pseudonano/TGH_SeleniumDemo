package paraBankAutomation;

import java.time.Duration;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register {
	
	public static String uniqueUsername = "user_" + UUID.randomUUID().toString().substring(0, 8);
	
	private static final By REGISTER_LINK = By.xpath("//a[normalize-space()='Register']");
	private static final By FIRSTNAME_FIELD = By.xpath("//input[@id='customer.firstName']");
	private static final By LASTNAME_FIELD = By.xpath("//input[@id='customer.lastName']");
	private static final By ADDRESS_FIELD = By.xpath("//input[@id='customer.address.street']");
	private static final By CITY_FIELD = By.xpath("//input[@id='customer.address.city']");
	private static final By STATE_FIELD = By.xpath("//input[@id='customer.address.state']");
	private static final By ZIPCODE_FIELD = By.xpath("//input[@id='customer.address.zipCode']");
	private static final By PHONE_FIELD = By.xpath("//input[@id='customer.phoneNumber']");
	private static final By SSN_FIELD = By.xpath("//input[@id='customer.ssn']");
	private static final By USERNAME_FIELD = By.xpath("//input[@id='customer.username']");
	private static final By PASSWORD_FIELD = By.xpath("//input[@id='customer.password']");
	private static final By CONFIRM_FIELD = By.xpath("//input[@id='repeatedPassword']");
	private static final By REGISTER_BUTTON = By.xpath("//input[@value='Register']");
	
public static void runRegister(WebDriver driver) {
	LoginLogout.loadPage(driver);
	clickRegister(driver);
	fillInfo(driver,"andi","888");
	clickSubmit(driver);
	LoginLogout.logout(driver);
}

private static void clickRegister(WebDriver driver) {
	driver.findElement(REGISTER_LINK).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}

private static void fillInfo(WebDriver driver,String stringVal, String intVal) {
	String currUsername = uniqueUsername;
	driver.findElement(FIRSTNAME_FIELD).sendKeys(stringVal);
	driver.findElement(LASTNAME_FIELD).sendKeys(stringVal);
	driver.findElement(ADDRESS_FIELD).sendKeys(stringVal);
	driver.findElement(CITY_FIELD).sendKeys(stringVal);
	driver.findElement(STATE_FIELD).sendKeys(stringVal);
	driver.findElement(ZIPCODE_FIELD).sendKeys(intVal);
	driver.findElement(PHONE_FIELD).sendKeys(intVal);
	driver.findElement(SSN_FIELD).sendKeys(intVal);
	driver.findElement(USERNAME_FIELD).sendKeys(currUsername);
	driver.findElement(PASSWORD_FIELD).sendKeys(currUsername);
	driver.findElement(CONFIRM_FIELD).sendKeys(currUsername);
	System.out.println(" > Successfully register with username: "+currUsername);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
}

private static void clickSubmit(WebDriver driver) {
	driver.findElement(REGISTER_BUTTON).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	try {
		Thread.sleep(Duration.ofSeconds(5));
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}