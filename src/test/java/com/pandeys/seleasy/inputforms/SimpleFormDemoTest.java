package com.pandeys.seleasy.inputforms;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pandeys.seleasy.home.HomePage;
import com.pandeys.seleasy.home.HomePageImpl;
import com.pandeys.seleasy.home.HomePagePopup;
import com.pandeys.seleasy.home.HomePagePopupImpl;
import com.pandeys.seleasy.webdriver.WebDriverFactory;

public class SimpleFormDemoTest {
	private WebDriver driver;
	private HomePagePopup homePagePopup;
	private HomePage homePage;
	private SimpleFormDemo simpleFormDemo;
	
	@BeforeClass
	public void getWebDriverInstance() {
		driver = new WebDriverFactory().getWebDriverInstance("CHROME").getDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		homePagePopup = new HomePagePopupImpl(driver);
		homePagePopup.waitForPopupToLoad();
		homePagePopup.closePopup();
		homePage = new HomePageImpl(driver);
//		homePage.getNavigationBar().getInputForms();
		simpleFormDemo = homePage.getNavigationBar().getInputForms().getSimpleFormDemo();
		
	}

	@Test(timeOut = 10000)
	public void verifyPageHeader() {
		String pageHeader = simpleFormDemo.getPageHeader();
		Assert.assertEquals(pageHeader, "This would be your first example to start with Selenium.");
	}

	@AfterClass
	public void closeWebDriver() {
		driver.close();
		driver.quit();
	}
}
