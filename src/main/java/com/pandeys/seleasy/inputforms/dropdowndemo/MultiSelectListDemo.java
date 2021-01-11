package com.pandeys.seleasy.inputforms.dropdowndemo;

public interface MultiSelectListDemo {
	String getBlockHeader();
	
	String getInstructionText();
	
	MultiSelectListDemo selectTheValues(String... values);
	
	MultiSelectListDemo clickFirstSelected();
	
	MultiSelectListDemo clickGetAllSelected();
	
	String getDisplayedResult();
}
