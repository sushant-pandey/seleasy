package com.pandeys.seleasy.inputforms.dropdowndemo;

public interface SelectListDemo {
	String getBlockHeader();
	
	String getHelpText();
	
	String dropdownLabel();
	
	SelectListDemo selectDropdownValue(String dropDownValue);
	
	String getDisplayedResult();
}
