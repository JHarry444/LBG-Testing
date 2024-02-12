package com.qa.testing.uat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Selenium {

	private RemoteWebDriver driver;

	@BeforeEach
	void init() {
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
	}

	@Test
	void testForm() {
		this.driver.get("https://demoqa.com/automation-practice-form");

		WebElement cookies = this.driver.findElement(By.cssSelector(
				"body > div.fc-consent-root > div.fc-dialog-container > div.fc-dialog.fc-choice-dialog > div.fc-footer-buttons-container > div.fc-footer-buttons > button.fc-button.fc-cta-consent.fc-primary-button > p"));
		cookies.click();

		WebElement firstName = this.driver.findElement(By.cssSelector("#firstName"));
		firstName.sendKeys("Jordan");

		WebElement lastName = this.driver.findElement(By.cssSelector("#lastName"));
		lastName.sendKeys("Harrison");

		WebElement email = this.driver.findElement(By.cssSelector("#userEmail"));
		email.sendKeys("j@h.com");

//		WebElement gender = this.driver.findElement(By.cssSelector("#gender-radio-1"));
//		gender.click();

		WebElement mobile = this.driver.findElement(By.cssSelector("#userNumber"));
		mobile.sendKeys("0123456789");

		WebElement dob = this.driver.findElement(By.cssSelector("#dateOfBirthInput"));
		dob.click();
		dob.clear();
		while (!dob.getAttribute("value").isEmpty()) {
			dob.sendKeys(Keys.BACK_SPACE);
		}
//			dob.sendKeys("04 April 1994", Keys.ESCAPE);

//		WebElement subjects = this.driver.findElement(By.cssSelector("#subjectsInput"));
//		subjects.sendKeys("math", Keys.TAB);
//
//		WebElement address = this.driver.findElement(By.cssSelector("#currentAddress"));
//		address.sendKeys("123 fake street");
//
//		WebElement state = this.driver.findElement(By.cssSelector("#react-select-3-input"));
//		state.sendKeys("nc", Keys.TAB);
//
//		WebElement city = this.driver.findElement(By.cssSelector("#react-select-4-input"));
//		city.sendKeys("del", Keys.TAB);

	}

//	@Test
	void testTextBox() {
		this.driver.get("https://demoqa.com/text-box");

		WebElement cookies = this.driver.findElement(By.cssSelector(
				"body > div.fc-consent-root > div.fc-dialog-container > div.fc-dialog.fc-choice-dialog > div.fc-footer-buttons-container > div.fc-footer-buttons > button.fc-button.fc-cta-consent.fc-primary-button > p"));
		cookies.click();

		WebElement userName = this.driver.findElement(By.id("userName"));
		userName.sendKeys("barry");

		WebElement email = this.driver.findElement(By.id("userEmail"));
		email.sendKeys("barry@scott.com");

		WebElement currentAddress = this.driver.findElement(By.id("currentAddress"));
		currentAddress.sendKeys("123 fake street");

		WebElement permanentAddress = this.driver.findElement(By.id("permanentAddress"));
		permanentAddress.sendKeys("123 fake street");

		WebElement submit = this.driver.findElement(By.id("submit"));
		submit.click();

		WebElement name = this.driver.findElement(By.id("name"));

		Assertions.assertEquals("Name:barry", name.getText());
	}

//	@Test
	void testCheckBox() {
		this.driver.get("https://demoqa.com/checkbox");

		WebElement cookies = this.driver.findElement(By.cssSelector(
				"body > div.fc-consent-root > div.fc-dialog-container > div.fc-dialog.fc-choice-dialog > div.fc-footer-buttons-container > div.fc-footer-buttons > button.fc-button.fc-cta-consent.fc-primary-button > p"));
		cookies.click();

		WebElement home = this.driver.findElement(By.cssSelector("#tree-node > ol > li > span > button > svg"));
		home.click();

		WebElement desktop = this.driver
				.findElement(By.cssSelector("#tree-node > ol > li > ol > li:nth-child(1) > span > button > svg"));
		desktop.click();

		WebElement notes = this.driver.findElement(By.cssSelector(
				"#tree-node > ol > li > ol > li.rct-node.rct-node-parent.rct-node-expanded > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg"));
		notes.click();

		WebElement selected = this.driver.findElement(By.cssSelector("#result > span.text-success"));

		Assertions.assertEquals("notes", selected.getText());
	}

	@AfterEach
	void tearDown() {
//		this.driver.quit();
	}
}
