package com.pandeys.seleasy.inputforms.checkboxdemo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
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
import com.pandeys.seleasy.webdriver.WebDriverFactory;

public class MultipleCheckboxDemoTest {
	private WebDriver driver;
	private HomePagePopup homePagePopup;
	private HomePage homePage;
	private MultipleCheckboxDemo multipleCheckboxDemo;
	
	@BeforeClass
	public void getWebDriverInstance() {
		driver = new WebDriverFactory().getWebDriverInstance("CHROME").getDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		homePagePopup = new HomePagePopupImpl(driver);
		homePagePopup.waitForPopupToLoad();
		homePagePopup.closePopup();
		homePage = new HomePageImpl(driver);
		multipleCheckboxDemo = homePage.getNavigationBar().getInputForms().getCheckboxDemo().getMultipleCheckboxDemo();
	}

	@Test(timeOut = 10000)
	public void verifyBlockHeader() {
		String displayedBlockHeader = multipleCheckboxDemo.getBlockHeader();
		assertEquals(displayedBlockHeader, "Multiple Checkbox Demo");
	}
	
	@Test(timeOut = 10000)
	public void verifyCheckboxSelection() {
		multipleCheckboxDemo.selectCheckbox1();
		Boolean isCheckBoxSelected = multipleCheckboxDemo.isCheckbox1Selected();
		assertTrue(isCheckBoxSelected);
	}

	@Test(timeOut = 10000)
	public void verifySelectionOfAllCheckboxes() {
		multipleCheckboxDemo.selectCheckbox1();
		multipleCheckboxDemo.selectCheckbox2();
		multipleCheckboxDemo.selectCheckbox3();
		multipleCheckboxDemo.selectCheckbox4();
		assertTrue(multipleCheckboxDemo.isCheckbox1Selected());
		assertTrue(multipleCheckboxDemo.isCheckbox2Selected());
		assertTrue(multipleCheckboxDemo.isCheckbox3Selected());
		assertTrue(multipleCheckboxDemo.isCheckbox4Selected());
	}
	
	@Test(timeOut = 10000)
	public void verifyCheckAllButton() {
		multipleCheckboxDemo.checkAll();
		assertTrue(multipleCheckboxDemo.isCheckbox1Selected());
		assertTrue(multipleCheckboxDemo.isCheckbox2Selected());
		assertTrue(multipleCheckboxDemo.isCheckbox3Selected());
		assertTrue(multipleCheckboxDemo.isCheckbox4Selected());
	}
	
	@Test(timeOut = 10000, dependsOnMethods = "verifyCheckAllButton")
	public void verifyUncheckAllButton() {
		multipleCheckboxDemo.uncheckAll();
		assertFalse(multipleCheckboxDemo.isCheckbox1Selected());
		assertFalse(multipleCheckboxDemo.isCheckbox2Selected());
		assertFalse(multipleCheckboxDemo.isCheckbox3Selected());
		assertFalse(multipleCheckboxDemo.isCheckbox4Selected());
	}
	
	@AfterClass
	public void closeWebDriver() {
		driver.close();
		driver.quit();
	}
}
