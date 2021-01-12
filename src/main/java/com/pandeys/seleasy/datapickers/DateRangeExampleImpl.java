package com.pandeys.seleasy.datapickers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DateRangeExampleImpl implements DateRangeExample {

	private WebDriver driver;
	
	private By dateBlockLoc = By.xpath("//div[@class='panel panel-default']");
	private WebElement dateEgBlockElement;
	private WebElement datePickerElement;
	public DateRangeExampleImpl(WebDriver driver) {
		this.driver = driver;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		dateEgBlockElement = driver.findElements(dateBlockLoc).get(2);
		By datePicker = By.xpath("descendant::div[@id='datepicker']");
		datePickerElement = dateEgBlockElement.findElement(datePicker);
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
	public String getLabelForDateRange() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DateRangeExample selectStartDate(String startDate) {
		WebElement startDateElement = datePickerElement.findElements(By.tagName("input")).get(0);
//		startDateElement.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		startDateElement.clear();
		startDateElement.sendKeys(startDate);
		Actions act = new Actions(driver);
		act.moveByOffset(500, 500).click().perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}

	@Override
	public DateRangeExample selectEndDate(String endDate) {
		WebElement startDateElement = datePickerElement.findElements(By.tagName("input")).get(1);
		startDateElement.clear();
//		startDateElement.sendKeys(endDate);
		Actions act = new Actions(driver);
		act.click(startDateElement).sendKeys(endDate).build().perform();
		act.moveByOffset(100, 100).click().perform();
		return this;
	}

	@Override
	public String getStartDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEndDate() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
