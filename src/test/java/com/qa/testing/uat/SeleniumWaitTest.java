package com.qa.testing.uat;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitTest {

	private RemoteWebDriver driver;
	private WebDriverWait wait;

	@BeforeEach
	void init() {
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		// Waits UP TO this amount of time
		// Does this for EVERY ELEMENT
		// Implicit Waits
//		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3_000));
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(3));

	}

	@Test
	void test() {
		this.driver.get("http://127.0.0.1:5500/index.html");

		WebElement title = this.driver.findElement(By.tagName("h1"));
		Assertions.assertEquals("Title", title.getText());

		WebElement name = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#output p")));

		Assertions.assertEquals("Name: JORDAN", name.getText());
	}

}
