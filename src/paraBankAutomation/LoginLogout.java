package paraBankAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginLogout {
	public static final String BASE_URL = "https://parabank.parasoft.com/parabank/index.htm";
	private static final By USERNAME_FIELAD = By.xpath("//input[@name='username']");
	private static final By PASSWORD_FIELD = By.xpath("//input[@name='password']");
	private static final By BUTTON_LOGIN = By.xpath("//input[@value='Log In']");
	private static final By LOGOUT_LINK = By.xpath("//a[normalize-space()='Log Out']");
	
public static void runParaBankAutomation(WebDriver driver) {
	loadPage(driver);
	login(driver,"s","s");
	logout(driver);
}
public static void loadPage(WebDriver driver) {
	driver.get(BASE_URL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	try {
		Thread.sleep(Duration.ofSeconds(5));
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public static void login(WebDriver driver, String username, String password) {
	driver.findElement(USERNAME_FIELAD).sendKeys(username);
	driver.findElement(PASSWORD_FIELD).sendKeys(password);
	driver.findElement(BUTTON_LOGIN).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	try {
		Thread.sleep(Duration.ofSeconds(5));
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public static void logout(WebDriver driver) {
	driver.findElement(LOGOUT_LINK).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	try {
		Thread.sleep(Duration.ofSeconds(5));
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}

