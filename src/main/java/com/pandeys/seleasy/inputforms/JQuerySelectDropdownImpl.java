package com.pandeys.seleasy.inputforms;

import org.openqa.selenium.WebDriver;

import com.pandeys.seleasy.inputforms.jquerydemo.MultiSelectBlock;
import com.pandeys.seleasy.inputforms.jquerydemo.MultiSelectBlockImpl;
import com.pandeys.seleasy.inputforms.jquerydemo.SingleSelectBlock;
import com.pandeys.seleasy.inputforms.jquerydemo.SingleSelectBlockImpl;

public class JQuerySelectDropdownImpl implements JQuerySelectDropdown {
	
	private WebDriver driver;
	
	public JQuerySelectDropdownImpl(WebDriver driver) {
		this.driver = driver;
	}

	@Override
	public SingleSelectBlock getSingleSelectBlock() {
		return new SingleSelectBlockImpl(driver);
	}

	@Override
	public MultiSelectBlock getMultiSelectBlock() {
		return new MultiSelectBlockImpl(driver);
	}

}
