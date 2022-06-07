import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WDMPractice {

	public static void main(String[] args) {

		try {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("ensureCleanSession", true);
			capabilities.setBrowserName("internet explorer");
			WebDriverManager.iedriver().driverVersion("4.0").setup();
			WebDriver driver = new InternetExplorerDriver(capabilities);
			driver.get("https://www.yahoo.com/");
			System.out.println(driver.getTitle());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
