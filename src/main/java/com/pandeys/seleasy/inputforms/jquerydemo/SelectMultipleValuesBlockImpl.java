package com.pandeys.seleasy.inputforms.jquerydemo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectMultipleValuesBlockImpl implements SelectMultipleValuesBlock{

	private WebDriver driver;

	private By blockLoc = By.xpath("//div[@class='panel panel-primary']");
	private By stateIpLoc = By.xpath("descendant::input[@class='select2-search__field']");
	private By stateOpt = By.xpath("//li[@class='select2-results__option']");
	
	private WebElement blockElement;

	public SelectMultipleValuesBlockImpl(WebDriver driver) {
		this.driver = driver;
		blockElement = driver.findElements(blockLoc).get(1);
	}

	public SelectMultipleValuesBlock selectState(String... states) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		
		for (String state : states) {
			blockElement.findElement(stateIpLoc).click();
			
			List<WebElement> statesList = driver.findElements(stateOpt);
			for (WebElement stateElement : statesList) {
				if (stateElement.getText().equalsIgnoreCase(state)) {
					stateElement.click();
					break;
				}
			}
		}
		return this;
	}

	public String getSelectedState() {
		By stateSelectLoc = By.xpath("descendant::li[@class='select2-selection__choice']");
		List<WebElement> listOfSelectedStates = blockElement.findElements(stateSelectLoc);
		List<String> selectedStates = new ArrayList<String>();
		for(WebElement state : listOfSelectedStates) {
			selectedStates.add(state.getText().replace("×", ""));
		}
		return selectedStates.toString();
	}

}
