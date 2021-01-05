package com.pandeys.seleasy;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pandeys.seleasy.home.HomePagePopup;
import com.pandeys.seleasy.home.HomePagePopupImpl;
import com.pandeys.seleasy.webdriver.WebDriverFactory;

import junit.framework.Assert;

public class SeleniumEasyHeaderTest {
	private WebDriver driver;
	private HomePagePopup homePagePopup;
	private SeleniumEasyHeader seleniumEasyHeader;
	
	@BeforeMethod
	public void getWebDriverInstance() {
		driver = new WebDriverFactory().getWebDriverInstance("CHROME").getDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		homePagePopup = new HomePagePopupImpl(driver);
		homePagePopup.waitForPopupToLoad();
		homePagePopup.closePopup();
	}
	
	@Test
	public void getSiteNameTest() {
		seleniumEasyHeader = new SeleniumEasyHeaderImpl(driver);
		String displayedSiteName = seleniumEasyHeader.getSiteName();
		Assert.assertEquals("Selenium Easy", displayedSiteName);
	}

	@Test
	public void getSiteSloganTest() {
		seleniumEasyHeader = new SeleniumEasyHeaderImpl(driver);
		String displayedSiteSlogan = seleniumEasyHeader.getSiteSlogan();
		Assert.assertEquals("Complete Automation Testing Tutorials", displayedSiteSlogan);
	}
	
	@AfterMethod
	public void closeWebDriver() {
		driver.close();
		driver.quit();
	}
}
