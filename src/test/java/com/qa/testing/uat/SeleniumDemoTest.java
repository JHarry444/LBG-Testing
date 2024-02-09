package com.qa.testing.uat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumDemoTest {

	private RemoteWebDriver driver;

	@BeforeEach // runs before EACH test
	void init() {
		// creates a new chrome window
		ChromeOptions opts = new ChromeOptions();
//		opts.addArguments("--headless=new");

		this.driver = new ChromeDriver(opts);
		// sets it to fullscreen
		this.driver.manage().window().maximize();
	}

	@Test
	void seleniumTest() {
		// opens bing.com
		this.driver.get("http://www.bing.com");
	}

	@Test
	void textBoxTest() {
		this.driver.get("https://demoqa.com/text-box");

		WebElement consent = this.driver.findElement(By.cssSelector(
				"body > div.fc-consent-root > div.fc-dialog-container > div.fc-dialog.fc-choice-dialog > div.fc-footer-buttons-container > div.fc-footer-buttons > button.fc-button.fc-cta-consent.fc-primary-button"));
		consent.click();

		WebElement fullName = this.driver.findElement(By.id("userName"));
		fullName.sendKeys("Barry");

		WebElement submit = this.driver.findElement(By.id("submit"));
		submit.click();

		WebElement display = this.driver.findElement(By.id("name"));

		Assertions.assertEquals(true, display.getText().contains("Barry"));

	}

	@AfterEach
	void tearDown() {
		this.driver.quit();
	}
}
