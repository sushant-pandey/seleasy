package com.pandeys.seleasy.home.slides;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class Slider {

	protected WebDriver driver;

	protected By leftCarouselLoc = By.xpath("//a[@class='left carousel-control']/i");

	public Slider(WebDriver driver) {
		this.driver = driver;
	}

	abstract boolean isActivelyDisplayed();

	public abstract String getText();

	public int getSliderPosition() {
		return 0;
	}

	public CarouselSelector getCarouselSelector() {
		return null;
	}

	public Slider clickRightArrowToNextSlider() {
		return null;
	}

	public Slider clickLeftArrowToPreviousSlider() {
		driver.findElement(leftCarouselLoc).click();
		return new SeleniumExampleSlide(driver);
	}

}
