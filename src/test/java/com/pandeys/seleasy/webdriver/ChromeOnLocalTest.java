package com.pandeys.seleasy.webdriver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ChromeOnLocalTest {

//	@Test
	public void getChromeDriverTest() {
		ChromeOnLocal chromeOnLocal = new ChromeOnLocal();
		WebDriver driver = chromeOnLocal.getChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
	}
}
