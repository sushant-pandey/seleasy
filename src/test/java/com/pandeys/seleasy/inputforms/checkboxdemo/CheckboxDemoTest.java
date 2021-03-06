package com.pandeys.seleasy.inputforms.checkboxdemo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pandeys.seleasy.home.HomePage;
import com.pandeys.seleasy.home.HomePageImpl;
import com.pandeys.seleasy.home.HomePagePopup;
import com.pandeys.seleasy.home.HomePagePopupImpl;
import com.pandeys.seleasy.home.slides.Slider;
import com.pandeys.seleasy.inputforms.CheckboxDemo;
import com.pandeys.seleasy.webdriver.WebDriverFactory;

public class CheckboxDemoTest {
	private WebDriver driver;
	private HomePagePopup homePagePopup;
	private HomePage homePage;
	private CheckboxDemo checkboxDemo;
	@BeforeClass
	public void getWebDriverInstance() {
		driver = new WebDriverFactory().getWebDriverInstance("CHROME").getDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		homePagePopup = new HomePagePopupImpl(driver);
		homePagePopup.waitForPopupToLoad();
		homePagePopup.closePopup();
		homePage = new HomePageImpl(driver);
		checkboxDemo = homePage.getNavigationBar().getInputForms().getCheckboxDemo();
		
	}

	@Test(timeOut = 10000)
	public void verifyPageHeader() {
		String displayedPageHeader = checkboxDemo.getPageHeader();
		assertEquals(displayedPageHeader, "This would be a basic example to start with checkboxes using selenium.");
	}

	@AfterClass
	public void closeWebDriver() {
		driver.close();
		driver.quit();
	}
}
