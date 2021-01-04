package com.pandeys.seleasy.webdriver;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory extends AbstractWebDriverFactory{

	@Override
	public DriverFactory getWebDriverInstance(String browserName) {
		if(browserName == null || browserName.equalsIgnoreCase(BrowserTypes.CHROME.toString())) {
			return new ChromeDriverFactory();
		}
		return null;
	}
	
}
