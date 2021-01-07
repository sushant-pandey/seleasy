package com.pandeys.seleasy.home.slides;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JQuerySlide extends Slider {

	private By slide3ContainerLoc = By.xpath("//div[contains(@class, 'item slide3')]/descendant::div[@class='container']");
	
	public JQuerySlide(WebDriver driver) {
		super(driver);
	}

	@Override
	boolean isActivelyDisplayed() {
		return false;
	}

	@Override
	public String getText() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(slide3ContainerLoc));
		return driver.findElement(slide3ContainerLoc).getAttribute("innerHTML");
	}
	
}
