package com.pandeys.seleasy;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumEasyFooterImpl implements SeleniumEasyFooter{
	private WebDriver driver;
	
	private By tutorialsLoc = By.xpath("//div[child::h4[text()='Tutorials Menu']]/descendant::a");
	
	public SeleniumEasyFooterImpl(WebDriver driver) {
		this.driver = driver;
	}
	
	public List<String> getTutorialsMenuItems(){
		List<String> listOfTutorialMenuItems = new ArrayList<String>();
		List<WebElement> listOfTutorialElements = driver.findElements(tutorialsLoc);
		for(WebElement webElement : listOfTutorialElements) {
			listOfTutorialMenuItems.add(webElement.getText().trim());
		}
		return listOfTutorialMenuItems;
	}
	
	public List<String> getPopularPostsItems(){
		By popularPostLoc = By.xpath("//div[h4[text()='Popular Posts']]/descendant::a");
		List<String> listOfPopularPostItems = new ArrayList<String>();
		List<WebElement> listOfPostElement = driver.findElements(popularPostLoc);
		for(WebElement webElement : listOfPostElement) {
			listOfPopularPostItems.add(webElement.getText().trim());
		}
		return listOfPopularPostItems;
	}
}
