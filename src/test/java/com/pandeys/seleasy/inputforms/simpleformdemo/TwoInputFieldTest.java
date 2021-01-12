package com.pandeys.seleasy.inputforms.simpleformdemo;

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
import com.pandeys.seleasy.webdriver.WebDriverFactory;

public class TwoInputFieldTest {
	private WebDriver driver;
	private HomePagePopup homePagePopup;
	private HomePage homePage;
	private TwoInputField twoInputField;
	@BeforeClass
	public void getWebDriverInstance() {
		driver = new WebDriverFactory().getWebDriverInstance("CHROME").getDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		homePagePopup = new HomePagePopupImpl(driver);
		homePagePopup.waitForPopupToLoad();
		homePagePopup.closePopup();
		homePage = new HomePageImpl(driver);
		twoInputField = homePage.getNavigationBar().getInputForms().getSimpleFormDemo().getTwoInputField();
		
	}

	@Test(timeOut = 10000, enabled= false)
	public void verifyBlockHeader() {
		String blockHeader = twoInputField.getBlockHeader();
		assertEquals(blockHeader, "Two Input Fields");
	}

	@Test(timeOut = 10000)
	public void verifyAdditionFunctionality() {
		twoInputField.enterValueInFirstTextBox("2");
		twoInputField.enterValueInSecondTextBox("3");
		twoInputField.clickGetTotal();
		String displayedResult = twoInputField.getDisplayedResult();
		assertEquals(displayedResult, "Total a + b = 5");
	}
	
	@AfterClass
	public void closeWebDriver() {
		driver.close();
		driver.quit();
	}
}
