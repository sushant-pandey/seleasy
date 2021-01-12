package com.pandeys.seleasy.datapickers;

import org.openqa.selenium.WebDriver;

public class BootStrapDatePickerImpl implements BootStrapDatePicker {

	private WebDriver driver;
	
	public BootStrapDatePickerImpl(WebDriver driver) {
		this.driver = driver;
	}

	@Override
	public DateExample getDateExample() {
		return new DateExampleImpl(driver);
	}

	@Override
	public DateRangeExample getDateRangeExample() {
		return new DateRangeExampleImpl(driver);
	}

}
