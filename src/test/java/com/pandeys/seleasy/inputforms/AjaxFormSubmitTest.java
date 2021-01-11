package com.pandeys.seleasy.inputforms;

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
import com.pandeys.seleasy.webdriver.WebDriverFactory;

public class AjaxFormSubmitTest {
	private WebDriver driver;
	private HomePagePopup homePagePopup;
	private HomePage homePage;
	private AjaxFormSubmit ajaxFormSubmit ;

	@BeforeClass
	public void getWebDriverInstance() {
		driver = new WebDriverFactory().getWebDriverInstance("CHROME").getDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		homePagePopup = new HomePagePopupImpl(driver);
		homePagePopup.waitForPopupToLoad();
		homePagePopup.closePopup();
		homePage = new HomePageImpl(driver);
		ajaxFormSubmit = homePage.getNavigationBar().getInputForms().getAjaxFormSubmit();
	}

	@Test(timeOut = 10000)
	public void enterDetailsAndSubmitForm() {
		String displayedResult = ajaxFormSubmit.enterName("Test Name")
			.enterComment("Basic Test Comment from me").clickSubmit().getDisplayedMessage();
		assertEquals(displayedResult, "Form submited Successfully!");
	}

	@Test(timeOut = 10000)
	public void enterNoNameSubmitForm() {
		String displayedColorAttribute = ajaxFormSubmit.clickSubmit().getNameBoxColor();
		assertEquals(displayedColorAttribute, "border: 1px solid rgb(255, 0, 0);");
	}
	
	@AfterClass
	public void closeWebDriver() {
		driver.close();
		driver.quit();
	}
}
