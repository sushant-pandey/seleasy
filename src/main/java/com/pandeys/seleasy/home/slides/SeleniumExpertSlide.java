package com.pandeys.seleasy.home.slides;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumExpertSlide extends Slider {
	
	private By slide1ContainerLoc = By.xpath("//div[contains(@class, 'item slide1')]/descendant::div[@class='container']");
	
	public SeleniumExpertSlide(WebDriver driver) {
		super(driver);
	}
		
	@Override
	public boolean isActivelyDisplayed() {
		return driver.findElement(leftCarouselLoc).isDisplayed();
	}
	
	@Override
	public String getText() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(slide1ContainerLoc));
		return driver.findElement(slide1ContainerLoc).getAttribute("innerHTML");
	}

	@Override
	public CarouselSelector getCarouselSelector() {
		return null;
	}

	@Override
	public Slider clickRightArrowToNextSlider() {
		return null;
	}

	@Override
	public Slider clickLeftArrowToPreviousSlider() {
		driver.findElement(leftCarouselLoc).click();
		return new SeleniumExampleSlide(driver);
	}

}
