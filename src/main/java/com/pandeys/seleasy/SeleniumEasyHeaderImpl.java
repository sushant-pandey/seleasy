package com.pandeys.seleasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumEasyHeaderImpl implements SeleniumEasyHeader{
	private WebDriver driver;
	
	private By siteNameLoc = By.xpath("//div[@id='site-name']/a");
	private By siteSloganLoc = By.id("site-slogan");
	
	public SeleniumEasyHeaderImpl(WebDriver driver) {
		this.driver = driver;
	}

	public String getSiteName() {
		return driver.findElement(siteNameLoc).getText();
	}
	
	public String getSiteSlogan() {
		return driver.findElement(siteSloganLoc).getText();
	}
}
