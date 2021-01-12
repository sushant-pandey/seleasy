package com.pandeys.seleasy.datapickers;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pandeys.seleasy.home.HomePage;
import com.pandeys.seleasy.home.HomePageImpl;
import com.pandeys.seleasy.home.HomePagePopup;
import com.pandeys.seleasy.home.HomePagePopupImpl;
import com.pandeys.seleasy.inputforms.CheckboxDemo;
import com.pandeys.seleasy.webdriver.WebDriverFactory;

public class DatePickerTest {
	private WebDriver driver;
	private HomePagePopup homePagePopup;
	private HomePage homePage;
	private DateExample dateExample ;
	private DateRangeExample dateRangeExample;

	@BeforeClass
	public void getWebDriverInstance() {
		driver = new WebDriverFactory().getWebDriverInstance("CHROME").getDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		homePagePopup = new HomePagePopupImpl(driver);
		homePagePopup.waitForPopupToLoad();
		homePagePopup.closePopup();
		homePage = new HomePageImpl(driver);
		dateExample = homePage.getNavigationBar().getDatePicker().getBootStrapDatePicker().getDateExample();
		dateRangeExample = homePage.getNavigationBar().getDatePicker().getBootStrapDatePicker().getDateRangeExample();
	}
	
	@Test
	public void selectDate() {
		dateExample.selectDate("14/01/2021");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void selectDateRange() {
		dateRangeExample.selectStartDate("14/01/2021").selectEndDate("15/01/2021");
	}

	@AfterClass
	public void closeWebDriver() {
		driver.close();
		driver.quit();
	}
}
