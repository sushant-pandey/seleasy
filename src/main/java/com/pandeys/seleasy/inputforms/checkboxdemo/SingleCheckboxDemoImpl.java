package com.pandeys.seleasy.inputforms.checkboxdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingleCheckboxDemoImpl implements SingleCheckboxDemo {
	private WebDriver driver;
	
	private By panelLoc = By.xpath("//div[@id='easycont']/div/div[2]/div[@class='panel panel-default']");
	private WebElement singleCheckboxBlock ;
	
	public SingleCheckboxDemoImpl(WebDriver driver) {
		this.driver = driver;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(panelLoc));
		singleCheckboxBlock = driver.findElement(panelLoc);
	}

	@Override
	public String getBlockHeader() {
		return singleCheckboxBlock.findElement(By.className("panel-heading")).getText();
	}

	@Override
	public String getBlockHelpText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCheckboxLabel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SingleCheckboxDemo selectCheckbox() {
		WebElement checkBox = singleCheckboxBlock.findElement(By.id("isAgeSelected"));
		if(!checkBox.isSelected()) {
			checkBox.click();
		}
		return this;
	}

	@Override
	public Boolean isCheckboxSelected() {
		WebElement checkBox = singleCheckboxBlock.findElement(By.id("isAgeSelected"));
		return checkBox.isSelected();
	}

}
