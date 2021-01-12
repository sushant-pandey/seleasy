package com.pandeys.seleasy.inputforms.selectlistdemo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pandeys.seleasy.home.HomePage;
import com.pandeys.seleasy.home.HomePageImpl;
import com.pandeys.seleasy.home.HomePagePopup;
import com.pandeys.seleasy.home.HomePagePopupImpl;
import com.pandeys.seleasy.inputforms.SelectDropdownList;
import com.pandeys.seleasy.inputforms.dropdowndemo.MultiSelectListDemo;
import com.pandeys.seleasy.inputforms.dropdowndemo.SelectListDemo;
import com.pandeys.seleasy.webdriver.WebDriverFactory;

public class SelectDropdownListTest {
	private WebDriver driver;
	private HomePagePopup homePagePopup;
	private HomePage homePage;
	private SelectDropdownList selectDropdownList;
	
	@BeforeClass
	public void getWebDriverInstance() {
		driver = new WebDriverFactory().getWebDriverInstance("CHROME").getDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		homePagePopup = new HomePagePopupImpl(driver);
		homePagePopup.waitForPopupToLoad();
		homePagePopup.closePopup();
		homePage = new HomePageImpl(driver);
		selectDropdownList = homePage.getNavigationBar().getInputForms().getSelectDropdownList();
		
	}

	@Test(timeOut = 10000)
	public void verifyPageHeader() {
		String displayedPageHeader = selectDropdownList.getPageHeader();
		assertEquals(displayedPageHeader, "This would be your first example on select dropd down list to with Selenium.");
	}
	
	
	@Test(timeOut = 10000)
	public void verifySelectListDemoBlockHeader() {
		SelectListDemo selectListDemo = selectDropdownList.getSelectListDemo();
		String displayedBlockHeader = selectListDemo.getBlockHeader();
		assertEquals(displayedBlockHeader, "Select List Demo");
	}
	
	@Test(timeOut = 10000)
	public void verifySingleSelectList() {
		SelectListDemo selectListDemo = selectDropdownList.getSelectListDemo();
		String displayedResult = selectListDemo.selectDropdownValue("Thursday").getDisplayedResult();
		assertEquals(displayedResult, "Day selected :- Thursday");
	}

	@Test(timeOut = 10000)
	public void verifyMultiSelectListDemoBlockHeader() {
		String displayedBlockHeader = selectDropdownList.getMultiSelectListDemo().getBlockHeader();
		assertEquals(displayedBlockHeader, "Multi Select List Demo");
	}
	
	@Test(timeOut = 20000)
	public void verifyMultiSelectionOfList() {
		MultiSelectListDemo multiSelectDemoBlock = selectDropdownList.
				getMultiSelectListDemo().selectTheValues("California", "New Jersey", "Texas");
		
		//Pending implementation
		String firstSelectedOpt = multiSelectDemoBlock.clickFirstSelected().getDisplayedResult();
		System.out.println("First Selected Opt : " + firstSelectedOpt);
		assertEquals(firstSelectedOpt, "First selected option is : California");
		String allSelectedOpt = multiSelectDemoBlock.clickGetAllSelected().getDisplayedResult();		
		System.out.println("All Selected Opt : " + allSelectedOpt);
		assertEquals(allSelectedOpt, "Options selected are : California,New Jersey,Texas");
	}
	
	@AfterClass
	public void closeWebDriver() {
		driver.close();
		driver.quit();
	}
}
