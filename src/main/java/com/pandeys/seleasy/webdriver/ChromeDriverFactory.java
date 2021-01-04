package com.pandeys.seleasy.webdriver;

import org.openqa.selenium.WebDriver;

public class ChromeDriverFactory implements DriverFactory{

	@Override
	public WebDriver getDriver() {
		return new ChromeOnLocal().getChromeDriver();
	}
	
}
