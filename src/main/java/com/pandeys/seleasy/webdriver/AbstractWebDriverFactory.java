package com.pandeys.seleasy.webdriver;

import org.openqa.selenium.WebDriver;

public abstract class AbstractWebDriverFactory {
	abstract DriverFactory getWebDriverInstance(String browserName);
}
