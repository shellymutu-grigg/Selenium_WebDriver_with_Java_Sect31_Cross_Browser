package section31Code_cross_browser;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CrossBrowserTest {

	@Test
	public void titleCheck() {
		WebDriver webDriver = new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"), );
	}

}
