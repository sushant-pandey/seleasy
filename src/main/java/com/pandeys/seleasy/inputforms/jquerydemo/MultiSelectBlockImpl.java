package com.pandeys.seleasy.inputforms.jquerydemo;

import org.openqa.selenium.WebDriver;

public class MultiSelectBlockImpl implements MultiSelectBlock {

	private WebDriver driver;
	
	public MultiSelectBlockImpl(WebDriver driver) {
		this.driver = driver;
	}

	@Override
	public String getHeader() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SelectMultipleValuesBlockImpl getSelectMultipleValuesBlock() {
		return new SelectMultipleValuesBlockImpl(driver);
	}

	@Override
	public DropdownWithDisabledValues getDropdownWithDisabledValues() {
		return new DropdownWithDisabledValuesImpl(driver);
	}

	@Override
	public DropdownWithCategoryOptions getDropdownWithCategoryOptions() {
		return new DropdownWithCategoryOptionsImpl(driver);
	}

}
