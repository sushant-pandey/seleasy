package com.pandeys.seleasy.home.slides;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pandeys.seleasy.home.HomePage;
import com.pandeys.seleasy.home.HomePageImpl;
import com.pandeys.seleasy.home.HomePagePopup;
import com.pandeys.seleasy.home.HomePagePopupImpl;
import com.pandeys.seleasy.home.slides.Slider;
import com.pandeys.seleasy.home.slides.Sliders;
import com.pandeys.seleasy.webdriver.WebDriverFactory;

public class SeleniumExampleSlideTest {
	private WebDriver driver;
	private HomePagePopup homePagePopup;
	private HomePage homePage;
	private Slider seleniumExampleSlide;

	@BeforeMethod
	public void getWebDriverInstance() {
		driver = new WebDriverFactory().getWebDriverInstance("CHROME").getDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		homePagePopup = new HomePagePopupImpl(driver);
		homePagePopup.waitForPopupToLoad();
		homePagePopup.closePopup();
		homePage = new HomePageImpl(driver);
		Sliders sliders = homePage.getSliders();
		Map<String, Slider> sliderMap = sliders.getSliders();
		seleniumExampleSlide = sliderMap.get("SeleniumExampleSlide");
		
	}

	@Test(timeOut = 10000)
	public void getTextTest() {
		String slideText = seleniumExampleSlide.getText();
		Assert.assertTrue(slideText.contains("We have great examples for You"));
		Assert.assertTrue(slideText.contains("Get prepared for your next awesome Automation Project using Selenium"));
	}

	@AfterMethod
	public void closeWebDriver() {
		driver.close();
		driver.quit();
	}
}
