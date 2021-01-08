package com.pandeys.seleasy.inputforms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pandeys.seleasy.inputforms.simpleformdemo.SingleInputField;
import com.pandeys.seleasy.inputforms.simpleformdemo.SingleInputFieldImpl;
import com.pandeys.seleasy.inputforms.simpleformdemo.TwoInputField;
import com.pandeys.seleasy.inputforms.simpleformdemo.TwoInputFieldImpl;

public class SimpleFormDemoImpl implements SimpleFormDemo {
	private WebDriver driver;
	
	private By pageHeaderLoc = By.xpath("//div[@id = 'easycont']/descendant::h3");
	
	public SimpleFormDemoImpl(WebDriver driver) {
		this.driver = driver;
	}

	@Override
	public String getPageHeader() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(pageHeaderLoc));
		return driver.findElement(pageHeaderLoc).getText();
	}

	@Override
	public SingleInputField getSingleInputField() {
		return new SingleInputFieldImpl(driver);
	}

	@Override
	public TwoInputField getTwoInputField() {
		return new TwoInputFieldImpl(driver);
	}
}
