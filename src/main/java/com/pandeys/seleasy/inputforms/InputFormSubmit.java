package com.pandeys.seleasy.inputforms;

public interface InputFormSubmit {
	String getPageHeader();
	
	InputFormSubmit enterFirstName(String firstName);
	
	String getFirstNameLabel();
	
	InputFormSubmit enterLastName(String lastName);
	
	String getLastNameLabel();
	
	InputFormSubmit enterEmailAddress(String emailAddress);
	
	String getEmailAddressLabel();
	
	InputFormSubmit enterPhoneNumber(String phoneNumber);
	
	String getPhoneNumberLabel();
	
	InputFormSubmit enterAddress(String address);
	
	String getAddressLabel();
	
	InputFormSubmit enterCity(String city);
	
	String getCityLabel();
	
	InputFormSubmit selectState(String state);
	
	String getStateSelectionLabel();
	
	InputFormSubmit enterZipCode(String zipCode);
	
	String getZipCodeLabel();
	
	InputFormSubmit enterWebsiteOrDomainName(String domainName);
	
	String getWebsiteorDomainNameLabel();
	
	String getHostingSelectionLabel();
	
	InputFormSubmit selectHostingAsYes();
	
	InputFormSubmit selectHostingAsNo();
	
	String getProjectDescriptionLabel();
	
	InputFormSubmit enterProjectDescription(String projDescription);
	
	InputFormSubmit clickSend();
}
