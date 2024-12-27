package seleniumClickJetDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumDynamicDropdown {
	private static final By FROM_DROPDOWN = By.id("ctl00_mainContent_ddl_originStation1_CTXT");
	private static final By SELECTFROM_VALUE = By.xpath("//a[@value='IXB']");
	private static final By IDXSELECTTO_VALUE = By.xpath("(//a[@value='BLR'][normalize-space()='Bengaluru (BLR)'])[2]");
	private static final By RELSELECTTO_VALUE = By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']");
	
	public static void runSeleniumDynamicDropdown(WebDriver driver) {
		driver.get(SeleniumStaticDropdown.BASE_URL);
		driver.findElement(FROM_DROPDOWN).click();
		driver.findElement(SELECTFROM_VALUE).click();
		try {
			Thread.sleep(Duration.ofSeconds(3));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		driver.findElement(IDXSELECTTO_VALUE).click();
		
		// using parent-child relationship
		driver.findElement(RELSELECTTO_VALUE).click();
		
	}

}
