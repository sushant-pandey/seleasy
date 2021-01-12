package com.pandeys.seleasy.inputforms;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pandeys.seleasy.home.HomePage;
import com.pandeys.seleasy.home.HomePageImpl;
import com.pandeys.seleasy.home.HomePagePopup;
import com.pandeys.seleasy.home.HomePagePopupImpl;
import com.pandeys.seleasy.webdriver.WebDriverFactory;

public class InputFormSubmitTest {
	private WebDriver driver;
	private HomePagePopup homePagePopup;
	private HomePage homePage;
	private InputFormSubmit inputFormSubmit;

	@BeforeClass
	public void getWebDriverInstance() {
		driver = new WebDriverFactory().getWebDriverInstance("CHROME").getDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		homePagePopup = new HomePagePopupImpl(driver);
		homePagePopup.waitForPopupToLoad();
		homePagePopup.closePopup();
		homePage = new HomePageImpl(driver);
		inputFormSubmit = homePage.getNavigationBar().getInputForms().getInputFormSubmit();

	}

	@Test(timeOut = 10000)
	public void enterContactInformationAndSend() {
		inputFormSubmit
			.enterFirstName("ABC")
			.enterLastName("DEF")
			.enterEmailAddress("ABC@DEF.COM")
			.enterPhoneNumber("9999999999")
			.enterAddress("ABC Lane")
			.enterCity("New City")
			.selectState("California")
			.enterZipCode("11111")
			.enterWebsiteOrDomainName("DEF.COM")
			.selectHostingAsNo()
			.enterProjectDescription("GREAT PROJECT DESCRIPTION")		
			.clickSend();
	}

	@AfterClass
	public void closeWebDriver() {
		driver.close();
		driver.quit();
	}
}
