package com.pandeys.seleasy.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pandeys.seleasy.datapickers.BootStrapDatePicker;
import com.pandeys.seleasy.datapickers.BootStrapDatePickerImpl;
import com.pandeys.seleasy.datapickers.DatePicker;
import com.pandeys.seleasy.datapickers.JQueryDatePicker;
import com.pandeys.seleasy.datapickers.JQueryDatePickerImpl;

public class DatePickerImpl implements DatePicker {

	private WebDriver driver;
	
	public DatePickerImpl(WebDriver driver) {
		this.driver = driver;
	}

	@Override
	public BootStrapDatePicker getBootStrapDatePicker() {
		By bootStrapDatePickerLoc = By.linkText("Bootstrap Date Picker");
		driver.findElement(bootStrapDatePickerLoc).click();
		return new BootStrapDatePickerImpl(driver);
	}

	@Override
	public JQueryDatePicker getJQueryDatePicker() {
		By jQueryDatePickerLoc = By.linkText("JQuery Date Picker");
		driver.findElement(jQueryDatePickerLoc).click();
		return new JQueryDatePickerImpl(driver) ;
	}

}
