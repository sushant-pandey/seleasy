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

public class SingleRadioButtonDemoTest {
	private WebDriver driver;
	private HomePagePopup homePagePopup;
	private HomePage homePage;
	private SingleRadioButtonDemo radioButtonDemo ;
	@BeforeClass
	public void getWebDriverInstance() {
		driver = new WebDriverFactory().getWebDriverInstance("CHROME").getDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		homePagePopup = new HomePagePopupImpl(driver);
		homePagePopup.waitForPopupToLoad();
		homePagePopup.closePopup();
		homePage = new HomePageImpl(driver);
		radioButtonDemo = homePage.getNavigationBar().getInputForms().getRadioButtonsDemo().getSingleRadioButtonDemo();
	}

	@Test(timeOut = 10000)
	public void verifyBlockHeader() {
		String displayedBlockHeader = radioButtonDemo.getBlockHeader();
		assertEquals(displayedBlockHeader, "Radio Button Demo");
	}
	
	
	@Test(timeOut = 10000)
	public void verifyMaleOptionSelection() {
		String displayedResult = radioButtonDemo.selectMaleOption().clickGetCheckedValue().getDisplayedResult();
		assertEquals(displayedResult, "Radio button 'Male' is checked");
	}
	
	@Test(timeOut = 10000)
	public void verifyFemaleOptionSelection() {
		String displayedResult = radioButtonDemo.selectFemaleOption().clickGetCheckedValue().getDisplayedResult();
		assertEquals(displayedResult, "Radio button 'Female' is checked");
	}

	@AfterClass
	public void closeWebDriver() {
		driver.close();
		driver.quit();
	}
}
