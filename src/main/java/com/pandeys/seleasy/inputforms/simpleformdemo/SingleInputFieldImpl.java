package com.pandeys.seleasy.inputforms.simpleformdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SingleInputFieldImpl implements SingleInputField {
	private WebDriver driver;
	
	private By singleInputDivLoc = By.xpath("//div[@id = 'easycont']/div[@class='row']/div[2]/div[@class='panel panel-default']");
	
	private WebElement singleInputDiv ;
	
	public SingleInputFieldImpl(WebDriver driver) {
		this.driver = driver;
		singleInputDiv = driver.findElement(singleInputDivLoc);
	}

	@Override
	public String getBlockHeader() {
		return singleInputDiv.findElement(By.className("panel-heading")).getText();
	}

	@Override
	public String getHelpText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTextBoxLabel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void enterMessage(String message) {
		By messageBoxLoc = By.id("user-message");
		singleInputDiv.findElement(messageBoxLoc).sendKeys(message);
	}

	@Override
	public void submitMessage() {
		By showMessageBtnLoc = By.xpath("descendant::button[text()='Show Message']");
		singleInputDiv.findElement(showMessageBtnLoc).click();
	}

	@Override
	public String getDisplayedMessage() {
		By displayedMessageLoc = By.xpath("descendant::div[@id='user-message']");
		return driver.findElement(displayedMessageLoc).getText();
	}

}
