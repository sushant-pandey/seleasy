package com.pandeys.seleasy.inputforms;

import com.pandeys.seleasy.inputforms.checkboxdemo.MultipleCheckboxDemo;
import com.pandeys.seleasy.inputforms.checkboxdemo.SingleCheckboxDemo;

public interface CheckboxDemo {
	String getPageHeader();
	
	String getPageHelpText();
	
	SingleCheckboxDemo getSingleCheckboxDemo();
	
	MultipleCheckboxDemo getMultipleCheckboxDemo();
	
}
