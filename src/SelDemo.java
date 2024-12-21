import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelDemo{

	public static void main(String[] args) {
		// invoke BrowserDriver
		// the object are WebDriver instead of ChromeDriver because we need to implement it on other browser as well
		// we can let Selenium Manager(access web-download driver-open) or we can set using System.setProperty to invoke the browser(download manually)

//		System.setProperty("webdriver.chrome.driver", "/home/tegpam/applications/BrowserDriver/ChromeDriver/chromedriver");
//		ChromeDriverService service = new ChromeDriverService.Builder().usingPort(9515).build();
//		WebDriver driver = new ChromeDriver();
		
		
		System.setProperty("firefox.gecko.driver", "/home/tegpam/applications/BrowserDriver/FirefoxDriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://google.com");
		String x =driver.getTitle();
		System.out.println(x);
		String y = driver.getCurrentUrl();
		System.out.println(y);
		driver.quit();
		

	}

}
