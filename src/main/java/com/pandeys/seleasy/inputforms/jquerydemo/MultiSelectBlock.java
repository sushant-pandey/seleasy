package com.pandeys.seleasy.inputforms.jquerydemo;

public interface MultiSelectBlock {
	
	String getHeader();
	
	SelectMultipleValuesBlockImpl getSelectMultipleValuesBlock();
	
	DropdownWithDisabledValues getDropdownWithDisabledValues();
	
	DropdownWithCategoryOptions getDropdownWithCategoryOptions();
}
