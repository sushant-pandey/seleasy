package com.pandeys.seleasy.inputforms.simpleformdemo;

public interface TwoInputField {
	String getBlockHeader();
	
	String getHelpText();
	
	String getFirstHelpSubtext();
	
	String getSecondHelpSubtext();
	
	String getThirdHelpSubtext();
	
	String getFirstTextBoxLabel();
	
	void enterValueInFirstTextBox(String value);
	
	String getSecondTextBoxLabel();
	
	void enterValueInSecondTextBox(String value);
	
	void clickGetTotal();
	
	String getDisplayedResult();
}
