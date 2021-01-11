package com.pandeys.seleasy.inputforms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pandeys.seleasy.inputforms.checkboxdemo.MultipleCheckboxDemo;
import com.pandeys.seleasy.inputforms.checkboxdemo.MultipleCheckboxDemoImpl;
import com.pandeys.seleasy.inputforms.checkboxdemo.SingleCheckboxDemo;
import com.pandeys.seleasy.inputforms.checkboxdemo.SingleCheckboxDemoImpl;

public class CheckboxDemoImpl implements CheckboxDemo {
	private WebDriver driver;
	
	private By pageHeaderLoc = By.xpath("//div[@id = 'easycont']/descendant::h3");
	
	public CheckboxDemoImpl(WebDriver driver) {
		this.driver = driver;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(pageHeaderLoc));
	}
	
	@Override
	public String getPageHeader() {
		return driver.findElement(pageHeaderLoc).getText();
	}

	@Override
	public String getPageHelpText() {
		return null;
	}

	@Override
	public SingleCheckboxDemo getSingleCheckboxDemo() {
		return new SingleCheckboxDemoImpl(driver) ;
	}

	@Override
	public MultipleCheckboxDemo getMultipleCheckboxDemo() {
		return new MultipleCheckboxDemoImpl(driver) ;
	}

}
