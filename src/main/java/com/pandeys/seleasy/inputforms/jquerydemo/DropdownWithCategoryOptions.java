package com.pandeys.seleasy.inputforms.jquerydemo;

import java.util.List;

import org.openqa.selenium.WebDriver;

public interface DropdownWithCategoryOptions {
	String getBlockHeaders();
	
	String getDropdownLabel();
	
	List<String> getCategories();
	
	DropdownWithCategoryOptions selectFileOption(String fileOption);
	
	List<String> getAllFileOptions();
	
	List<String> getFileOptionsForCategory(String category);
	
	String getSelectedFileOption();
}
