package com.pandeys.seleasy.inputforms.jquerydemo;

public interface SingleSelectBlock {
	String getBlockHeader();
	
	SingleSelectBlock selectValue(String dropdownOption);
	
	String getSelectedValue();
}
