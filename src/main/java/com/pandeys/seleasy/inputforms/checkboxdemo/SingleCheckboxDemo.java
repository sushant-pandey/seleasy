package com.pandeys.seleasy.inputforms.checkboxdemo;

public interface SingleCheckboxDemo {
	String getBlockHeader();
	
	String getBlockHelpText();
	
	String getCheckboxLabel();
	
	SingleCheckboxDemo selectCheckbox();
	
	Boolean isCheckboxSelected();
}
