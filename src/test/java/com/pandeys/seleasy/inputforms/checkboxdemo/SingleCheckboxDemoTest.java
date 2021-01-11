package com.pandeys.seleasy.inputforms.checkboxdemo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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
import com.pandeys.seleasy.webdriver.WebDriverFactory;

public class SingleCheckboxDemoTest {
	private WebDriver driver;
	private HomePagePopup homePagePopup;
	private HomePage homePage;
	private SingleCheckboxDemo singleCheckboxDemo;
	
	@BeforeClass
	public void getWebDriverInstance() {
		driver = new WebDriverFactory().getWebDriverInstance("CHROME").getDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		homePagePopup = new HomePagePopupImpl(driver);
		homePagePopup.waitForPopupToLoad();
		homePagePopup.closePopup();
		homePage = new HomePageImpl(driver);
		singleCheckboxDemo = homePage.getNavigationBar().getInputForms().getCheckboxDemo().getSingleCheckboxDemo();
	}

	@Test(timeOut = 10000)
	public void verifyBlockHeader() {
		String displayedBlockHeader = singleCheckboxDemo.getBlockHeader();
		assertEquals(displayedBlockHeader, "Single Checkbox Demo");
	}
	
	@Test(timeOut = 10000)
	public void verifyCheckboxSelection() {
		singleCheckboxDemo.selectCheckbox();
		Boolean isCheckBoxSelected = singleCheckboxDemo.isCheckboxSelected();
		assertTrue(isCheckBoxSelected);
	}

	@AfterClass
	public void closeWebDriver() {
		driver.close();
		driver.quit();
	}
}
