package seleniumDemo;

import org.openqa.selenium.WebDriver;

public class SeleniumDemo {
public static void runDemo(WebDriver driver) {
	driver.get("https://google.com");
	String x =driver.getTitle();
	System.out.println(x);
	String y = driver.getCurrentUrl();
	System.out.println(y);
}
}
