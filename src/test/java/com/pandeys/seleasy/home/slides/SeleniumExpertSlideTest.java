package com.pandeys.seleasy.home.slides;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pandeys.seleasy.home.HomePage;
import com.pandeys.seleasy.home.HomePageImpl;
import com.pandeys.seleasy.home.HomePagePopup;
import com.pandeys.seleasy.home.HomePagePopupImpl;
import com.pandeys.seleasy.webdriver.WebDriverFactory;

public class SeleniumExpertSlideTest {
	private WebDriver driver;
	private HomePagePopup homePagePopup;
	private HomePage homePage;
	private Slider seleniumExpertSlide;

	@BeforeClass
	public void getWebDriverInstance() {
		driver = new WebDriverFactory().getWebDriverInstance("CHROME").getDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		homePagePopup = new HomePagePopupImpl(driver);
		homePagePopup.waitForPopupToLoad();
		homePagePopup.closePopup();
		homePage = new HomePageImpl(driver);
		Sliders sliders = homePage.getSliders();
		Map<String, Slider> sliderMap = sliders.getSliders();
		seleniumExpertSlide = sliderMap.get("SeleniumExpertSlide");
	}

	@Test(timeOut = 10000)
	public void getTextTest() {
		String slideText = seleniumExpertSlide.getText();
		Assert.assertTrue(slideText.contains("Make Yourself an Expert"));
		Assert.assertTrue(slideText.contains("Becoming an expert will be fun and exciting."));
	}

	@AfterClass
	public void closeWebDriver() {
		driver.close();
		driver.quit();
	}
}
