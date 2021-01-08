package com.pandeys.seleasy.inputforms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputForm {
	private WebDriver driver;
	
	private By simpleFormDemoLinkLoc = By.linkText("Simple Form Demo");
	private By checkBoxDemoLinkLoc = By.linkText("Checkbox Demo");
	private By radioButtonsDemoLinkLoc = By.linkText("Radio Buttons Demo");
	private By selectDropdownListLinkLoc = By.linkText("Select Dropdown List");
	private By inputFormSubmitLinkLoc = By.linkText("Input Form Submit");
	private By ajaxFormSubmitLinkLoc = By.linkText("Ajax Form Submit");
	private By jQuerySelectDropdownLinkLoc = By.linkText("JQuery Select dropdown");
	
	public InputForm(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(simpleFormDemoLinkLoc));
		this.driver = driver;
	}
	
	public SimpleFormDemo getSimpleFormDemo() {
		driver.findElement(simpleFormDemoLinkLoc).click();
		return new SimpleFormDemoImpl(driver);
	}
	
	public CheckboxDemo getCheckboxDemo() {
		driver.findElement(checkBoxDemoLinkLoc).click();
		return new CheckboxDemoImpl();
	}
	
	public RadioButtonsDemo getRadioButtonsDemo() {
		driver.findElement(radioButtonsDemoLinkLoc).click();
		return new RadioButtonsDemoImpl();
	}
	
	public SelectDropdownList getSelectDropdownList() {
		driver.findElement(selectDropdownListLinkLoc).click();
		return new SelectDropdownListImpl();
	}
	
	public InputFormSubmit getInputFormSubmit() {
		driver.findElement(inputFormSubmitLinkLoc).click();
		return new InputFormSubmitImpl();
	}
	
	public AjaxFormSubmit getAjaxFormSubmit() {
		driver.findElement(ajaxFormSubmitLinkLoc).click();
		return new AjaxFormSubmitImpl();
	}
	
	public JQuerySelectDropdown getJQuerySelectDropdown() {
		driver.findElement(jQuerySelectDropdownLinkLoc).click();
		return new JQuerySelectDropdownImpl();
	}
}
