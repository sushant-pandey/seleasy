package com.pandeys.seleasy.inputforms;

import com.pandeys.seleasy.inputforms.simpleformdemo.SingleInputField;
import com.pandeys.seleasy.inputforms.simpleformdemo.TwoInputField;

public interface SimpleFormDemo {
	String getPageHeader();
	
	SingleInputField getSingleInputField();
	
	TwoInputField getTwoInputField();
	
}
