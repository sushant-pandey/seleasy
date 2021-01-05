package com.pandeys.seleasy;

import org.openqa.selenium.WebDriver;

public abstract class AbstractSeleniumEasyPage {

	private WebDriver driver;

	public AbstractSeleniumEasyPage(WebDriver driver) {
		this.driver = driver;
	}

	protected SeleniumEasyHeaderImpl selEasyHeader;
	protected SeleniumEasyFooterImpl selEasyFooter;

	protected SeleniumEasyHeaderImpl getSeleniumEasyHeader() {
		return new SeleniumEasyHeaderImpl(driver);
	}

	protected SeleniumEasyFooterImpl getSeleniumEasyFooter() {
		return new SeleniumEasyFooterImpl(driver);
	}
}
