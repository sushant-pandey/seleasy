package com.pandeys.seleasy.inputforms;

public interface AjaxFormSubmit {
	String getPageHeader();
	
	String getHelpText();
	
	String getBlockHeader();
	
	String getNameLabel();
	
	AjaxFormSubmit enterName(String name);
	
	String getNameBoxColor();
	
	AjaxFormSubmit enterComment(String comment);
	
	AjaxFormSubmit clickSubmit();
	
	String getDisplayedMessage();
}
