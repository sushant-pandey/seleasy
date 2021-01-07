package com.pandeys.seleasy.home.slides;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumExampleSlide extends Slider {
	private By slide4ContainerLoc = By.xpath("//div[contains(@class, 'item slide4')]/descendant::div[@class='container']");
	
	public SeleniumExampleSlide(WebDriver driver) {
		super(driver);
	}

	@Override
	boolean isActivelyDisplayed() {
		return false;
	}

	@Override
	public String getText() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(slide4ContainerLoc));
		return driver.findElement(slide4ContainerLoc).getAttribute("innerHTML");
	}
	
}
