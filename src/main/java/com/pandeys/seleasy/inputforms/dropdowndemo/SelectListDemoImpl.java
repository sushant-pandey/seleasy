package com.pandeys.seleasy.inputforms.dropdowndemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectListDemoImpl implements SelectListDemo {

	private WebDriver driver;
	
	private By selectListBlockLoc = By.xpath("//div[@id='easycont']/div/div[2]/div[@class='panel panel-default']");
	private WebElement selectListBlock ;
	
	public SelectListDemoImpl(WebDriver driver) {
		this.driver = driver;
		selectListBlock = driver.findElements(selectListBlockLoc).get(0);
	}

	@Override
	public String getBlockHeader() {
		return selectListBlock.findElement(By.className("panel-heading")).getText();
	}

	@Override
	public String getHelpText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String dropdownLabel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SelectListDemo selectDropdownValue(String dropDownValue) {
		Select singleDropDown = new Select(selectListBlock.findElement(By.xpath("descendant::select[@id='select-demo']")));
		singleDropDown.selectByVisibleText(dropDownValue);
		return this;
	}

	@Override
	public String getDisplayedResult() {
		return selectListBlock.findElement(By.xpath("descendant::p[@class='selected-value']")).getText();
	}

}
