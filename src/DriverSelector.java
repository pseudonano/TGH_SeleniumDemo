import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSelector {
public static WebDriver getDriver(String browser) {
	WebDriver driver;
	
	switch (browser.toLowerCase()) {
	case "chrome":
		System.setProperty("webdriver.chrome.driver", "/home/tegpam/applications/BrowserDriver/ChromeDriver/chromedriver");
//		ChromeDriverService service = new ChromeDriverService.Builder().usingPort(9515).build();
		driver = new ChromeDriver();
		break;
	case "firefox":
		System.setProperty("firefox.gecko.driver", "/home/tegpam/applications/BrowserDriver/FirefoxDriver/geckodriver");
		driver = new FirefoxDriver();
		break;
	case "edge":
		System.setProperty("firefox.edge.driver", "/home/tegpam/applications/BrowserDriver/EdgeDriver/msedgedriver");		
		driver = new EdgeDriver();
		break;
	default:
		throw new IllegalArgumentException("unsuported browser: "+browser);
		
	}
	//set browser behaviour
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	
	return driver;
}
}
