package com.pandeys.seleasy.inputforms.radiobuttondemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GroupRadioButtonsDemoImpl implements GroupRadioButtonsDemo {

	private WebDriver driver;
	
	private By groupRadioBtnBlockLoc = By.xpath("//div[@id='easycont']/div/div[2]/div[@class='panel panel-default']");
	private WebElement groupRadioBtnBlock;
	
	public GroupRadioButtonsDemoImpl(WebDriver driver) {
		this.driver = driver;
		groupRadioBtnBlock = driver.findElements(groupRadioBtnBlockLoc).get(1);
	}

	@Override
	public String getBlockHeader() {
		return groupRadioBtnBlock.findElement(By.xpath("child::div[@class='panel-heading']")).getText();
	}

	@Override
	public String getInstructionText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GroupRadioButtonsDemo selectMaleOption() {
		WebElement maleRadioBtn = 
				groupRadioBtnBlock.findElement(By.xpath("descendant::input[@value = 'Male']"));
		maleRadioBtn.click();
		return this;
	}

	@Override
	public GroupRadioButtonsDemo selectFemaleOption() {
		WebElement maleRadioBtn = 
				groupRadioBtnBlock.findElement(By.xpath("descendant::input[@value = 'Female']"));
		maleRadioBtn.click();
		return this;
	}

	@Override
	public GroupRadioButtonsDemo select0_5AgeGroupOption() {
		WebElement age0_5RadioBtn = 
				groupRadioBtnBlock.findElement(By.xpath("descendant::input[@value = '0 - 5']"));
		age0_5RadioBtn.click();
		return this;
	}

	@Override
	public GroupRadioButtonsDemo select5_15AgeGroupOption() {
		WebElement age5_15RadioBtn = 
				groupRadioBtnBlock.findElement(By.xpath("descendant::input[@value = '5 - 15']"));
		age5_15RadioBtn.click();
		return this;
	}

	@Override
	public GroupRadioButtonsDemo select15_50AgeGroupOption() {
		WebElement age15_50RadioBtn = 
				groupRadioBtnBlock.findElement(By.xpath("descendant::input[@value = '15 - 50']"));
		age15_50RadioBtn.click();
		return this;
	}

	@Override
	public GroupRadioButtonsDemo clickGetValues() {
		WebElement getCheckedBtn = 
				groupRadioBtnBlock.findElement(By.xpath("descendant::button[text()='Get values']"));
		getCheckedBtn.click();
		return this;
	}

	@Override
	public String getDisplayedSexResult() {
		WebElement displayedResult = 
				groupRadioBtnBlock.findElement(By.xpath("descendant::p[@class='groupradiobutton']"));
		return displayedResult.getText().split("\\r?\\n")[0];
	}

	@Override
	public String getDisplayedAgeResult() {
		WebElement displayedResult = 
				groupRadioBtnBlock.findElement(By.xpath("descendant::p[@class='groupradiobutton']"));
		return displayedResult.getText().split("\\r?\\n")[1];
	}

}
