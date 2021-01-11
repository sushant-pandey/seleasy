package com.pandeys.seleasy.inputforms.jquerydemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownWithCategoryOptionsImpl implements DropdownWithCategoryOptions {

	private WebDriver driver;

	private By blockLoc = By.xpath("//div[@class='panel panel-primary']");
	private By stateIpLoc = By.xpath("descendant::input[@class='select2-search__field']");
	private By stateOpt = By.xpath("//li[@class='select2-results__option']");
	
	private WebElement blockElement;

	public DropdownWithCategoryOptionsImpl(WebDriver driver) {
		this.driver = driver;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		blockElement = driver.findElements(blockLoc).get(3);
	}

	@Override
	public String getBlockHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDropdownLabel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DropdownWithCategoryOptions selectFileOption(String fileOption) {
		Select select = new Select(driver.findElement(By.id("files")));
		select.selectByVisibleText(fileOption);
		return this;
	}

	@Override
	public List<String> getAllFileOptions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getFileOptionsForCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSelectedFileOption() {
		Select select = new Select(driver.findElement(By.id("files")));
		return select.getFirstSelectedOption().getText();
	}

}
