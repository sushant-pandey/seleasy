package com.pandeys.seleasy.inputforms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pandeys.seleasy.inputforms.radiobuttondemo.GroupRadioButtonsDemo;
import com.pandeys.seleasy.inputforms.radiobuttondemo.GroupRadioButtonsDemoImpl;
import com.pandeys.seleasy.inputforms.radiobuttondemo.SingleRadioButtonDemo;
import com.pandeys.seleasy.inputforms.radiobuttondemo.SingleRadioButtonDemoImpl;

public class RadioButtonsDemoImpl implements RadioButtonsDemo {

	private WebDriver driver;
	
	private By radioDemoDivLoc = By.id("easycont");
	WebElement radioDemoDiv ;
	
	public RadioButtonsDemoImpl(WebDriver driver) {
		this.driver = driver;
		radioDemoDiv = driver.findElement(radioDemoDivLoc);
	}
	
	@Override
	public String getPageHeader() {
		String radioDemoHeader = radioDemoDiv.findElement(By.xpath("descendant::h3")).getText();
		return radioDemoHeader;
	}

	@Override
	public String getPageHelpText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SingleRadioButtonDemo getSingleRadioButtonDemo() {
		return new SingleRadioButtonDemoImpl(driver);
	}

	@Override
	public GroupRadioButtonsDemo getGroupRadioButtonsDemo() {
		return new GroupRadioButtonsDemoImpl(driver);
	}

}
