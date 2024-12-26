package seleniumClickJetDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SeleniumStaticDropdown {
	public static final String BASE_URL = "https://rahulshettyacademy.com/dropdownsPractise/";
	
	public static final By CURRENCY_DROPDOWN = By.cssSelector("#ctl00_mainContent_DropDownListCurrency");
	
	
	public static void runSeleniumStaticDropdown(WebDriver driver) {
		driver.get(BASE_URL);
		WebElement	dropdownElement = driver.findElement(CURRENCY_DROPDOWN);
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByIndex(2);
		String selectedOption = dropdown.getFirstSelectedOption().getText();
		System.out.println(selectedOption);
		
		Assert.assertEquals(selectedOption, "AED");
		driver.quit();
		
	}
	

}
