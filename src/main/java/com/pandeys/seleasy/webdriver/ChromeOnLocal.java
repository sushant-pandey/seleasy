package com.pandeys.seleasy.webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOnLocal {
	public ChromeDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		return driver;
	}
}
