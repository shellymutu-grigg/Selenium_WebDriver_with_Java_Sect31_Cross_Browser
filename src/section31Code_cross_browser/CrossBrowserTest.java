package section31Code_cross_browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CrossBrowserTest {

	@Test
	public void titleCheck() throws MalformedURLException {
		MutableCapabilities capabilities = new MutableCapabilities();

		WebDriver webDriver = new RemoteWebDriver(new URL("http://www.myexamplebrowserstack.com"), capabilities);
		webDriver.get("https://rahulshettyacademy.com");
		Assert.assertEquals(false, webDriver.getTitle()
				.matches("Selenium, API Testing, Software Testing & More QA Tutorials | Rahul Shetty Academy"));

		System.out.println(MessageFormat.format("The page title is: {0}", webDriver.getTitle()));
	}

}
