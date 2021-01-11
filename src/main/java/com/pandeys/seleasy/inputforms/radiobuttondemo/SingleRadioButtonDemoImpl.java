package com.pandeys.seleasy.inputforms.radiobuttondemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SingleRadioButtonDemoImpl implements SingleRadioButtonDemo {

	private WebDriver driver;

	private By singleRadioBtnBlockLoc = By.xpath("//div[@id='easycont']/div/div[2]/div[@class='panel panel-default']");
	private WebElement singleRadioBtnBlock;

	public SingleRadioButtonDemoImpl(WebDriver driver) {
		this.driver = driver;
		singleRadioBtnBlock = driver.findElement(singleRadioBtnBlockLoc);
	}

	@Override
	public String getBlockHeader() {
		return singleRadioBtnBlock.findElement(By.xpath("child::div[@class='panel-heading']")).getText();
	}

	@Override
	public String getInstructionMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SingleRadioButtonDemo selectMaleOption() {
		WebElement maleRadioBtn = 
				singleRadioBtnBlock.findElement(By.xpath("descendant::input[@value = 'Male']"));
		maleRadioBtn.click();
		return this;
	}

	@Override
	public SingleRadioButtonDemo selectFemaleOption() {
		WebElement maleRadioBtn = 
				singleRadioBtnBlock.findElement(By.xpath("descendant::input[@value = 'Female']"));
		maleRadioBtn.click();
		return this;
	}

	@Override
	public SingleRadioButtonDemo clickGetCheckedValue() {
		WebElement getCheckedBtn = 
				singleRadioBtnBlock.findElement(By.xpath("descendant::button[@id = 'buttoncheck']"));
		getCheckedBtn.click();
		return this;
	}

	@Override
	public String getDisplayedResult() {
		WebElement displayedResult = 
				singleRadioBtnBlock.findElement(By.xpath("descendant::p[@class = 'radiobutton']"));
		return displayedResult.getText();
	}

}
