package com.pandeys.seleasy.inputforms.simpleformdemo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pandeys.seleasy.home.HomePage;
import com.pandeys.seleasy.home.HomePageImpl;
import com.pandeys.seleasy.home.HomePagePopup;
import com.pandeys.seleasy.home.HomePagePopupImpl;
import com.pandeys.seleasy.webdriver.WebDriverFactory;

import junit.framework.Assert;

public class SingleInputFieldTest {
	private WebDriver driver;
	private HomePagePopup homePagePopup;
	private HomePage homePage;
	private SingleInputField singleInputField;
	
	@BeforeClass
	public void getWebDriverInstance() {
		driver = new WebDriverFactory().getWebDriverInstance("CHROME").getDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		homePagePopup = new HomePagePopupImpl(driver);
		homePagePopup.waitForPopupToLoad();
		homePagePopup.closePopup();
		homePage = new HomePageImpl(driver);
		singleInputField = homePage.getNavigationBar().getInputForms().getSimpleFormDemo().getSingleInputField();
	}

	@Test(timeOut = 10000, enabled = false)
	public void verifyBlockHeader() {
		String blockHeader = singleInputField.getBlockHeader();
		Assert.assertEquals("Single Input Field", blockHeader);
	}
	
	@Test(timeOut = 10000)
	public void verifyMessageInputFunctionality() {
		singleInputField.enterMessage("Test Message");
		singleInputField.submitMessage();
		String displayedMessage = singleInputField.getDisplayedMessage();
		Assert.assertEquals("Your Message: Test Message", displayedMessage);
	}

	@AfterClass
	public void closeWebDriver() {
		driver.close();
		driver.quit();
	}
}
