package com.pandeys.seleasy;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pandeys.seleasy.home.HomePagePopup;
import com.pandeys.seleasy.home.HomePagePopupImpl;
import com.pandeys.seleasy.webdriver.WebDriverFactory;

import junit.framework.Assert;

public class SeleniumEasyFooterTest {
	private WebDriver driver;
	private HomePagePopup homePagePopup;
	private SeleniumEasyFooter seleniumEasyFooter;

	@BeforeClass
	public void getWebDriverInstance() {
		driver = new WebDriverFactory().getWebDriverInstance("CHROME").getDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		homePagePopup = new HomePagePopupImpl(driver);
		homePagePopup.waitForPopupToLoad();
		homePagePopup.closePopup();
	}

	@Test
	public void getTutorialsMenuItems() {
		seleniumEasyFooter = new SeleniumEasyFooterImpl(driver);
		List<String> displayedTutorialMenu = seleniumEasyFooter.getTutorialsMenuItems();
		List<String> expectedTutorialMenu = Arrays.asList(
				"Selenium Tutorials", "TestNG Tutorial", "JUnit Tutorial", "JXL Tutorial", "Apache POI", "ANT Tutorial", "Maven Tutorial");
		Assert.assertTrue(expectedTutorialMenu.containsAll(displayedTutorialMenu));
	}

	@Test
	public void getPopularPostsItems() {
		seleniumEasyFooter = new SeleniumEasyFooterImpl(driver);
		List<String> displayedPopularPost = seleniumEasyFooter.getPopularPostsItems();
		List<String> expectedPopularPost = Arrays.asList("Gecko Driver Selenium 3", "Page Factory Pattern", "Execute Tests in Jenkins", 
				"TestNG Custom Report", "Execute Selenium tests using Maven", "View All Selenium Tutorials");
		Assert.assertTrue(expectedPopularPost.containsAll(displayedPopularPost));
	}

	@AfterClass
	public void closeWebDriver() {
		driver.close();
		driver.quit();
	}
}
