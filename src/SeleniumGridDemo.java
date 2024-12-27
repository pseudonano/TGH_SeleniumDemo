import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridDemo {

	public static void main(String[] args) {
		WebDriver driver = null;
		
		try	{
			// set host URL
			URL hubUrl = new URL("http://localhost:4444/wd/hub");
			
			// set desired capabilities
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.LINUX);
			
			// initialize remote driver
			driver = new RemoteWebDriver(hubUrl, capabilities);
			
			// perform test
			driver.get("https://google.com");
			String title = driver.getTitle();
			System.out.println("	>>> Page Title is: "+title);
			
		} catch (MalformedURLException e) {
			System.out.println("Invalid Hub URL: " + e.getMessage());
		} finally {
            if (driver != null) {
                driver.quit();
            }
		}

	}

}
