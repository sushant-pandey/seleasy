package com.pandeys.seleasy.home;

public interface HomePagePopup {
	
	void waitForPopupToLoad();
	
	String getText();
	
	void clickYesPlease();
	
	void clickNoThanks();
	
	void closePopup();
	
	void waitForPopupToClose();
}
