package com.pandeys.seleasy.inputforms.radiobuttondemo;

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
import com.pandeys.seleasy.inputforms.CheckboxDemo;
import com.pandeys.seleasy.inputforms.RadioButtonsDemo;
import com.pandeys.seleasy.webdriver.WebDriverFactory;

public class RadioButtonsDemoTest {
	private WebDriver driver;
	private HomePagePopup homePagePopup;
	private HomePage homePage;
	private RadioButtonsDemo radioButtonsDemo ;
	@BeforeClass
	public void getWebDriverInstance() {
		driver = new WebDriverFactory().getWebDriverInstance("CHROME").getDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		homePagePopup = new HomePagePopupImpl(driver);
		homePagePopup.waitForPopupToLoad();
		homePagePopup.closePopup();
		homePage = new HomePageImpl(driver);
		radioButtonsDemo = homePage.getNavigationBar().getInputForms().getRadioButtonsDemo();
		
	}

	@Test(timeOut = 10000)
	public void verifyPageHeader() {
		String displayedPageHeader = radioButtonsDemo.getPageHeader();
		assertEquals(displayedPageHeader, "This is again simple example to start working with radio buttons using Selenium.");
	}

	@AfterClass
	public void closeWebDriver() {
		driver.close();
		driver.quit();
	}
}
