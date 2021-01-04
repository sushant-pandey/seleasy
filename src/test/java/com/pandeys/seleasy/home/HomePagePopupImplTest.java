package com.pandeys.seleasy.home;

import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pandeys.seleasy.webdriver.WebDriverFactory;

@Test
public class HomePagePopupImplTest {
	private WebDriver driver;
	private HomePagePopup homePagePopup;
	
	@BeforeMethod
	public void getWebDriverInstance() {
		driver = new WebDriverFactory().getWebDriverInstance("CHROME").getDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		homePagePopup = new HomePagePopupImpl(driver);
		homePagePopup.waitForPopupToLoad();
	}

	@Test
	public void clickNoThanksTest() {
		homePagePopup.clickNoThanks();
	}

	@Test
	public void clickYesPleaseTest() {
		homePagePopup.clickYesPlease();
	}

	@Test
	public void closePopupTest() {
		homePagePopup.closePopup();
	}

	@Test
	public void getTextTest() {
		String popupText = homePagePopup.getText();
		AssertJUnit.assertEquals("Learn selenium to automate with Seleniumeasy.com", popupText);
	}
	
	@AfterMethod
	public void closeWebDriver() {
		driver.close();
		driver.quit();
	}
}
