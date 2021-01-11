package com.pandeys.seleasy.inputforms.radiobuttondemo;

public interface SingleRadioButtonDemo {
	String getBlockHeader();
	
	String getInstructionMessage();
	
	SingleRadioButtonDemo selectMaleOption();
	
	SingleRadioButtonDemo selectFemaleOption();
	
	SingleRadioButtonDemo clickGetCheckedValue();
	
	String getDisplayedResult();
}
