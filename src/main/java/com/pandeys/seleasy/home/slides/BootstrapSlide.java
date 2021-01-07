package com.pandeys.seleasy.home.slides;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BootstrapSlide extends Slider {

	private By slide2ContainerLoc = By.xpath("//div[contains(@class, 'item slide2')]/descendant::div[@class='container']");
	
	public BootstrapSlide(WebDriver driver) {
		super(driver);
	}

	@Override
	boolean isActivelyDisplayed() {
		return false;
	}

	@Override
	public String getText() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(slide2ContainerLoc));
		return driver.findElement(slide2ContainerLoc).getAttribute("innerHTML");
	}
	
}
