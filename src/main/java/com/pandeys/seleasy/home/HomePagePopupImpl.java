package com.pandeys.seleasy.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePagePopupImpl implements HomePagePopup {
	private WebDriver driver;
	
	private By textDivId = By.id("at-cv-lightbox-message");
	private By yesPleaseLink = By.linkText("Yes please!");
	private By noThanksLink = By.linkText("No, thanks!");
	private By xClose = By.id("at-cv-lightbox-close");
	
	public HomePagePopupImpl(WebDriver driver) {
		this.driver = driver;
	}
	
	@Override
	public String getText() {
		return driver.findElement(textDivId).getText();
	}

	@Override
	public void clickYesPlease() {
		driver.findElement(yesPleaseLink).click();
	}

	@Override
	public void clickNoThanks() {
		driver.findElement(noThanksLink).click();
	}

	@Override
	public void closePopup() {
		driver.findElement(xClose).click();
	}

	@Override
	public void waitForPopupToLoad() {
		WebDriverWait wait = new WebDriverWait(driver, 10000, 1000);
		wait.until(ExpectedConditions.elementToBeClickable(xClose));
	}

	@Override
	public void waitForPopupToClose() {
		WebDriverWait wait = new WebDriverWait(driver, 10000, 1000);
		wait.until(ExpectedConditions.invisibilityOfAllElements(
				driver.findElement(xClose),
				driver.findElement(noThanksLink)));
	}

}
