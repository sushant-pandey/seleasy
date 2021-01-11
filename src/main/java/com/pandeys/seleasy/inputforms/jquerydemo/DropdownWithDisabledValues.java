package com.pandeys.seleasy.inputforms.jquerydemo;

import org.openqa.selenium.WebDriver;

public interface DropdownWithDisabledValues {

	String getBlockHeader();
	
	String getDropDownLabel();
	
	DropdownWithDisabledValues selectValue(String dropdownValue);
	
	String getSelectedState();

}
