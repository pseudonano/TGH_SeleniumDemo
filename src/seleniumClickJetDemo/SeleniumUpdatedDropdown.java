package seleniumClickJetDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SeleniumUpdatedDropdown {
	private static final By PASSENGERS_DROPDOWN = By.cssSelector("#divpaxinfo");
	private static final By ADULTPLUS_BUTTON = By.cssSelector("#hrefIncAdt");
	private static final By DROPDOWNDONE_BUTTON = By.cssSelector("#btnclosepaxoption");
	private static final By UPDATEDVALUE = By.cssSelector("#divpaxinfo");
	
	
	public static void runSeleniumUpdateDropdown(WebDriver driver) {
		driver.get(SeleniumStaticDropdown.BASE_URL);
		driver.findElement(PASSENGERS_DROPDOWN).click();
		int i = 1;
		while (i<5) {
			driver.findElement(ADULTPLUS_BUTTON).click();
			i++;
		}
		String UpdatedValue = driver.findElement(UPDATEDVALUE).getText();
		System.out.println(UpdatedValue);
		try {
			Thread.sleep(Duration.ofSeconds(10));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(UpdatedValue, "5 Adult");
		driver.findElement(DROPDOWNDONE_BUTTON).click();
		driver.quit();
		
		
		
	}

}
