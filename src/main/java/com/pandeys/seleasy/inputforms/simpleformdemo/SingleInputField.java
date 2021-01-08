package com.pandeys.seleasy.inputforms.simpleformdemo;

public interface SingleInputField {
	String getBlockHeader();
	
	String getHelpText();
	
	String getTextBoxLabel();
	
	void enterMessage(String string);
	
	void submitMessage();
	
	String getDisplayedMessage();
}
