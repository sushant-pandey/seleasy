package com.pandeys.seleasy.inputforms;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pandeys.seleasy.home.HomePage;
import com.pandeys.seleasy.home.HomePageImpl;
import com.pandeys.seleasy.home.HomePagePopup;
import com.pandeys.seleasy.home.HomePagePopupImpl;
import com.pandeys.seleasy.webdriver.WebDriverFactory;

public class JQuerySelectDropdownTest {
	private WebDriver driver;
	private HomePagePopup homePagePopup;
	private HomePage homePage;
	private JQuerySelectDropdown jQuerySelectDropdown;

	@BeforeClass
	public void getWebDriverInstance() {
		driver = new WebDriverFactory().getWebDriverInstance("CHROME").getDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		homePagePopup = new HomePagePopupImpl(driver);
		homePagePopup.waitForPopupToLoad();
		homePagePopup.closePopup();
		homePage = new HomePageImpl(driver);
		jQuerySelectDropdown = homePage.getNavigationBar().getInputForms().getJQuerySelectDropdown();
	}

	@Test(timeOut = 30000)
	public void selectSingleSelectDropdown() {
		String selectedValue = jQuerySelectDropdown.getSingleSelectBlock().selectValue("Netherlands")
				.getSelectedValue();
		assertEquals(selectedValue, "Netherlands");
	}

	@Test(timeOut = 30000)
	public void multiStatesSelection() {
		String selectedStates = jQuerySelectDropdown.getMultiSelectBlock().getSelectMultipleValuesBlock()
				.selectState("Arkansas", "California").getSelectedState();
		assertEquals(selectedStates, "[Arkansas, California]");
	}

	@Test(timeOut = 30000)
	public void multiStatesDropdownSelection() {
		String selectedState = jQuerySelectDropdown.getMultiSelectBlock().getDropdownWithDisabledValues()
				.selectValue("Puerto Rico").getSelectedState();
		assertEquals(selectedState, "Puerto Rico");
	}

	@Test(timeOut = 30000)
	public void filesDropdownSelection() {
		String selectedState = jQuerySelectDropdown.getMultiSelectBlock().
				getDropdownWithCategoryOptions().selectFileOption("Unknown Script").
				getSelectedFileOption();
		assertEquals(selectedState, "Unknown Script");
	}

	@AfterClass
	public void closeWebDriver() {
		driver.close();
		driver.quit();
	}
}
