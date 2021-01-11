package com.pandeys.seleasy.inputforms.radiobuttondemo;

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

public class GroupRadioButtonsDemoTest {
	private WebDriver driver;
	private HomePagePopup homePagePopup;
	private HomePage homePage;
	private GroupRadioButtonsDemo groupRadioButtonsDemo ;
	@BeforeClass
	public void getWebDriverInstance() {
		driver = new WebDriverFactory().getWebDriverInstance("CHROME").getDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		homePagePopup = new HomePagePopupImpl(driver);
		homePagePopup.waitForPopupToLoad();
		homePagePopup.closePopup();
		homePage = new HomePageImpl(driver);
		groupRadioButtonsDemo = homePage.getNavigationBar().getInputForms().getRadioButtonsDemo().getGroupRadioButtonsDemo();
	}

	@Test(timeOut = 10000)
	public void verifyBlockHeader() {
		String displayedBlockHeader = groupRadioButtonsDemo.getBlockHeader();
		assertEquals(displayedBlockHeader, "Group Radio Buttons Demo");
	}
	
	
	@Test(timeOut = 10000)
	public void verifyMaleWith5_15AgeOptionSelection() {
		groupRadioButtonsDemo = groupRadioButtonsDemo.selectMaleOption().select15_50AgeGroupOption().clickGetValues();
		String sexResult = groupRadioButtonsDemo.getDisplayedSexResult();
		String ageResult = groupRadioButtonsDemo.getDisplayedAgeResult();
		assertEquals(sexResult, "Sex : Male");
		assertEquals(ageResult, "Age group: 15 - 50");
	}
	
	@Test(timeOut = 10000)
	public void verifyFemaleWith15_50AgeOptionSelection() {
		groupRadioButtonsDemo = groupRadioButtonsDemo.selectFemaleOption().select15_50AgeGroupOption().clickGetValues();
		String sexResult = groupRadioButtonsDemo.getDisplayedSexResult();
		String ageResult = groupRadioButtonsDemo.getDisplayedAgeResult();
		assertEquals(sexResult, "Sex : Female");
		assertEquals(ageResult, "Age group: 15 - 50");
	}

	@AfterClass
	public void closeWebDriver() {
		driver.close();
		driver.quit();
	}
}
