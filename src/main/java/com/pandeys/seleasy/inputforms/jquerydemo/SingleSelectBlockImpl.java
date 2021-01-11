package com.pandeys.seleasy.inputforms.jquerydemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingleSelectBlockImpl implements SingleSelectBlock {

	private WebDriver driver;

	private By singleSelectDivLoc = By.xpath("//div[@class='col-md-6 text-left']/div[0]");
	private By blockLoc = By.xpath("//div[@class='panel panel-primary']");
	private WebElement blockElement;
	
	public SingleSelectBlockImpl(WebDriver driver) {
		this.driver = driver;
		blockElement = driver.findElements(blockLoc).get(0);
	}

	@Override
	public String getBlockHeader() {
		return blockElement.findElement(By.xpath("descendant::h3")).getText();
	}

	@Override
	public SingleSelectBlock selectValue(String dropdownOption) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		By downArrow = By.xpath("descendant::span[@role = 'presentation']/b");
		By dropdownOptionsLoc = By.xpath("//li[@class='select2-results__option']");
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		blockElement.findElement(downArrow).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(dropdownOptionsLoc));
		for(WebElement li : driver.findElements(dropdownOptionsLoc)) {
			if(li.getText().equalsIgnoreCase(dropdownOption)) {
				li.click();
				break;
			}
		}
		return this;
	}

	@Override
	public String getSelectedValue() {
		By selectionRendered = By.xpath("descendant::span[@class = 'select2-selection__rendered']");
		return blockElement.findElement(selectionRendered).getText();
	}

	
}
