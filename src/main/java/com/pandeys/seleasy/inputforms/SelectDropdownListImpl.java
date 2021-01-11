package com.pandeys.seleasy.inputforms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pandeys.seleasy.inputforms.dropdowndemo.MultiSelectListDemo;
import com.pandeys.seleasy.inputforms.dropdowndemo.MultiSelectListDemoImpl;
import com.pandeys.seleasy.inputforms.dropdowndemo.SelectListDemo;
import com.pandeys.seleasy.inputforms.dropdowndemo.SelectListDemoImpl;

public class SelectDropdownListImpl implements SelectDropdownList {
	
	private WebDriver driver;
	
	private By selectFrameLoc = By.xpath("//div[@id='easycont']/div/div[2]");
	private WebElement selectFrame ;
	
	public SelectDropdownListImpl(WebDriver driver) {
		this.driver = driver;
		selectFrame = driver.findElement(selectFrameLoc);
	}
	
	@Override
	public String getPageHeader() {
		return selectFrame.findElement(By.tagName("h3")).getText();
	}

	@Override
	public SelectListDemo getSelectListDemo() {
		return new SelectListDemoImpl(driver);
	}

	@Override
	public MultiSelectListDemo getMultiSelectListDemo() {
		return new MultiSelectListDemoImpl(driver);
	}

}
