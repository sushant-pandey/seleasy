package com.pandeys.seleasy.inputforms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjaxFormSubmitImpl implements AjaxFormSubmit {

	private WebDriver driver;

	public AjaxFormSubmitImpl(WebDriver driver) {
		this.driver = driver;
	}
	
	@Override
	public String getPageHeader() {
		return null;
	}

	@Override
	public String getHelpText() {
		return null;
	}

	@Override
	public String getBlockHeader() {
		return null;
	}

	@Override
	public String getNameLabel() {
		return null;
	}

	@Override
	public AjaxFormSubmit enterName(String name) {
		By nameLoc = By.id("title");
		driver.findElement(nameLoc).sendKeys(name);
		return this;
	}

	@Override
	public String getNameBoxColor() {
		By nameLoc = By.id("title");
		return driver.findElement(nameLoc).getAttribute("style");
	}

	@Override
	public AjaxFormSubmit enterComment(String comment) {
		By commentLoc = By.id("description");
		driver.findElement(commentLoc).sendKeys(comment);
		return this;
	}

	@Override
	public String getDisplayedMessage() {
		By dispMsgLoc = By.id("submit-control");
		By tempAjaxMsg = By.xpath("//div[@id='submit-control'][contains(text(), 'Ajax Request is Processing!')]");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(tempAjaxMsg));
		return driver.findElement(dispMsgLoc).getText();
	}

	@Override
	public AjaxFormSubmit clickSubmit() {
		By submitBtnLoc = By.id("btn-submit");
		driver.findElement(submitBtnLoc).click();
		return this;
	}

}
