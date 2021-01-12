package com.pandeys.seleasy.datapickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DateExampleImpl implements DateExample {
	private WebDriver driver;
	private By dateExampleBlockLoc = By.xpath("//div[@class='panel panel-default']");
	private WebElement dateEgBlockElement;
	
	public DateExampleImpl(WebDriver driver) {
		this.driver = driver;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		dateEgBlockElement = driver.findElements(dateExampleBlockLoc).get(1);
	}

	@Override
	public String getBlockHeader() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getInstructionText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DateExample selectDate(String date) {
		By dateIpLoc = By.xpath("descendant::input[@type='text']");
		dateEgBlockElement.findElement(dateIpLoc).sendKeys(date);
		return this;
	}

	@Override
	public String getSelectedDate() {
		// TODO Auto-generated method stub
		return null;
	}

}
