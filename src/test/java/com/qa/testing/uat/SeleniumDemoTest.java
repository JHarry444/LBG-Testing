package com.qa.testing.uat;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumDemoTest {

	private RemoteWebDriver driver = new ChromeDriver();

	@Test
	void seleniumTest() {
		// opens bing.com
		this.driver.get("http://www.bing.com");

	}
}
