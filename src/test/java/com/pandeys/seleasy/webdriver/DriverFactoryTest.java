package com.pandeys.seleasy.webdriver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DriverFactoryTest {
//	@Test
	public void testDriverFactory() throws InterruptedException {
		WebDriver driver = new WebDriverFactory().getWebDriverInstance(BrowserTypes.CHROME.toString()).getDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		Thread.sleep(5000);
		
		driver.close();
	}
}
