package com.pandeys.seleasy.inputforms.jquerydemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropdownWithDisabledValuesImpl implements DropdownWithDisabledValues {

	private WebDriver driver;
	
	private By blockLoc = By.xpath("//div[@class='panel panel-primary']");
	private By dropDowndLoc = By.xpath("descendant::span[@class = 'select2-selection__rendered']");
	
	private WebElement blockElement;
	
	public DropdownWithDisabledValuesImpl(WebDriver driver) {
		this.driver = driver;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		blockElement = driver.findElements(blockLoc).get(2);
	}

	@Override
	public String getBlockHeader() {
		return null;
	}

	@Override
	public String getDropDownLabel() {
		return null;
	}

	@Override
	public DropdownWithDisabledValues selectValue(String dropdownValue) {
		blockElement.findElement(dropDowndLoc).click();
		
		By stateOptsLoc = By.xpath("//li[contains(@class, 'select2-results__option')]");
		List<WebElement> listOfStates = driver.findElements(stateOptsLoc);
		for(WebElement stateOpt : listOfStates) {
			if(stateOpt.getText().equalsIgnoreCase(dropdownValue)) {
				stateOpt.click();
				break;
			}
		}
		return this;
	}

	@Override
	public String getSelectedState() {
		return blockElement.findElement(dropDowndLoc).getText();
	}

}
