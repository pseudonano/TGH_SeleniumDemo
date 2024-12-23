package paraBankAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ParaBankAutomation {
public static void runParaBankAutomation(WebDriver driver) {
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("john");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.xpath("//input[@value='Log In']")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
}
}
