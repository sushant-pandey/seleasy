package com.pandeys.seleasy.inputforms.simpleformdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TwoInputFieldImpl implements TwoInputField {
	private WebDriver driver;
	
	private By twoInputDivLoc = By.xpath("//div[@id = 'easycont']/div[@class='row']/div[2]/div[@class='panel panel-default']");
	
	private WebElement twoInputDiv ;
	
	public TwoInputFieldImpl(WebDriver driver) {
		this.driver = driver;
		twoInputDiv = driver.findElements(twoInputDivLoc).get(1);
	}

	@Override
	public String getBlockHeader() {
		return twoInputDiv.findElement(By.className("panel-heading")).getText();
	}

	@Override
	public String getHelpText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFirstHelpSubtext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSecondHelpSubtext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getThirdHelpSubtext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFirstTextBoxLabel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void enterValueInFirstTextBox(String value) {
		By inputField1 = By.id("sum1");
		driver.findElement(inputField1).sendKeys(value);
	}

	@Override
	public String getSecondTextBoxLabel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void enterValueInSecondTextBox(String value) {
		By inputField2 = By.id("sum2");
		driver.findElement(inputField2).sendKeys(value);
	}

	@Override
	public void clickGetTotal() {
		By getTotalBtnLoc = By.xpath("//button[text() = 'Get Total']");
		driver.findElement(getTotalBtnLoc).click();
	}

	@Override
	public String getDisplayedResult() {
		By displayedResultLoc = By.xpath("//span[@id='displayvalue']/parent::div");
		return driver.findElement(displayedResultLoc).getText();
	}

}
