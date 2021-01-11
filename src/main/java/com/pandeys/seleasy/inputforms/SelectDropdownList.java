package com.pandeys.seleasy.inputforms;

import com.pandeys.seleasy.inputforms.dropdowndemo.MultiSelectListDemo;
import com.pandeys.seleasy.inputforms.dropdowndemo.SelectListDemo;

public interface SelectDropdownList {
	String getPageHeader();
	
	SelectListDemo getSelectListDemo();
	
	MultiSelectListDemo getMultiSelectListDemo();
}
