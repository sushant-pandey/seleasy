package com.pandeys.seleasy.inputforms.checkboxdemo;

public interface MultipleCheckboxDemo {
	String getBlockHeader();
	
	String getBlockHelpText();
	
	String getHelpTextPoint1();
	
	String getHelpTextPoint2();
	
	String getHelpTextPoint3();
	
	String getLabelForCheckbox1();
	
	MultipleCheckboxDemo selectCheckbox1();
	
	Boolean isCheckbox1Selected();
	
	String getLabelForCheckbox2();
	
	MultipleCheckboxDemo selectCheckbox2();
	
	Boolean isCheckbox2Selected();
	
	String getLabelForCheckbox3();
	
	MultipleCheckboxDemo selectCheckbox3();
	
	Boolean isCheckbox3Selected();
	
	String getLabelForCheckbox4();
	
	MultipleCheckboxDemo selectCheckbox4();
	
	Boolean isCheckbox4Selected();
	
	MultipleCheckboxDemo checkAll();
	
	MultipleCheckboxDemo uncheckAll();
}
