package com.pandeys.seleasy.inputforms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class InputFormSubmitImpl implements InputFormSubmit {

	private WebDriver driver;
	
	private By firstNameIpLoc = By.name("first_name");
	
	public InputFormSubmitImpl(WebDriver driver) {
		this.driver = driver;
	}

	@Override
	public String getPageHeader() {
		new RuntimeException("Method not yet implemented");
		return null;
	}

	@Override
	public InputFormSubmit enterFirstName(String firstName) {
		driver.findElement(firstNameIpLoc).sendKeys(firstName);
		return this;
	}

	@Override
	public String getFirstNameLabel() {
		new RuntimeException("Method not yet implemented");
		return null;
	}

	@Override
	public InputFormSubmit enterLastName(String lastName) {
		By lastNameIpLoc = By.name("last_name");
		driver.findElement(lastNameIpLoc).sendKeys(lastName);
		return this;
	}

	@Override
	public String getLastNameLabel() {
		new RuntimeException("Method not yet implemented");
		return null;
	}

	@Override
	public InputFormSubmit enterEmailAddress(String emailAddress) {
		By emailIpLoc = By.name("email");
		driver.findElement(emailIpLoc).sendKeys(emailAddress);
		return this;
	}

	@Override
	public String getEmailAddressLabel() {
		new RuntimeException("Method not yet implemented");
		return null;
	}

	@Override
	public InputFormSubmit enterPhoneNumber(String phoneNumber) {
		By phoneNumLoc = By.name("phone");
		driver.findElement(phoneNumLoc).sendKeys(phoneNumber);
		return this;
	}

	@Override
	public String getPhoneNumberLabel() {
		new RuntimeException("Method not yet implemented");
		return null;
	}

	@Override
	public InputFormSubmit enterAddress(String address) {
		By addressLoc = By.name("address");
		driver.findElement(addressLoc).sendKeys(address);
		return this;
	}

	@Override
	public String getAddressLabel() {
		new RuntimeException("Method not yet implemented");
		return null;
	}

	@Override
	public InputFormSubmit enterCity(String city) {
		By cityLoc = By.name("city");
		driver.findElement(cityLoc).sendKeys(city);
		return this;
	}

	@Override
	public String getCityLabel() {
		new RuntimeException("Method not yet implemented");
		return null;
	}

	@Override
	public InputFormSubmit selectState(String state) {
		By stateDDLoc = By.name("state");
		Select stateSelect = new Select(driver.findElement(stateDDLoc));
		stateSelect.selectByVisibleText(state);
		return this;
	}

	@Override
	public String getStateSelectionLabel() {
		new RuntimeException("Method not yet implemented");
		return null;
	}

	@Override
	public InputFormSubmit enterZipCode(String zipCode) {
		By zipCodeIpLoc = By.name("zip");
		driver.findElement(zipCodeIpLoc).sendKeys(zipCode);
		return this;
	}

	@Override
	public String getZipCodeLabel() {
		new RuntimeException("Method not yet implemented");
		return null;
	}

	@Override
	public InputFormSubmit enterWebsiteOrDomainName(String domainName) {
		By domainNameIpLoc = By.name("website");
		driver.findElement(domainNameIpLoc).sendKeys(domainName);
		return this;
	}

	@Override
	public String getWebsiteorDomainNameLabel() {
		new RuntimeException("Method not yet implemented");
		return null;
	}

	@Override
	public String getHostingSelectionLabel() {
		new RuntimeException("Method not yet implemented");
		return null;
	}

	@Override
	public InputFormSubmit selectHostingAsYes() {
		By radioYesLoc = By.xpath("//input[@type='radio'][@value='yes']");
		driver.findElement(radioYesLoc).click();
		return this;
	}

	@Override
	public InputFormSubmit selectHostingAsNo() {
		By radioNoLoc = By.xpath("//input[@type='radio'][@value='no']");
		driver.findElement(radioNoLoc).click();
		return this;
	}

	@Override
	public String getProjectDescriptionLabel() {
		new RuntimeException("Method not yet implemented");
		return null;
	}

	@Override
	public InputFormSubmit enterProjectDescription(String projDescription) {
		By projDescLoc = By.name("comment");
		driver.findElement(projDescLoc).sendKeys(projDescription);
		return this;
	}

	@Override
	public InputFormSubmit clickSend() {
		By sendBtnLoc = By.xpath("//button[@type='submit']");
		driver.findElement(sendBtnLoc).click();
		return this;
	}
	
}
