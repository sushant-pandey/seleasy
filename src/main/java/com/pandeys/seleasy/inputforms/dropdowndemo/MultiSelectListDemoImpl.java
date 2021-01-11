package com.pandeys.seleasy.inputforms.dropdowndemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListDemoImpl implements MultiSelectListDemo {

	private WebDriver driver;
	
	private By multiselectBlockLoc = By.xpath("//div[@id='easycont']/div/div[2]/div[@class='panel panel-default']");
	private WebElement multiSelectBlock;
	
	public MultiSelectListDemoImpl(WebDriver driver) {
		this.driver = driver;
		multiSelectBlock = driver.findElements(multiselectBlockLoc).get(1);
	}

	@Override
	public String getBlockHeader() {
		return multiSelectBlock.findElement(By.className("panel-heading")).getText();
	}

	@Override
	public String getInstructionText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MultiSelectListDemo selectTheValues(String... values) {
		Select multiselect = new Select(multiSelectBlock.findElement(By.xpath("descendant::select[@id='multi-select']")));
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).build().perform();
		multiselect.selectByVisibleText(values[0]);
		for(int i = 1; i < values.length; i++) {
			actions = actions.click(multiSelectBlock.findElement(By.xpath("descendant::option[text()='"+values[i]+"']")));
		}
		actions.keyUp(Keys.CONTROL).build().perform();
		return this;
	}

	@Override
	public MultiSelectListDemo clickFirstSelected() {
		multiSelectBlock.findElement(By.xpath("descendant::button[@id='printMe']")).click();
		return this;
	}

	@Override
	public MultiSelectListDemo clickGetAllSelected() {
		multiSelectBlock.findElement(By.xpath("descendant::button[@id='printAll']")).click();
		return this;
	}

	@Override
	public String getDisplayedResult() {
		return multiSelectBlock.findElement(By.xpath("descendant::p[@class='getall-selected']")).getText();
	}

}
