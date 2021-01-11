package com.pandeys.seleasy.inputforms.checkboxdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleCheckboxDemoImpl implements MultipleCheckboxDemo {
	private WebDriver driver;
	
	private By panelLoc = By.xpath("//div[@id='easycont']/div/div[2]/div[@class='panel panel-default']");
	private WebElement multiCheckboxBlock ;
	
	public MultipleCheckboxDemoImpl(WebDriver driver) {
		this.driver = driver;
		this.driver = driver;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(panelLoc));
		multiCheckboxBlock = driver.findElements(panelLoc).get(1);
	}

	@Override
	public String getBlockHeader() {
		return multiCheckboxBlock.findElement(By.className("panel-heading")).getText();
	}

	@Override
	public String getBlockHelpText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getHelpTextPoint1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getHelpTextPoint2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getHelpTextPoint3() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLabelForCheckbox1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MultipleCheckboxDemo selectCheckbox1() {
		List<WebElement> listOfCheckbox = multiCheckboxBlock.findElements(By.xpath("descendant::input[@type='checkbox']"));
		WebElement checkBox1 = listOfCheckbox.get(0);
		if(!checkBox1.isSelected()) {
			checkBox1.click();
		}
		return this;
	}

	@Override
	public Boolean isCheckbox1Selected() {
		return multiCheckboxBlock.findElements(By.xpath("descendant::input[@type='checkbox']")).get(0).isSelected();
	}

	@Override
	public String getLabelForCheckbox2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MultipleCheckboxDemo selectCheckbox2() {
		List<WebElement> listOfCheckbox = multiCheckboxBlock.findElements(By.xpath("descendant::input[@type='checkbox']"));
		WebElement checkBox2 = listOfCheckbox.get(1);
		if(!checkBox2.isSelected()) {
			checkBox2.click();
		}
		return this;
	}

	@Override
	public Boolean isCheckbox2Selected() {
		return multiCheckboxBlock.findElements(By.xpath("descendant::input[@type='checkbox']")).get(1).isSelected();
	}

	@Override
	public String getLabelForCheckbox3() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MultipleCheckboxDemo selectCheckbox3() {
		List<WebElement> listOfCheckbox = multiCheckboxBlock.findElements(By.xpath("descendant::input[@type='checkbox']"));
		WebElement checkBox3 = listOfCheckbox.get(2);
		if(!checkBox3.isSelected()) {
			checkBox3.click();
		}
		return this;
	}

	@Override
	public Boolean isCheckbox3Selected() {
		return multiCheckboxBlock.findElements(By.xpath("descendant::input[@type='checkbox']")).get(2).isSelected();
	}

	@Override
	public String getLabelForCheckbox4() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MultipleCheckboxDemo selectCheckbox4() {
		List<WebElement> listOfCheckbox = multiCheckboxBlock.findElements(By.xpath("descendant::input[@type='checkbox']"));
		WebElement checkBox4 = listOfCheckbox.get(3);
		if(!checkBox4.isSelected()) {
			checkBox4.click();
		}
		return this;
	}

	@Override
	public Boolean isCheckbox4Selected() {
		return multiCheckboxBlock.findElements(By.xpath("descendant::input[@type='checkbox']")).get(3).isSelected();
	}

	@Override
	public MultipleCheckboxDemo checkAll() {
		WebElement checkAllBtn = multiCheckboxBlock.findElement(By.xpath("descendant::input[@value='Check All']"));
		checkAllBtn.click();
		return this;
	}

	@Override
	public MultipleCheckboxDemo uncheckAll() {
		WebElement checkAllBtn = multiCheckboxBlock.findElement(By.xpath("descendant::input[@value='Uncheck All']"));
		checkAllBtn.click();
		return this;
	}

}
