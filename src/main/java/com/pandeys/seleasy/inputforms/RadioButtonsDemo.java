package com.pandeys.seleasy.inputforms;

import com.pandeys.seleasy.inputforms.radiobuttondemo.GroupRadioButtonsDemo;
import com.pandeys.seleasy.inputforms.radiobuttondemo.SingleRadioButtonDemo;

public interface RadioButtonsDemo {

	String getPageHeader();
	
	String getPageHelpText();
	
	SingleRadioButtonDemo getSingleRadioButtonDemo();
	
	GroupRadioButtonsDemo getGroupRadioButtonsDemo();
}
